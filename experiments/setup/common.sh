#!/bin/bash

# This script will setup everything that is required to enable SpecFuzzer:
# 1. Grammar Extraction
# 2. Dynamic Comparability Analysis (this is also required by Daikon)
# 3. Trace generation with Chicory (this is also required by Daikon) + Object serialization for further evaluation of fuzzed specs.
# 4. Mutants generation for later filtering.

# Verify that the required environment variables have been set
[[ -z "$DAIKONDIR" ]] && { echo "> The environment variable DAIKONDIR is empty" ; exit 1; }
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

# Get the arguments and define vars
fqname=$1
tester_base=$2
omit_pattern=$tester_base'.*'
driver_name=$3
driver_fqname='testers.'$driver_name
daikon_out=$SPECFUZZER'/daikon-outputs'
cmp_file=$daikon_out'/'$driver_name'.decls-DynComp'
objs_file='daikon-outputs/'$driver_name'-objects.xml'
source_file=$4

echo '> Setup for target class: '$fqname
echo 'tester base: '$tester_base
echo 'driver: '$driver_fqname
echo 'source: '$source_file
echo ''

# Grammar Extraction
echo '> Grammar Extraction'
java -cp "lib/*" grammar.GrammarExtractor $fqname
echo ''

# Perform the Dynamic Comparability Analysis
echo '> Performing Dynamic Comparability Analysis from driver: '$driver_fqname
java -cp build/classes/:lib/daikon.jar daikon.DynComp $driver_fqname --output-dir=$daikon_out
echo ''

# Run Chicory on the existing testsuite to create the valid trace
echo '> Running Chicory for dtrace generation from driver: '$driver_fqname
java -cp build/classes/:lib/daikon.jar daikon.Chicory --output-dir=$daikon_out --comparability-file=$cmp_file --ppt-omit-pattern=$omit_pattern $driver_fqname $objs_file
echo 'Objects saved in file: '$objs_file
echo ''

# Use Major to create the mutated traces
echo '> Generating mutants with MAJOR'
./experiments/setup/gen-mutated-traces.sh $source_file $tester_base
echo ''

echo '> Done!'
