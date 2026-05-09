# generated-evosuite0

EvoSuite, BRANCH criterion, seed 0, 600 s budget per CUT class. Six
classes launched in parallel.

```
java -jar lib/evosuite-1.2.0.jar \
    -class <FQCN> \
    -projectCP target/classes \
    -Dsearch_budget=600 \
    -Dstopping_condition=MaxTime \
    -Dcriterion=BRANCH \
    -Dassertion_strategy=ALL \
    -Drandom_seed=0 \
    -Dtest_dir=src/test/generated-evosuite0
```

`<FQCN>` enumerates:

```
comp5111.assignment.cut.Subject
comp5111.assignment.cut.Subject$StringAlgorithms
comp5111.assignment.cut.Subject$DateTimeAlgorithms
comp5111.assignment.cut.Subject$GamePlayer
comp5111.assignment.cut.Subject$GamePlace
comp5111.assignment.cut.Subject$GameConfiguration
```

Same six classes as `generated-evosuite1/2`. Driver script:
`scripts/run_evosuite_task1.sh`. EclEmma screenshots:
`screenshots/generated-evosuite0_{line,branch}.png`.
