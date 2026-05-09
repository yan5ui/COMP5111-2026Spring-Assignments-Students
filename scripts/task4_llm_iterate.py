#!/usr/bin/env python3
# Task 4: drive the LLM iteration loop for NewSubject.
# Reads LLM_API_KEY / LLM_BASE_URL from env, asks the model to implement
# NewSubject from its Javadoc + the EvoSuite test suite, compiles and runs
# JUnit, and on failure feeds the failing tests back for another round
# (up to MAX_ROUNDS). Per-round files land under reports/Task4_Data/.
import argparse
import json
import os
import re
import shutil
import subprocess
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
DATA = ROOT / "reports/Task4_Data"
LIB = ROOT / "lib"
JAVA_HOME = os.environ.get("JAVA_HOME", "/usr/lib/jvm/java-11-openjdk-amd64")
JAVA = f"{JAVA_HOME}/bin/java"
JAVAC = f"{JAVA_HOME}/bin/javac"
TEST_CP = ":".join([
    str(LIB / "junit-4.12.jar"),
    str(LIB / "hamcrest-core-1.3.jar"),
    str(LIB / "evosuite-1.2.0.jar"),
])
MAX_ROUNDS = 5


def read_test_suite():
    """Find the EvoSuite-generated test class file under tests/."""
    candidates = list((DATA / "tests").rglob("*_ESTest.java"))
    if not candidates:
        raise SystemExit("No EvoSuite test suite found yet — run Evosuite first.")
    # Prefer NewSubject_ESTest.java
    for c in candidates:
        if "NewSubject_ESTest" in c.name and "scaffolding" not in c.name:
            return c
    return candidates[0]


def read_scaffolding():
    candidates = list((DATA / "tests").rglob("*_ESTest_scaffolding.java"))
    return candidates[0] if candidates else None


def signatures_block():
    """Read NewSubject.java and produce a 'signatures + javadoc only' block."""
    src = (DATA / "NewSubject.java").read_text()
    out_lines = []
    in_method = False
    brace = 0
    for ln in src.split("\n"):
        stripped = ln.strip()
        if in_method:
            brace += ln.count("{") - ln.count("}")
            if brace <= 0:
                in_method = False
            continue
        if re.match(r"\s*(public|private|protected)\s+(static\s+)?[\w\[\]<>,\s]+\s+\w+\s*\(", ln) and "{" in ln:
            head = ln.split("{")[0].rstrip() + ";"
            out_lines.append(head)
            in_method = True
            brace = ln.count("{") - ln.count("}")
            if brace <= 0:
                in_method = False
            continue
        out_lines.append(ln)
    return "\n".join(out_lines)


def compose_prompt(round_no, prior_code=None, prior_failures=None):
    sigs = signatures_block()
    test_path = read_test_suite()
    tests = test_path.read_text()
    parts = []
    parts.append(
        "You are a Java engineer. Implement the class `comp5111.assignment.cut.NewSubject` "
        "so that every JUnit test in the provided test suite passes.\n\n"
        "Rules:\n"
        " - Output exactly ONE fenced ```java code block containing the FULL contents "
        "of NewSubject.java (package, imports if any, the entire class).\n"
        " - Do NOT modify the test suite. Do NOT add main(). Keep the package and "
        "class name unchanged. Method signatures shown below are mandatory.\n"
        " - Output nothing outside the single code block.\n"
    )
    parts.append("\n=== Method signatures + Javadoc (mandatory shape) ===\n")
    parts.append(sigs)
    parts.append("\n=== EvoSuite-generated test suite (passes against the ground truth) ===\n")
    parts.append(tests)
    if prior_code is not None:
        parts.append("\n=== Your previous implementation (round " + str(round_no - 1) + ") ===\n")
        parts.append(prior_code)
    if prior_failures:
        parts.append("\n=== Test failures observed for that implementation ===\n")
        parts.append(prior_failures)
        parts.append(
            "\nProduce a corrected NewSubject.java that fixes ALL of the failures "
            "above without breaking previously passing tests.\n"
        )
    return "\n".join(parts)


