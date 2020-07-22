#!/bin/bash

target_class=$1;
test_class_name=$2;

echo '> Generating tests for class '$target_class

java -cp build/classes/:lib/randoop-all-4.2.4.jar randoop.main.Main gentests --testclass=$target_class --output-limit=100 --literals-level=ALL --literals-file=literals/lits.txt --omit-methods='repOk|toString|getClass' --junit-package-name='testers' --junit-output-dir=src/examples/ --junit-reflection-allowed=false --regression-test-basename=$test_class_name

echo '> Done!'
