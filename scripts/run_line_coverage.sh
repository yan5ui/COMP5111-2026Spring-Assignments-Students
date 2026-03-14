#!/bin/bash
# One-click script to measure line coverage using Soot
# Usage: ./scripts/run_line_coverage.sh [test-class-name] [test-source-dir]
# Example: ./scripts/run_line_coverage.sh comp5111.assignment.cut.Regression_6_Test src/test/example_test
# Default: runs on example_test suite (Regression_6_Test)

set -e

# Configuration
export JAVA_HOME=${JAVA_HOME:-/usr/lib/jvm/java-11-openjdk-amd64}
export PATH=$JAVA_HOME/bin:$PATH

PROJECT_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_ROOT"

TEST_CLASS=${1:-comp5111.assignment.cut.Regression_6_Test}
TEST_SOURCE_DIR=${2:-src/test/example_test}

echo "=========================================="
echo "COMP5111 Soot Line Coverage Tool"
echo "=========================================="
echo "Project root: $PROJECT_ROOT"
echo "Test class: $TEST_CLASS"
echo "Test source dir: $TEST_SOURCE_DIR"
echo ""

# Step 1: Compile CUT with debug info
echo "[Step 1/4] Compiling CUT..."
mkdir -p target/classes
javac -g -d target/classes -cp "lib/*" src/main/java/comp5111/assignment/cut/Subject.java
echo "CUT compiled."

# Step 2: Compile tool source
echo "[Step 2/4] Compiling coverage tool..."
javac -g -d target/classes -cp "lib/*" \
  src/main/java/comp5111/assignment/CoverageTracker.java \
  src/main/java/comp5111/assignment/LineCoverageInstrumenter.java \
  src/main/java/comp5111/assignment/Assignment1.java \
  src/main/java/comp5111/assignment/TestRunner.java
echo "Coverage tool compiled."

# Step 3: Compile test classes
echo "[Step 3/4] Compiling test classes from $TEST_SOURCE_DIR..."
mkdir -p target/test-classes
javac -g -d target/test-classes -cp "target/classes:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar" \
  ${TEST_SOURCE_DIR}/comp5111/assignment/cut/*.java
echo "Test classes compiled."

# Step 4: Run instrumentation
echo "[Step 4/4] Running Soot instrumentation..."
rm -rf sootOutput
java -cp "target/classes:target/test-classes:lib/*" \
  comp5111.assignment.Assignment1 "$TEST_CLASS" target/classes

# Step 5: Run tests on instrumented classes
echo ""
echo "[Running tests and generating report...]"
java -cp "sootOutput:target/classes:target/test-classes:lib/*" \
  comp5111.assignment.TestRunner "$TEST_CLASS"

echo ""
echo "=========================================="
echo "Report generated: line-coverage-report.txt"
echo "=========================================="