def call_llm(prompt: str, timeout: int = 600,
             model: str = None, base_url: str = None,
             api_key: str = None) -> str:
    # POST to an OpenAI-compatible /chat/completions endpoint. Reads
    # LLM_BASE_URL + LLM_API_KEY from env; model from TASK4_MODEL.
    import json as _json
    import urllib.request
    import urllib.error
    base = base_url or os.environ.get("LLM_BASE_URL")
    key = api_key or os.environ.get("LLM_API_KEY")
    if not base:
        raise SystemExit("LLM_BASE_URL not set in environment")
    if not key:
        raise SystemExit("LLM_API_KEY not set in environment")
    mdl = model or os.environ.get("TASK4_MODEL", "gpt-5.4")
    url = base.rstrip("/") + "/chat/completions"
    body = {
        "model": mdl,
        "messages": [
            {"role": "system",
             "content": "You are a senior Java engineer. Respond with exactly one fenced ```java code block as instructed."},
            {"role": "user", "content": prompt},
        ],
        "temperature": 0.1,
    }
    data = _json.dumps(body).encode("utf-8")
    req = urllib.request.Request(
        url, data=data,
        headers={
            "Authorization": f"Bearer {key}",
            "Content-Type": "application/json",
        },
    )
    try:
        with urllib.request.urlopen(req, timeout=timeout) as resp:
            obj = _json.loads(resp.read().decode("utf-8"))
    except urllib.error.HTTPError as e:
        return f"[HTTP {e.code}]\n" + e.read().decode("utf-8", errors="replace")
    if "choices" not in obj:
        return "[unexpected response]\n" + _json.dumps(obj)[:4000]
    return obj["choices"][0]["message"]["content"]


def extract_code(resp: str) -> str:
    # Pull the first ```java fence; otherwise grab from `package comp5111`.
    m = re.search(r"```(?:java|Java)\s*\n(.*?)```", resp, flags=re.DOTALL)
    if m:
        return m.group(1).strip() + "\n"
    m = re.search(r"(package\s+comp5111[\s\S]+?\n}\s*$)", resp, flags=re.MULTILINE)
    if m:
        return m.group(1).strip() + "\n"
    return resp


def compile_and_test(round_dir: Path, generated_java: Path) -> dict:
    cls_dir = round_dir / "build" / "classes"
    tcls_dir = round_dir / "build" / "test-classes"
    cls_dir.mkdir(parents=True, exist_ok=True)
    tcls_dir.mkdir(parents=True, exist_ok=True)
    test_path = read_test_suite()
    scaffolding = read_scaffolding()
    test_files = [str(test_path)]
    if scaffolding:
        test_files.append(str(scaffolding))

    out = {"compile_ok": False, "run_count": 0, "fail_count": 0, "failures": [], "error": ""}
    # 1) compile NewSubject
    r = subprocess.run(
        [JAVAC, "-g", "-d", str(cls_dir), "-cp", f"{LIB}/*", str(generated_java)],
        capture_output=True, text=True,
    )
    if r.returncode != 0:
        out["error"] = "compile_newsubject:\n" + (r.stderr or r.stdout)
        return out
    # 2) compile test suite against the LLM's NewSubject
    r = subprocess.run(
        [JAVAC, "-g", "-d", str(tcls_dir),
         "-cp", f"{cls_dir}:{TEST_CP}",
         *test_files],
        capture_output=True, text=True,
    )
    if r.returncode != 0:
        out["error"] = "compile_tests:\n" + (r.stderr or r.stdout)
        return out
    out["compile_ok"] = True
    # 3) run tests
    runner = "comp5111.assignment.RunJunitForTask4"
    runner_dir = DATA / "build" / "runner_classes"
    runner_dir.mkdir(parents=True, exist_ok=True)
    runner_src = DATA / "build" / "RunJunitForTask4.java"
    runner_src.parent.mkdir(parents=True, exist_ok=True)
    runner_src.write_text(_RUNNER_SRC)
    rc = subprocess.run(
        [JAVAC, "-d", str(runner_dir), "-cp", TEST_CP, str(runner_src)],
        capture_output=True, text=True,
    )
    if rc.returncode != 0:
        out["error"] = "compile_runner:\n" + (rc.stderr or rc.stdout)
        return out
    test_class_fqn = re.sub(r"^.*?(comp5111[/\.][\w/$.]+)\.java$",
                            lambda m: m.group(1).replace("/", "."),
                            str(test_path).split("tests/")[1])
    test_class_fqn = test_class_fqn.replace("/", ".").replace(".java", "")
    rj = subprocess.run(
        [JAVA, "-cp", f"{runner_dir}:{cls_dir}:{tcls_dir}:{TEST_CP}",
         runner, test_class_fqn],
        capture_output=True, text=True, timeout=300,
    )
    out["raw_stdout"] = rj.stdout[-4000:]
    out["raw_stderr"] = rj.stderr[-2000:]
    m = re.search(r"RUN_COUNT=(\d+)", rj.stdout)
    if m: out["run_count"] = int(m.group(1))
    m = re.search(r"FAIL_COUNT=(\d+)", rj.stdout)
    if m: out["fail_count"] = int(m.group(1))
    failures = re.findall(r"FAILURE>>>(.+?)<<<FAILURE", rj.stdout, flags=re.DOTALL)
    out["failures"] = [f.strip() for f in failures]
    return out


