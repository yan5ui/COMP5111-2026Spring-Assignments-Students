#!/bin/bash
# Task 4: EvoSuite test suite for NewSubject. 600 s, LINE+BRANCH.
set -e
export JAVA_HOME=${JAVA_HOME:-/usr/lib/jvm/java-11-openjdk-amd64}
export PATH=$JAVA_HOME/bin:$PATH
PROJECT_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_ROOT"

mkdir -p reports/Task4_Data/build/classes reports/Task4_Data/tests
javac -g -d reports/Task4_Data/build/classes -cp "lib/*" reports/Task4_Data/NewSubject.java
java -jar lib/evosuite-1.2.0.jar \
    -class comp5111.assignment.cut.NewSubject \
    -projectCP reports/Task4_Data/build/classes \
    -Dsearch_budget=600 -Dstopping_condition=MaxTime \
    -Dcriterion=LINE:BRANCH \
    -Dassertion_strategy=ALL \
    -Drandom_seed=2026 \
    -Dtest_dir=reports/Task4_Data/tests
echo "Task 4 EvoSuite done."
