# Task 3: Test-Suite Extension Strategy

**Author:** Zimo Ji

## What I added

For every original `fault-revealing-<suite>` I add the same single test
class `RefinedAssertions` containing exactly **four** focused tests, one
per fault I located in Task 2:

| New test                                   | Targets fault @ Subject.java | Trigger input                    | Expected vs buggy |
|--------------------------------------------|------------------------------|----------------------------------|-------------------|
| `refined_test_parseToken_excludesTerminator` | line 205 (`parseToken`)      | `parseToken("a#", {'#'})`        | `"a"` vs `"a#"`   |
| `refined_test_extractIntInStr_lastDigitRun`  | line 344 (`extractIntInStr`) | `extractIntInStr("1a2")`         | `2` vs `1`        |
| `refined_test_daysBetweenDates_lastDayIsValid` | line 488 (`checkValidDate`) | `daysBetweenDates(2024,1,31,2024,1,31)` | `0` vs throws |
| `refined_test_monAbbr2month_Sep`             | line 615 (`monAbbr2month`)   | `monAbbr2month("Sep")`           | `9` vs `-1`       |

I add the same four tests to **all four** refined suites so my score
for "average extra tests per suite" is exactly **NT = 4**.

## Why this design

Ochiai assigns score `aef / sqrt(F * (aef + aep))`. Two levers move a
faulty stmt's rank up:

1. **Increase `aef / F`** (the fraction of failing tests that exercise
   it). A focused failing test that hits *only* the buggy line and its
   immediate caller pushes `aef/F` close to 1 for the buggy stmt.
2. **Avoid increasing `aef` for non-faulty stmts** that share the same
   call graph. Each new failing test should exercise as few unrelated
   suspicious stmts as possible.

I picked minimal trigger inputs that reach the fault with the shortest
possible Jimple traces:

- `parseToken("a#", {'#'})` exercises one isOneOf hit (`'a'` not
  matched) and one terminator branch — strictly less than the
  multi-token triggers in the original randoop suites.
- `extractIntInStr("1a2")` is three characters and visits the
  digit / non-digit / digit branches exactly once; in particular it
  ends in the LAST digit run, which is the only path that reveals the
  bug at line 344.
- `daysBetweenDates(2024,1,31,2024,1,31)` is the smallest input that
  exercises the strict-less-than bug in `checkValidDate` for the same
  date on both sides, so the body of `daysBetweenDates` (Calendar
  arithmetic) is never reached when the bug is present.
- `monAbbr2month("Sep")` is the *only* input that reveals the off-by-10
  hash constant; it adds **one** failing test that selectively boosts
  Ochiai for the dead-branch comparison at line 615.

## Constraints I honoured

* I removed no original test; all original failing/passing
  observations are preserved (I keep the `randoopXXX_RegressionTest0`
  bodies in `refined-<suite>` byte-equal to those in
  `fault-revealing-<suite>`).
* Within each of my refined suites there are no duplicate
  inputs/coverages — each `refined_test_*` exercises a distinct set
  of statements.
* In each test I wrote, every statement contributes to its single
  assertion (no chain of unrelated calls inflating coverage); my
  pattern follows FAQ Q4's "allowed example".

## Result (rank improvement, lower is better)

| Fault       | suite     | before -> after | Δ      |
|-------------|-----------|-----------------|--------|
| L205        | randoop0  | 7   -> 7        |  0     |
| L205        | randoop1  | 13  -> 13       |  0     |
| L205        | evosuite0 | 13  -> 5        | -8     |
| L205        | evosuite1 | 12  -> 5        | -7     |
| L344        | randoop0  | 10  -> 10       |  0     |
| L344        | randoop1  | 55  -> 47       | -8     |
| L344        | evosuite0 | 45  -> 24       | -21    |
| L344        | evosuite1 | 43  -> 24       | -19    |
| L488        | randoop0  | 80  -> 78       | -2     |
| L488        | randoop1  | 90  -> 69       | -21    |
| L488        | evosuite0 | 95  -> 69       | -26    |
| L488        | evosuite1 | 97  -> 69       | -28    |
| L615        | randoop0  | 670 -> 100      | -570   |
| L615        | randoop1  | 100 -> 93       | -7     |
| L615        | evosuite0 | 95  -> 69       | -26    |
| L615        | evosuite1 | 94  -> 66       | -28    |

The largest single-suite improvement I see is on `randoop0` for the
`monAbbr2month("Sep")` fault, which the original suite never exercised
at all — `aef = 0` before, `aef = 1` after — moving it from rank 670
all the way down to 100. My other three faults all improve in at least
two of the four suites; the suites where my rank is unchanged were
already ranking the buggy stmt very high (e.g., L205 at rank 7 in
`randoop0` already covers the fault by 8 of 21 failing tests, so adding
one more failing test gives me only a marginal Ochiai bump that does
not break the existing tie).

My NT (average new tests per suite) = 4.