_RUNNER_SRC = """
package comp5111.assignment;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class RunJunitForTask4 {
    public static void main(String[] args) throws Exception {
        JUnitCore j = new JUnitCore();
        Class<?> tc = Class.forName(args[0]);
        Result r = j.run(tc);
        System.out.println("RUN_COUNT=" + r.getRunCount());
        System.out.println("FAIL_COUNT=" + r.getFailureCount());
        for (Failure f : r.getFailures()) {
            System.out.println("FAILURE>>>" + f.getTestHeader() + " :: " + f.getMessage() + "<<<FAILURE");
        }
    }
}
"""


def format_failures_for_prompt(test_result: dict) -> str:
    if test_result.get("error"):
        return "Compilation/test-runner error:\n" + test_result["error"]
    if test_result.get("fail_count", 0) == 0:
        return ""
    lines = [f"{test_result['fail_count']} of {test_result['run_count']} tests failed."]
    for f in test_result.get("failures", [])[:30]:
        lines.append(" - " + f)
    return "\n".join(lines)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--max-rounds", type=int, default=MAX_ROUNDS)
    ap.add_argument("--llm-timeout", type=int, default=600)
    ap.add_argument("--exp", default="",
                    help="Optional experiment subdir name. If set, all output "
                         "files are placed under reports/Task4_Data/<exp>/ "
                         "instead of reports/Task4_Data/. Used for ablations.")
    args = ap.parse_args()

    OUT = DATA / args.exp if args.exp else DATA

    for d in ("prompts", "llm_outputs", "generated", "test_results", "final"):
        (OUT / d).mkdir(parents=True, exist_ok=True)

    summary = []
    prior_code = None
    prior_failures = None
    for rnd in range(1, args.max_rounds + 1):
        prompt = compose_prompt(rnd, prior_code, prior_failures)
        (OUT / f"prompts/round_{rnd}.txt").write_text(prompt)
        print(f"\n=== Round {rnd}: calling LLM (prompt {len(prompt)} chars) ===")
        try:
            resp = call_llm(prompt, timeout=args.llm_timeout)
        except subprocess.TimeoutExpired:
            print(f"  LLM timeout after {args.llm_timeout}s")
            summary.append({"round": rnd, "status": "llm_timeout"})
            break
        (OUT / f"llm_outputs/round_{rnd}.txt").write_text(resp)
        code = extract_code(resp)
        rd = OUT / f"generated/round_{rnd}"
        rd.mkdir(parents=True, exist_ok=True)
        out_java = rd / "NewSubject.java"
        out_java.write_text(code)
        result = compile_and_test(rd, out_java)
        (OUT / f"test_results/round_{rnd}.txt").write_text(json.dumps(result, indent=2))
        print(f"  compile_ok={result['compile_ok']}  run={result['run_count']}  fail={result['fail_count']}")
        summary.append({"round": rnd, **{k: result[k] for k in ("compile_ok", "run_count", "fail_count")}})
        prior_code = code
        prior_failures = format_failures_for_prompt(result)
        if result["compile_ok"] and result["fail_count"] == 0 and result["run_count"] > 0:
            print(f"  All tests pass at round {rnd}; stopping early.")
            break

    final_code = (OUT / f"generated/round_{summary[-1]['round']}/NewSubject.java").read_text()
    (OUT / "final/NewSubject.java").write_text(final_code)
    (OUT / "summary.json").write_text(json.dumps(summary, indent=2))
    print(f"\nDone. Summary: {summary}")

    # Build a detailed per-round report (Markdown) with verbatim prompts + LLM outputs.
    build_detailed_report(summary, OUT, args.exp)


