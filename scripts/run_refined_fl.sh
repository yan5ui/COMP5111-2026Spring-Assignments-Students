#!/bin/bash
# Task 3: run my FL pipeline on the refined-* suites and write
# spectrum_fl_ochiai_refined_<suite>.tsv into each refined dir.

set -e
export JAVA_HOME=${JAVA_HOME:-/usr/lib/jvm/java-11-openjdk-amd64}
export PATH=$JAVA_HOME/bin:$PATH

PROJECT_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_ROOT"

ALL=(randoop0 randoop1 evosuite0 evosuite1)
if [[ $# -ge 1 ]]; then
    SUITES=("$@")
else
    SUITES=("${ALL[@]}")
fi

# Compile CUT + tools (idempotent).
mkdir -p target/classes
javac -g -d target/classes -cp "lib/*" src/main/java/comp5111/assignment/cut/Subject.java >/dev/null
javac -g -d target/classes -cp "target/classes:lib/*" \
    src/main/java/comp5111/assignment/SpectrumTracker.java \
    src/main/java/comp5111/assignment/StatementInstrumenter.java \
    src/main/java/comp5111/assignment/Assignment2.java \
    src/main/java/comp5111/assignment/SpectrumRunner.java \
    src/main/java/comp5111/assignment/OchiaiAnalyzer.java >/dev/null

# Reuse the previous instrumentation if it's already there.
if [[ ! -d sootOutput || ! -f spectrum-metadata.dat ]]; then
    rm -rf sootOutput
    java -cp "target/classes:lib/*" comp5111.assignment.Assignment2 target/classes sootOutput >/dev/null
fi

for suite in "${SUITES[@]}"; do
    DIR="src/test/refined-${suite}"
    if [[ ! -d "$DIR" ]]; then
        echo ">>> SKIP: $DIR not found"; continue
    fi
    echo "================================================================"
    echo "Refined suite: $suite"
    OUT_TC="target/test-classes-refined-${suite}"
    rm -rf "$OUT_TC"; mkdir -p "$OUT_TC"

    javac -g -d "$OUT_TC" -cp "target/classes:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:lib/evosuite-1.2.0.jar" \
        ${DIR}/comp5111/assignment/cut/*.java

    TEST_CLASSES=$(cd "$OUT_TC" && find comp5111 -name '*.class' \
        | grep -v '\$' \
        | sed 's|/|.|g; s|\.class$||' \
        | paste -sd, -)
    PERTEST="spectrum-pertest-refined-${suite}.dat"
    OUT_TSV="${DIR}/spectrum_fl_ochiai_refined_${suite}.tsv"
    java -cp "sootOutput:target/classes:${OUT_TC}:lib/*" \
        comp5111.assignment.SpectrumRunner "$TEST_CLASSES" "$PERTEST"
    java -cp "target/classes:lib/*" \
        comp5111.assignment.OchiaiAnalyzer "$OUT_TSV" "$PERTEST"
done

echo
echo "Refined spectrum reports:"
for s in "${SUITES[@]}"; do
    F="src/test/refined-${s}/spectrum_fl_ochiai_refined_${s}.tsv"
    [[ -f "$F" ]] && echo "  $F"
done
