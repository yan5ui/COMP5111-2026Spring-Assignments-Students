# generated-evosuite1

EvoSuite, combined criteria, seed 7, 600 s budget per CUT class. Six
classes launched in parallel. I picked the criterion mix to push
EvoSuite toward more corner cases than plain BRANCH.

```
java -jar lib/evosuite-1.2.0.jar \
    -class <FQCN> \
    -projectCP target/classes \
    -Dsearch_budget=600 \
    -Dstopping_condition=MaxTime \
    -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH \
    -Dassertion_strategy=ALL \
    -Drandom_seed=7 \
    -Dtest_dir=src/test/generated-evosuite1
```

Same six CUT classes as `generated-evosuite0`. Driver:
`scripts/run_evosuite_task1.sh`. EclEmma screenshots:
`screenshots/generated-evosuite1_{line,branch}.png`.
