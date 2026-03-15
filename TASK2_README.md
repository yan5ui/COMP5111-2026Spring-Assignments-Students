# Task 2: Soot-Based Line Coverage Tool

## Prerequisites

- Java 11 (SE) — the script sets `JAVA_HOME` to `/usr/lib/jvm/java-11-openjdk-amd64` by default; override with `export JAVA_HOME=<path>` if needed
- All required libraries are already in `lib/` (Soot 4.2.1, JUnit 4.12, Hamcrest 1.3)
- Run all commands from the **project root**

---

## Quick Start (One-Click Script)

### Run on the example test suite (default)

```bash
./scripts/run_line_coverage.sh
```

Runs on `comp5111.assignment.cut.Regression_6_Test` (sources in `src/test/example_test`) and writes the report to `line-coverage-report.txt` in the project root.

### Run on a custom test suite

```bash
./scripts/run_line_coverage.sh <fully-qualified-test-class> <test-source-dir>
```

**Examples:**

```bash
# Randoop test suite 0
./scripts/run_line_coverage.sh comp5111.assignment.cut.Regression_0_Test src/test/randoop0

# LLM-generated advanced test suite
./scripts/run_line_coverage.sh comp5111.assignment.cut.LLMAdvancedTest src/test/llm_advanced
```

---

## Output Files

| File | Description |
|------|-------------|
| `line-coverage-report.txt` | Main output — overall and per-class line coverage summary, plus per-line covered/missing status with source line numbers and Jimple statement info |
| `sootOutput/` | Instrumented bytecode (intermediate, regenerated on each run) |
| `coverage-metadata.dat` | Line metadata bridging instrumentation and test execution (auto-regenerated each run) |

---

## Report Format

The report is structured in two parts.

**Part 1 — Summary:**
```
============================================================
Line Coverage Report: <TestClassName>
============================================================
Class: comp5111.assignment.cut.Subject
  Total lines   : N
  Covered lines : N (XX.X%)

Class: comp5111.assignment.cut.Subject$StringAlgorithms
  ...
------------------------------------------------------------
OVERALL: N / N lines covered (XX.X%)
============================================================
```

**Part 2 — Per-line details (one section per class/method):**
```
[comp5111.assignment.cut.Subject$StringAlgorithms]
  Method: boolean startsWithIgnoreCase(String, String)
    Line  75: COVERED   | if str == null ...
    Line  76: MISSING   | return str.toLowerCase()...
  ...
```

---

## Source Code

| File | Role |
|------|------|
| `src/main/java/comp5111/assignment/Assignment1.java` | invokes instrumentation |
| `src/main/java/comp5111/assignment/LineCoverageInstrumenter.java` | loads CUT bytecode, inserts probes, writes to `sootOutput/` |
| `src/main/java/comp5111/assignment/CoverageTracker.java` | records covered lines, persists metadata, generates the report |
| `src/main/java/comp5111/assignment/TestRunner.java` | loads metadata, executes tests via `JUnitCore`, triggers report generation |

---
