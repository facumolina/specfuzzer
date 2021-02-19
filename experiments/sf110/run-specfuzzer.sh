#!/bin/bash

# This script allows to run specfuzzer for a single method that belongs to a class of a SF110 project. 

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }
[[ -z "$SF110SRC" ]] && { echo "> The environment variable SF110SRC is empty" ; exit 1; }
[[ -z "$EVOSPEX" ]] && { echo "> The environment variable EVOSPEX is empty" ; exit 1; }

# Read arguments
sf110_project=$1
class_name=$2
grammar_to_fuzz=$3
method_name=$4

# Some useful variables
project_dir=$EVOSPEX/src/test/resources/sf110/$sf110_project
project_sources=$SF110SRC/$sf110_project
class_dir=$project_dir/$class_name
fqname=$(cat $project_dir/target-classes.txt | grep "\.$class_name")
method_dir=$class_dir/$method_name
tests_dir=$method_dir/2/tests
results_dir=experiments/sf110/$sf110_project
objects_file=$results_dir/$class_name-$method_name-objects.xml
dtrace_file=$results_dir/$class_name-$method_name.dtrace.gz
mutants_dir=$results_dir/mutants
target_name=$class_name-$method_name

# Fuzzing vars
invs_to_fuzz=100;

# Start
echo '> SpecFuzzer'
echo '> Target: '$sf110_project'/'$fqname$'.'$method_name

# Build classpath
cp_for_tests_compilation=$project_sources/build/classes/:$project_sources/lib/*:$EVOSPEX/lib/hamcrest-core-1.3.jar:$EVOSPEX/lib/junit-4.12.jar
cp_for_daikon=build/classes/:lib/*:$cp_for_tests_compilation:$tests_dir/build/classes/

# Clean file for this step to work properly
cp base_invs_file.xml invs_file.xml
cp base-invs-by-mutants.csv invs-by-mutants.csv

# Run the SpecFuzzer
java -cp $cp_for_daikon daikon.Daikon --user-defined-invariant invariant.FuzzedInvariant --grammar-to-fuzz $grammar_to_fuzz --living-fuzzed-invariants invs_file.xml --fuzzed-invariants $invs_to_fuzz --serialiazed-objects $objects_file $dtrace_file

invs_file=$target_name'.inv.gz'

echo '> Checking invariants on Mutants'
for mutant_dtrace in $mutants_dir"/"$target_name*.dtrace.gz; do
  base_name=${mutant_dtrace/%$".dtrace.gz"}
  mutant_objects_file=$base_name"-objects.xml"
  echo '> Checking on mutant: '$mutant_dtrace
  java -cp $cp_for_daikon daikon.tools.InvariantChecker --conf --serialiazed-objects $mutant_objects_file $invs_file $mutant_dtrace
  echo ''
  echo '> Saving mutants results file'
  python3 single-mutant-result.py invs.csv 1 $mutant_dtrace

done
echo ''

echo '> Rating living invariants by mutation killing ability'
python3 process-final-results.py invs-by-mutants.csv

echo '> Results saved in '$results_dir

echo '> Done!'
