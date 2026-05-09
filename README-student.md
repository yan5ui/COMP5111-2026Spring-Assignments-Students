# COMP5111 Assignment 2 — Submission

**Author:** Zimo Ji

JDK 11 only (Soot 4.2.1 breaks on newer JDKs). No Maven, just `javac`
and `java` against the jars in `lib/`.

## Environment

```bash
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
```

All commands below assume the project root is the working directory.

## Task 1 — three EvoSuite test suites

```bash
./scripts/run_evosuite_task1.sh
```

Three configurations, six CUT classes each, 600 s budget per class,
six classes launched in parallel inside a configuration:

| Suite                  | criterion                                                                | seed |
|------------------------|--------------------------------------------------------------------------|------|
| `generated-evosuite0`  | BRANCH                                                                   | 0    |
| `generated-evosuite1`  | LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH | 7    |
| `generated-evosuite2`  | LINE:BRANCH                                                              | 42   |

Each `src/test/generated-evosuite{0,1,2}/README.md` records the exact
EvoSuite invocation.

For Eclipse / EclEmma I followed FAQ Q1: added the three jars from
`lib/` to the build path, commented out
`@RunWith(EvoRunner.class) @EvoRunnerParameters(...)`, and removed
`extends *_ESTest_scaffolding`. The six PNGs in `screenshots/` are
the line + branch coverage for each suite.

## Task 2 — Soot fault localization (Ochiai, statement level)

```bash
./scripts/run_fault_localization.sh
```

The script

1. compiles the buggy CUT with `-g`,
2. compiles my FL tool,
3. runs `Assignment2` to insert a `SpectrumTracker.cover(stmtId)`
   probe before every non-identity Jimple statement (output to
   `sootOutput/`),
4. for every `fault-revealing-<suite>/`, runs each `@Test` method
   individually through my `SpectrumRunner` (which uses
   `RunListener` per FAQ Q2) and records, per test, pass/fail plus
   the bitset of statement-ids it executed,
5. computes Ochiai with my `OchiaiAnalyzer` and writes
   `src/test/fault-revealing-<suite>/spectrum_fl_ochiai_<suite>.tsv`.

TSV columns (sorted by score desc, ties by msig then Jimple text):

```
<method-signature>\t<jimple-stmt>\t<ochiai-score>\t<rank>
```

Rank uses the FAQ Q5 formula
`rank(a) = floor((N + M + 1) / 2)`, with `N` the number of stmts with
score strictly greater than `a` and `M` the number with score `≥ a`
including `a`.

The four faults I found and my one-line patches are in
`reports/faults/fault_{205,344,488,615}.txt`. After applying the
four patches, all 1371 tests across the four suites pass.

FL tool source files:

| File                          | Role                                              |
|-------------------------------|---------------------------------------------------|
| `Assignment2.java`            | entry point — runs Soot instrumentation           |
| `StatementInstrumenter.java`  | inserts `cover(stmtId)` probes via Soot           |
| `SpectrumTracker.java`        | per-test bitset + pass/fail registry, persistence |
| `SpectrumRunner.java`         | per-method JUnit runner, dumps per-test data      |
| `OchiaiAnalyzer.java`         | computes scores + ranking, writes the TSV         |

LLM-use report: `reports/LLM/Task2_Report.pdf` (`.tex` source).

## Task 3 — refined test suites

```bash
./scripts/run_refined_fl.sh
```

I added the same four-test class `RefinedAssertions` to every
`fault-revealing-<suite>`, kept the original tests, and re-ran the
FL pipeline. Output:
`src/test/refined-<suite>/spectrum_fl_ochiai_refined_<suite>.tsv`.

Strategy and before/after rank table: `extension_strategy.md` in
each refined directory.

## Task 4 — test-driven LLM code generation

I extracted ten methods (plus one private helper `isOneOf`) from
`Subject.java` into `NewSubject`, kept all signatures byte-identical,
used the fault-fixed implementations as ground truth.

```bash
# 1. compile NewSubject
javac -g -d reports/Task4_Data/build/classes -cp "lib/*" \
    reports/Task4_Data/NewSubject.java

# 2. EvoSuite test suite for NewSubject (one-time, 600 s)
./scripts/run_evosuite_task4.sh

# 3. iterate up to five rounds with the LLM.
#    Needs LLM_API_KEY and LLM_BASE_URL set (any OpenAI-compatible
#    /chat/completions endpoint).
python3 scripts/task4_llm_iterate.py --max-rounds 5
```

Per-round artefacts under `reports/Task4_Data/`:
`prompts/`, `llm_outputs/`, `generated/round_<n>/`, `test_results/`,
`final/NewSubject.java`, `summary.json`.

Analysis: `reports/LLM/Task4_Report.pdf`. Full prompt+response
trace: `reports/LLM/Task4_Iteration_Trace.pdf`.

## Recompiling the PDF reports

The two `.tex` reports use ACM `acmart`. I compile them in the
upstream texlive Docker image:

```bash
docker run --rm -v "$(pwd)":/work -w /work texlive/texlive make best
```

`make best` runs `pdflatex` twice on each report.
`make clean-aux` removes LaTeX intermediates.

## Verifying

```bash
./scripts/verify_all.sh
```

Re-runs Task 2 and Task 3 and prints a side-by-side rank table for
all four faults. I run this whenever I touch `Subject.java` or the
FL tool.

## Packaging

```bash
./scripts/package_submission.sh <studentID> <lastname> <firstname>
```

Produces `comp5111asn2-<studentID>-<lastname>-<firstname>.zip`
without build outputs.
