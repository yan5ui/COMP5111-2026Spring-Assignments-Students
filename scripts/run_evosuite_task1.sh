#!/bin/bash
# Task 1: 3 EvoSuite suites in src/test/generated-evosuite{0,1,2}.
# 600 s per CUT class. The 6 classes inside one config run in
# parallel; configs are serial. Total wall-clock ~ 30 min.

set -e
export JAVA_HOME=${JAVA_HOME:-/usr/lib/jvm/java-11-openjdk-amd64}
export PATH=$JAVA_HOME/bin:$PATH

PROJECT_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_ROOT"

CUT_CLASSES=(
    "comp5111.assignment.cut.Subject"
    "comp5111.assignment.cut.Subject\$StringAlgorithms"
    "comp5111.assignment.cut.Subject\$DateTimeAlgorithms"
    "comp5111.assignment.cut.Subject\$GamePlayer"
    "comp5111.assignment.cut.Subject\$GamePlace"
    "comp5111.assignment.cut.Subject\$GameConfiguration"
)

mkdir -p target/classes
[[ -f target/classes/comp5111/assignment/cut/Subject.class ]] || \
    javac -g -d target/classes -cp "lib/*" src/main/java/comp5111/assignment/cut/Subject.java

LOG_DIR="logs/evosuite"
mkdir -p "$LOG_DIR"

run_config() {
    local idx=$1
    local budget=$2
    local criterion=$3
    local seed=$4
    local outdir="src/test/generated-evosuite${idx}"

    echo "============================================"
    echo "Config ${idx}: budget=${budget}s, criterion=${criterion}, seed=${seed}"
    echo "Output: ${outdir}"
    echo "Started: $(date '+%H:%M:%S')"
    echo "============================================"

    rm -rf "$outdir"
    mkdir -p "$outdir"

    pids=()
    for cls in "${CUT_CLASSES[@]}"; do
        local logf="${LOG_DIR}/c${idx}_$(echo "$cls" | tr -d '\\$.' ).log"
        (
            java -jar lib/evosuite-1.2.0.jar \
                -class "$cls" \
                -projectCP target/classes \
                -Dsearch_budget="$budget" \
                -Dstopping_condition=MaxTime \
                -Dcriterion="$criterion" \
                -Dassertion_strategy=ALL \
                -Drandom_seed="$seed" \
                -Dtest_dir="$outdir" \
                -Dshow_progress=false 2>&1 > "$logf"
        ) &
        pids+=("$!")
        echo "  launched $cls (pid=${!}) -> $logf"
    done

    for p in "${pids[@]}"; do wait "$p" || true; done

    echo "Config ${idx} complete: $(date '+%H:%M:%S')"
    echo "  generated $(find "$outdir" -name '*.java' | grep -v scaffolding | wc -l) test files"
}

run_config 0 600 BRANCH 0
run_config 1 600 LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH 7
run_config 2 600 LINE:BRANCH 42

echo
echo "ALL DONE"
for i in 0 1 2; do
    n=$(find "src/test/generated-evosuite${i}" -name '*_ESTest.java' 2>/dev/null | wc -l)
    echo "  generated-evosuite${i}: ${n} test classes"
done
