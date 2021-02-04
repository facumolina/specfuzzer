#!/bin/bash

target_class=$1;
test_class_name=$2;

echo '> Generating tests for class '$target_class

java -cp build/classes/:lib/randoop-all-4.2.4.jar randoop.main.Main gentests --testclass=$target_class --output-limit=1000 --literals-level=ALL --literals-file=literals/lits.txt --omit-methods='repOk|repOK|toString|getClass|parallelStream|listIterator|spliterator|stream|iterator|contains|containsAll|equals|retainAll|lastIndexOf|toArray' --junit-package-name='testers' --junit-output-dir=src/examples/ --junit-reflection-allowed=false --regression-test-basename=$test_class_name --no-regression-assertions=true

echo '> Done!'
