#!/bin/bash

# This script will setup everything that is required to perform the inference setup of SpecFuzzer:
# 1. Grammar Extraction
# 2. Dynamic Comparability Analysis (this is also required by Daikon)
# 3. Trace generation with Chicory (this is also required by Daikon) + Object serialization for further evaluation of fuzzed specs.
# 4. Mutants generation with Major to be used by the Assertion Selector.

# Get the arguments and define vars
target_classpath=$1;
target_class_fqname=$2;
target_class_src=$3;
test_suite_driver=$4;

# Get last string after dot in test_suite_driver
test_suite_driver_name=${test_suite_driver##*.}
# Remove the word driver from test_suite_driver_name
tester_base=${test_suite_driver_name//Driver/}
omit_pattern=$tester_base'.*'

# Output files
daikon_out=$SPECFUZZER'/daikon-outputs'
cmp_file=$daikon_out'/'$test_suite_driver_name'.decls-DynComp'
objs_file='daikon-outputs/'$test_suite_driver_name'-objects.xml'

echo 'step: setup'
echo 'target class: '$target_class_fqname
echo 'source: '$target_class_src
echo 'tester base: '$tester_base
echo 'driver: '$test_suite_driver
echo 'driver name: '$test_suite_driver_name
echo ''

# Grammar Extraction
echo '-- Grammar Extraction'
java -cp "lib/*" grammar.GrammarExtractor $target_class_fqname
echo ''

# Perform the Dynamic Comparability Analysis
echo '-- Performing Dynamic Comparability Analysis from driver: '$test_suite_driver
java -cp build/classes/:lib/daikon.jar daikon.DynComp $test_suite_driver --output-dir=$daikon_out
echo ''

# Run Chicory on the existing testsuite to create the valid trace
echo '-- Running Chicory for dtrace generation from driver: '$test_suite_driver
java -cp build/classes/:lib/daikon.jar daikon.Chicory --output-dir=$daikon_out --comparability-file=$cmp_file --ppt-omit-pattern=$omit_pattern $test_suite_driver $objs_file
echo 'Objects saved in file: '$objs_file
echo ''

exit 1

# Use Major to create the mutated traces
echo '-- Generating mutants with MAJOR'
./experiments/setup/gen-mutated-traces.sh $target_class_src $tester_base
echo ''

echo '-- Done!'
