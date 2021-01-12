#!/bin/bash

# This script allows to perform all the steps of the fuzzing based specification inference technique for the List case study. 

# Verify that the required environment variables have been set
[[ -z "$DAIKONDIR" ]] && { echo "> The environment variable DAIKONDIR is empty" ; exit 1; }
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

echo '> Starting experiment for case: DataStructure.List'
echo ''

# First run all the Daikon steps
echo '> Performing Dynamic Comparability Analysis from driver: testers.ListTesterDriver'
java -cp build/classes/:lib/daikon.jar daikon.DynComp testers.ListTesterDriver --output-dir=$SPECFUZZER/daikon-outputs
echo ''

echo '> Running Chicory for dtrace generation from driver: testers.ListTesterDriver'
java -cp build/classes/:lib/daikon.jar daikon.Chicory --output-dir=$SPECFUZZER/daikon-outputs/ --comparability-file=$SPECFUZZER/daikon-outputs/ListTesterDriver.decls-DynComp --ppt-omit-pattern='ListTester.*' testers.ListTesterDriver daikon-outputs/ListTesterDriver-objects.xml
echo 'Objects saved in file: '$SPECFUZZER'/daikon-outputs/ListTesterDriver-objects.xml'
echo ''

echo '> Generating mutants with MAJOR'
./experiments/setup/gen-mutated-traces.sh DataStructures/List.java ListTester
echo ''

echo '> Done!'
