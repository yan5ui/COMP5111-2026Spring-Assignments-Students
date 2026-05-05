# COMP5111 Assignment 1 — Submission README

**Student:** Zimo Ji
**Student ID:** 21139878
**Email:** zjiag@cse.ust.hk

---

## Project Structure

```
.
├── src/
│   ├── main/java/comp5111/assignment/    # Task 2 source code
│   │   ├── Assignment1.java              # Entry point for instrumentation
│   │   ├── LineCoverageInstrumenter.java # Soot instrumentation logic
│   │   ├── CoverageTracker.java          # Runtime coverage tracker & report generator
│   │   └── TestRunner.java              # JUnit runner with coverage reporting
│   └── test/
│       ├── example_test/                 # TA-provided example test suite
│       ├── randoop0/ – randoop4/         # Task 1.1: five Randoop regression test suites
│       ├── llm_simple/                   # Task 3: simple-prompt generated tests
│       ├── llm_advanced/                 # Task 3: advanced-prompt generated tests
│       └── llm_enhanced/                 # Task 3: enhanced-spec generated tests
├── scripts/
│   └── run_line_coverage.sh              # Task 2: one-click coverage script
├── screenshots/                          # Task 1.2: EclEmma screenshots (10 total)
├── lib/                                  # All required JARs (Soot, JUnit, Randoop, Hamcrest)
├── sootOutput/                           # Instrumented bytecode output (example_test)
├── coverage-metadata.dat                 # Line metadata for example_test run
├── line-coverage-report.txt              # Coverage report output for example_test
├── Task3_Report.pdf                      # Task 3 report
├── TASK2_README.md                       # Detailed Task 2 usage guide
└── SUBMISSION_README.md                  # This file
```

---

## Task 1: Randoop Test Generation

Five regression test suites are in `src/test/randoop0` through `src/test/randoop4`, generated with seeds 0–4 and `--time-limit=300`. Each suite achieves ≥50% line coverage and ≥40% branch coverage (verified with EclEmma, screenshots in `screenshots/`).

---

## Task 2: Soot-Based Line Coverage Tool

### One-Click Script (run from project root)

```bash
# Default: runs on the example test suite
./scripts/run_line_coverage.sh

# Custom test suite
./scripts/run_line_coverage.sh <fully-qualified-test-class> <test-source-dir>

# Examples
./scripts/run_line_coverage.sh comp5111.assignment.cut.Regression_0_Test src/test/randoop0
./scripts/run_line_coverage.sh comp5111.assignment.cut.Regression_6_Test src/test/example_test
```

**Prerequisite:** Java 11. The script defaults `JAVA_HOME` to `/usr/lib/jvm/java-11-openjdk-amd64`; override if needed:
```bash
export JAVA_HOME=/path/to/java11
./scripts/run_line_coverage.sh
```

### Output

| File | Description |
|------|-------------|
| `line-coverage-report.txt` | Coverage report: per-class summary + per-line covered/missing status with source line numbers |
| `sootOutput/` | Instrumented bytecode (regenerated each run) |
| `coverage-metadata.dat` | Line metadata written during instrumentation, read at test runtime |

For full details see **[TASK2_README.md](TASK2_README.md)**.

---

## Task 3: LLM-Based Test Generation

See `Task3_Report.pdf` for the full study. The generated test suites are in:

| Directory | Description |
|-----------|-------------|
| `src/test/llm_simple/` | 41 tests from simple (baseline) prompt — 3 failures |
| `src/test/llm_advanced/` | 65 tests from advanced (few-shot + CoT) prompt — 0 failures |
| `src/test/llm_enhanced/` | 18 tests from enhanced-specification prompt — 0 failures |

LLM used: GPT-5.2 via OpenAI API (Python SDK v2.26.0)

**To run an LLM test suite:**
```bash
./scripts/run_line_coverage.sh comp5111.assignment.cut.LLMAdvancedTest src/test/llm_advanced
```
