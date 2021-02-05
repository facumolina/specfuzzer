#!/bin/bash

# This script allows to perform valid and invalid trace generation to enable the fuzzing based specification inference technique for the SearchTree case study.
 
# Verify that the required environment variables have been set
[[ -z "$DAIKONDIR" ]] && { echo "> The environment variable DAIKONDIR is empty" ; exit 1; }
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

echo '> Starting experiment for case: DataStructures.korat.binarysearchtree.SearchTree'
echo ''

# Perform the Dynamic Comparability Analysis
echo '> Performing Dynamic Comparability Analysis from driver: testers.SearchTreeTesterDriver'
java -cp build/classes/:lib/daikon.jar daikon.DynComp testers.SearchTreeTesterDriver --output-dir=$SPECFUZZER/daikon-outputs
echo ''

# Run Chicory on the existing testsuite to create the valid trace 
echo '> Running Chicory for dtrace generation from driver: testers.SearchTreeTesterDriver'
java -cp build/classes/:lib/daikon.jar daikon.Chicory --output-dir=$SPECFUZZER/daikon-outputs/ --comparability-file=$SPECFUZZER/daikon-outputs/SearchTreeTesterDriver.decls-DynComp --ppt-omit-pattern='SearchTreeTester.*' testers.SearchTreeTesterDriver daikon-outputs/SearchTreeTesterDriver-objects.xml
echo 'Objects saved in file: '$SPECFUZZER'/daikon-outputs/SearchTreeTesterDriver-objects.xml'
echo ''

# Use Major to create the mutated traces
echo '> Generating mutants with MAJOR'
#./experiments/setup/gen-mutated-traces.sh DataStructures/List.java ListTester
echo ''

echo '> Done!'
