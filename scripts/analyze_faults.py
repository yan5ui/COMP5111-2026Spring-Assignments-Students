#!/usr/bin/env python3
# Aggregate the 4 Ochiai TSVs by (msig, source line) and print the top
# candidates so I can eyeball which lines deserve manual inspection.
import argparse
import collections
import re
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
SUITES = ["randoop0", "randoop1", "evosuite0", "evosuite1"]


def parse_tsv(path):
    """Yield (msig, jimple, score, rank) per line."""
    with open(path) as f:
        for ln in f:
            ln = ln.rstrip("\n")
            if not ln:
                continue
            parts = ln.split("\t")
            if len(parts) != 4:
                continue
            msig, stmt, score, rank = parts
            yield msig, stmt, float(score), int(rank)


def line_from_stmt_via_metadata(metadata_path):
    """Build (msig, jimple_text) -> source_line map from spectrum-metadata.dat."""
    m = {}
    with open(metadata_path) as f:
        for ln in f:
            ln = ln.rstrip("\n")
            parts = ln.split("\t", 4)
            if len(parts) < 5:
                continue
            sid, cls, msig, line, jimple = parts
            m[(msig, jimple)] = int(line)
    return m


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--top", type=int, default=40)
    ap.add_argument("--metadata", default=str(ROOT / "spectrum-metadata.dat"))
    args = ap.parse_args()

    stmt_to_line = line_from_stmt_via_metadata(args.metadata)

    # Per-suite: (msig, line) -> (best_rank, max_score)
    per_suite = {}
    for suite in SUITES:
        tsv = ROOT / f"src/test/fault-revealing-{suite}/spectrum_fl_ochiai_{suite}.tsv"
        if not tsv.exists():
            print(f"[skip] {tsv}", file=sys.stderr)
            continue
        agg = {}
        for msig, stmt, score, rank in parse_tsv(tsv):
            line = stmt_to_line.get((msig, stmt), -1)
            key = (msig, line)
            if key not in agg or rank < agg[key][0]:
                agg[key] = (rank, score)
            else:
                # also keep max score for tied rank
                r0, s0 = agg[key]
                if score > s0:
                    agg[key] = (r0, score)
        per_suite[suite] = agg

    # Collect all (msig, line) keys appearing in any suite
    keys = set()
    for s in per_suite.values():
        keys.update(s.keys())

    # For each key, build aggregate metrics
    rows = []
    for key in keys:
        msig, line = key
        ranks, scores = [], []
        for suite, agg in per_suite.items():
            if key in agg:
                r, sc = agg[key]
                ranks.append(r)
                scores.append(sc)
        if not ranks:
            continue
        avg_rank = sum(ranks) / len(ranks)
        rows.append({
            "msig": msig,
            "line": line,
            "avg_rank": avg_rank,
            "min_rank": min(ranks),
            "max_score": max(scores),
            "n_suites": len(ranks),
            "ranks_per_suite": {s: per_suite[s].get(key, (None, None))[0] for s in SUITES},
        })

    # Filter: lines that appear in failing-test spectrum with non-trivial score
    rows = [r for r in rows if r["max_score"] > 0.0 and r["line"] > 0]
    rows.sort(key=lambda r: (r["avg_rank"], -r["max_score"]))

    print(f"Top {args.top} suspicious (msig, source-line) by avg_rank across {len(per_suite)} suites:")
    print(f"{'avg_rk':>7} {'min_rk':>6} {'max_sc':>7}  ranks(rd0/rd1/ev0/ev1)  line  method")
    for r in rows[: args.top]:
        rk = r["ranks_per_suite"]
        rkstr = "/".join(str(rk[s]) if rk[s] is not None else "-" for s in SUITES)
        # Shorten msig
        m = re.sub(r"<comp5111\.assignment\.cut\.Subject\$?", "<", r["msig"])
        m = re.sub(r": ", ":", m)
        print(f"{r['avg_rank']:7.2f} {r['min_rank']:6d} {r['max_score']:7.3f}  {rkstr:>20}  L{r['line']:>4}  {m}")


if __name__ == "__main__":
    main()
