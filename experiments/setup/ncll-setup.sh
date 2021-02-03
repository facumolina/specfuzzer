#!/bin/bash

# This script allows to perform valid and invalid trace generation to enable the fuzzing based specification inference technique for the NodeCachingLinkedList case study.
 
# Verify that the required environment variables have been set
[[ -z "$DAIKONDIR" ]] && { echo "> The environment variable DAIKONDIR is empty" ; exit 1; }
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

echo '> Starting experiment for case: DataStructures.commonscollections.NodeCachingLinkedList'
echo ''

# Perform the Dynamic Comparability Analysis
echo '> Performing Dynamic Comparability Analysis from driver: testers.NodeCachingLinkedListTesterDriver'
java -cp build/classes/:lib/daikon.jar daikon.DynComp testers.NodeCachingLinkedListTesterDriver --output-dir=$SPECFUZZER/daikon-outputs
echo ''

# Run Chicory on the existing testsuite to create the valid trace 
echo '> Running Chicory for dtrace generation from driver: testers.NodeCachingLinkedListTesterDriver'
java -cp build/classes/:lib/daikon.jar daikon.Chicory --output-dir=$SPECFUZZER/daikon-outputs/ --comparability-file=$SPECFUZZER/daikon-outputs/NodeCachingLinkedListTesterDriver.decls-DynComp --ppt-omit-pattern='NodeCachingLinkedListTester.*' testers.NodeCachingLinkedListTesterDriver daikon-outputs/NodeCachingLinkedListTesterDriver-objects.xml
echo 'Objects saved in file: '$SPECFUZZER'/daikon-outputs/NodeCachingLinkedListTesterDriver-objects.xml'
echo ''

# Use Major to create the mutated traces
echo '> Generating mutants with MAJOR'
#./experiments/setup/gen-mutated-traces.sh DataStructures/List.java ListTester
echo ''

echo '> Done!'
