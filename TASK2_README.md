# Task 2: Soot-Based Line Coverage Tool

## Overview
This tool uses Soot to instrument the CUT (`comp5111.assignment.cut.Subject` and all inner classes) and measures line coverage of JUnit test suites.

## Prerequisites
- Java 11 (SE)
- All required libraries are in `lib/`

## One-Click Script

### Run on the example test suite (default):
```bash
./scripts/run_line_coverage.sh
```

### Run on a specific test suite:
```bash
./scripts/run_line_coverage.sh <test-class-name> <test-source-dir>
```

### Example:
```bash
# Example test suite
./scripts/run_line_coverage.sh comp5111.assignment.cut.Regression_6_Test src/test/example_test

# Randoop test suite 0
./scripts/run_line_coverage.sh comp5111.assignment.cut.Regression_0_Test src/test/randoop0
```

## Output
- **Report file**: `line-coverage-report.txt` (generated in the project root)
- **Instrumented classes**: `sootOutput/` directory

## Report Format
The report contains:
1. **Overview section**: Overall line coverage percentage and per-class breakdown (total lines, covered lines, percentage)
2. **Details section**: Per-class, per-method line coverage with Covered/Missing status and Jimple statement information for each line

## Source Code
- `src/main/java/comp5111/assignment/LineCoverageInstrumenter.java` - Soot instrumentation logic
- `src/main/java/comp5111/assignment/CoverageTracker.java` - Runtime coverage tracking and report generation
- `src/main/java/comp5111/assignment/TestRunner.java` - JUnit test runner with coverage report
- `src/main/java/comp5111/assignment/Assignment1.java` - Main entry point for instrumentation

## How It Works
1. **Instrumentation**: Soot loads the CUT bytecode, inserts `CoverageTracker.cover(className, lineNumber)` calls before each non-identity statement, and writes instrumented classes to `sootOutput/`.
2. **Metadata**: Line metadata (class, line number, method signature, Jimple statements) is saved to `coverage-metadata.dat` during instrumentation.
3. **Test Execution**: The TestRunner loads the metadata, runs JUnit tests with instrumented classes on the classpath, and generates the coverage report.
