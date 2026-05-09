#!/bin/bash
# Pack the submission zip in the layout the README spec asks for.
# Usage: ./scripts/package_submission.sh <studentID> <lastname> <firstname>

set -e

if [[ $# -lt 3 ]]; then
    echo "Usage: $0 <studentID> <lastname> <firstname>"
    exit 1
fi
SID="$1"; LAST="$2"; FIRST="$3"

PROJECT_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_ROOT"

NAME="comp5111asn2-${SID}-${LAST}-${FIRST}"
ZIP="${NAME}.zip"
STAGE="/tmp/${NAME}"
rm -rf "$STAGE" "$ZIP"
mkdir -p "$STAGE"

INCLUDES=(
    "src/main/java"
    "src/test/fault-revealing-randoop0"
    "src/test/fault-revealing-randoop1"
    "src/test/fault-revealing-evosuite0"
    "src/test/fault-revealing-evosuite1"
    "src/test/generated-evosuite0"
    "src/test/generated-evosuite1"
    "src/test/generated-evosuite2"
    "src/test/refined-randoop0"
    "src/test/refined-randoop1"
    "src/test/refined-evosuite0"
    "src/test/refined-evosuite1"
    "scripts"
    "lib"
    "reports/faults"
    "reports/LLM"
    "reports/Task4_Data"
    "screenshots"
    "README-student.md"
    "README.md"
    "Assignment2_FAQ.md"
    "pom.xml"
    "reference_a2.pdf"
)

for path in "${INCLUDES[@]}"; do
    if [[ -e "$path" ]]; then
        mkdir -p "$STAGE/$(dirname "$path")"
        cp -r "$path" "$STAGE/$path"
    else
        echo "[warn] missing: $path"
    fi
done

# Drop build outputs.
find "$STAGE" -type d \( -name "build" -o -name "target" -o -name "sootOutput" -o -name "logs" \) -prune -exec rm -rf {} +
find "$STAGE" -name "*.class" -delete

echo
echo "=== Checklist ==="
NEEDED=(
    "src/main/java/comp5111/assignment/Assignment2.java"
    "src/main/java/comp5111/assignment/StatementInstrumenter.java"
    "src/main/java/comp5111/assignment/SpectrumTracker.java"
    "src/main/java/comp5111/assignment/SpectrumRunner.java"
    "src/main/java/comp5111/assignment/OchiaiAnalyzer.java"
    "src/test/fault-revealing-randoop0/spectrum_fl_ochiai_randoop0.tsv"
    "src/test/fault-revealing-randoop1/spectrum_fl_ochiai_randoop1.tsv"
    "src/test/fault-revealing-evosuite0/spectrum_fl_ochiai_evosuite0.tsv"
    "src/test/fault-revealing-evosuite1/spectrum_fl_ochiai_evosuite1.tsv"
    "src/test/refined-randoop0/spectrum_fl_ochiai_refined_randoop0.tsv"
    "src/test/refined-randoop1/spectrum_fl_ochiai_refined_randoop1.tsv"
    "src/test/refined-evosuite0/spectrum_fl_ochiai_refined_evosuite0.tsv"
    "src/test/refined-evosuite1/spectrum_fl_ochiai_refined_evosuite1.tsv"
    "src/test/refined-randoop0/extension_strategy.md"
    "reports/faults/fault_205.txt"
    "reports/faults/fault_344.txt"
    "reports/faults/fault_488.txt"
    "reports/faults/fault_615.txt"
    "reports/LLM/Task2_Report.md"
    "reports/Task4_Data/NewSubject.java"
)
PDFS=(
    "reports/LLM/Task2_Report.pdf"
    "reports/LLM/Task4_Report.pdf"
)
for f in "${NEEDED[@]}"; do
    if [[ -e "$STAGE/$f" ]]; then
        echo "  [ok]  $f"
    else
        echo "  [MISSING] $f"
    fi
done
echo
echo "=== PDF reports ==="
for f in "${PDFS[@]}"; do
    if [[ -e "$STAGE/$f" ]]; then
        echo "  [ok]  $f"
    else
        echo "  [MISSING] $f"
    fi
done

SCNT=$(find "$STAGE/screenshots" -type f 2>/dev/null | wc -l)
echo
echo "Screenshots in zip: $SCNT  (need 6 for Task 1: line+branch x 3 suites)"

( cd /tmp && zip -qr "$ZIP" "$NAME" )
mv "/tmp/$ZIP" "$PROJECT_ROOT/$ZIP"
echo
echo "Created: $ZIP  ($(du -h "$ZIP" | cut -f1))"
