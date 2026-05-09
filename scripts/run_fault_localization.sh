#!/bin/bash
# Task 2: stmt-level Soot FL + Ochiai. Default runs all 4 suites;
# pass a suite name (e.g. randoop0) to run only that one.

set -e

export JAVA_HOME=${JAVA_HOME:-/usr/lib/jvm/java-11-openjdk-amd64}
export PATH=$JAVA_HOME/bin:$PATH

PROJECT_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_ROOT"

ALL_SUITES=(randoop0 randoop1 evosuite0 evosuite1)
if [[ $# -ge 1 ]]; then
    SUITES=("$@")
else
    SUITES=("${ALL_SUITES[@]}")
fi

# 1/5: compile the CUT with -g so Soot can see line numbers.
echo "[1/5] Compiling CUT..."
mkdir -p target/classes
javac -g -d target/classes -cp "lib/*" src/main/java/comp5111/assignment/cut/Subject.java

# 2/5: compile FL tool.
echo "[2/5] Compiling FL tool..."
javac -g -d target/classes -cp "target/classes:lib/*" \
  src/main/java/comp5111/assignment/SpectrumTracker.java \
  src/main/java/comp5111/assignment/StatementInstrumenter.java \
  src/main/java/comp5111/assignment/Assignment2.java \
  src/main/java/comp5111/assignment/SpectrumRunner.java \
  src/main/java/comp5111/assignment/OchiaiAnalyzer.java

# 3/5: instrument once, reused for every suite.
echo "[3/5] Soot instrumentation..."
rm -rf sootOutput
java -cp "target/classes:lib/*" comp5111.assignment.Assignment2 target/classes sootOutput

# 4/5 + 5/5: per suite, compile tests, run, write spectrum tsv.
for suite in "${SUITES[@]}"; do
    SUITE_DIR="src/test/fault-revealing-${suite}"
    if [[ ! -d "$SUITE_DIR" ]]; then
        echo ">>> SKIP: $SUITE_DIR not found"
        continue
    fi
    echo
    echo "=== Suite: $suite ==="

    OUT_TC="target/test-classes-${suite}"
    rm -rf "$OUT_TC"; mkdir -p "$OUT_TC"

    echo "[4/5] Compiling tests under $SUITE_DIR..."
    javac -g -d "$OUT_TC" -cp "target/classes:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:lib/evosuite-1.2.0.jar" \
      ${SUITE_DIR}/comp5111/assignment/cut/*.java

    # Top-level test classes only (skip the inner-class .class files).
    TEST_CLASSES=$(cd "$OUT_TC" && find comp5111 -name '*.class' \
        | grep -v '\$' \
        | sed 's|/|.|g; s|\.class$||' \
        | paste -sd, -)
    echo "Test classes: $TEST_CLASSES"

    PERTEST="spectrum-pertest-${suite}.dat"
    OUT_TSV="${SUITE_DIR}/spectrum_fl_ochiai_${suite}.tsv"

    echo "[5/5] Running tests on instrumented CUT..."
    java -cp "sootOutput:target/classes:${OUT_TC}:lib/*" \
      comp5111.assignment.SpectrumRunner "$TEST_CLASSES" "$PERTEST"

    echo "[Ochiai] -> $OUT_TSV"
    java -cp "target/classes:lib/*" \
      comp5111.assignment.OchiaiAnalyzer "$OUT_TSV" "$PERTEST"
done

echo
echo "Spectrum reports:"
for suite in "${SUITES[@]}"; do
    F="src/test/fault-revealing-${suite}/spectrum_fl_ochiai_${suite}.tsv"
    [[ -f "$F" ]] && echo "  $F" || true
done
