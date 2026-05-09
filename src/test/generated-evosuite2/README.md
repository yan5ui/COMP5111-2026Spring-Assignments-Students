# generated-evosuite2

EvoSuite, LINE+BRANCH criterion, seed 42, 600 s budget per CUT class.
Six classes launched in parallel. Same criteria as the assignment is
graded on; different seed so the search starts from a different
population than `generated-evosuite0/1`.

```
java -jar lib/evosuite-1.2.0.jar \
    -class <FQCN> \
    -projectCP target/classes \
    -Dsearch_budget=600 \
    -Dstopping_condition=MaxTime \
    -Dcriterion=LINE:BRANCH \
    -Dassertion_strategy=ALL \
    -Drandom_seed=42 \
    -Dtest_dir=src/test/generated-evosuite2
```

Same six CUT classes as `generated-evosuite0`. Driver:
`scripts/run_evosuite_task1.sh`. EclEmma screenshots:
`screenshots/generated-evosuite2_{line,branch}.png`.
