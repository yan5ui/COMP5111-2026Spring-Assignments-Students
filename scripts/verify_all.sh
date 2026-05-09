#!/bin/bash
# Re-run Task 2 + Task 3 and print the rank of each located fault in
# both before/after spectra. I run this after touching Subject.java or
# the FL tool.

set -e
export JAVA_HOME=${JAVA_HOME:-/usr/lib/jvm/java-11-openjdk-amd64}
export PATH=$JAVA_HOME/bin:$PATH
PROJECT_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_ROOT"

echo "[1/3] Task 2 spectra"
bash scripts/run_fault_localization.sh | grep -E "(Suite:|Tests:)"

echo
echo "[2/3] Task 3 spectra"
bash scripts/run_refined_fl.sh | grep -E "(Refined suite|Tests:)"

echo
echo "[3/3] Per-fault ranks: before vs after"
python3 - <<'PY'
from pathlib import Path
ROOT = Path("/home/zimo/playground/COMP5111-2026Spring-Assignments-Students")
SUITES = ["randoop0", "randoop1", "evosuite0", "evosuite1"]
FAULTS = [
    ("L205 parseToken",    "parseToken",      "i2 = i2 + 1"),
    ("L344 extractIntInStr","extractIntInStr","return i5"),
    ("L488 checkValidDate", "checkValidDate", "$z0 = 0"),
    ("L615 monAbbr2month",  "monAbbr2month",  "if i7 != 5465466 goto"),
]
def best(tsv, mh, jh):
    rows=[]
    with open(tsv) as f:
        for ln in f:
            p=ln.rstrip("\n").split("\t")
            if len(p)!=4: continue
            if mh not in p[0] or jh not in p[1]: continue
            rows.append((int(p[3]), float(p[2])))
    return min(rows,key=lambda r:(r[0],-r[1])) if rows else None
print(f"{'fault':<22} {'suite':<10} {'before':<14} {'after':<14}  Δ")
for name, mh, jh in FAULTS:
    for s in SUITES:
        b=best(ROOT/f"src/test/fault-revealing-{s}/spectrum_fl_ochiai_{s}.tsv", mh, jh)
        a=best(ROOT/f"src/test/refined-{s}/spectrum_fl_ochiai_refined_{s}.tsv", mh, jh)
        bs=f"r={b[0]} s={b[1]:.3f}" if b else "n/a"
        as_=f"r={a[0]} s={a[1]:.3f}" if a else "n/a"
        d=(b[0]-a[0]) if (a and b) else 0
        print(f"{name:<22} {s:<10} {bs:<14} {as_:<14}  {d:+d}")
PY