def build_detailed_report(summary, out_dir, exp_name):
    model = os.environ.get('TASK4_MODEL', 'gpt-5.4')
    suffix = f"_{exp_name}" if exp_name else ""
    title_qualifier = f" ({exp_name})" if exp_name else ""
    out = []
    out.append(f"# Task 4 — Per-Round LLM Iteration Trace{title_qualifier}\n")
    out.append("\n**Author:** Zimo Ji\n")
    out.append(
        f"\nPer-round dump of the prompts I sent and the responses I "
        f"received from `{model}` while iterating the test-driven "
        f"code-generation experiment for `NewSubject.java`. Files reproduced "
        f"verbatim from `reports/Task4_Data/{exp_name + '/' if exp_name else ''}"
        f"{{prompts,llm_outputs,test_results}}/`.\n"
    )
    out.append(
        f"\nModel: `{model}`, temperature 0.1, accessed via an "
        f"OpenAI-compatible chat-completions endpoint.\n"
    )
    out.append("\n## Round-by-round summary\n\n")
    out.append("| round | compile_ok | run | fail | pass_rate |\n|---|---|---|---|---|\n")
    for s in summary:
        rc = s.get("run_count", 0); fc = s.get("fail_count", 0)
        pr = (rc - fc) / rc if rc else 0.0
        out.append(f"| {s['round']} | {s.get('compile_ok')} | {rc} | {fc} | {pr:.1%} |\n")
    out.append("\n---\n")
    for s in summary:
        n = s["round"]
        prompt_path = out_dir / f"prompts/round_{n}.txt"
        resp_path = out_dir / f"llm_outputs/round_{n}.txt"
        result_path = out_dir / f"test_results/round_{n}.txt"
        gen_path = out_dir / f"generated/round_{n}/NewSubject.java"
        out.append(f"\n## Round {n}\n")
        if result_path.exists():
            out.append("\n### Test outcome\n\n```json\n")
            out.append(result_path.read_text())
            out.append("\n```\n")
        if prompt_path.exists():
            txt = prompt_path.read_text()
            out.append(f"\n### Prompt sent to LLM ({len(txt)} chars)\n\n```\n")
            out.append(txt)
            out.append("\n```\n")
        if resp_path.exists():
            txt = resp_path.read_text()
            out.append(f"\n### Raw LLM response ({len(txt)} chars)\n\n```\n")
            out.append(txt)
            out.append("\n```\n")
        if gen_path.exists():
            out.append("\n### Extracted NewSubject.java for this round\n\n```java\n")
            out.append(gen_path.read_text())
            out.append("\n```\n")
        out.append("\n---\n")
    trace_path = ROOT / f"reports/LLM/Task4_Iteration_Trace{suffix}.md"
    trace_path.write_text("".join(out))
    print(f"Detailed trace written: {trace_path.relative_to(ROOT)}")


if __name__ == "__main__":
    main()
