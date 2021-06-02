#!/bin/bash

# This script allows to run specfuzzer for a single method that belongs to a class of a SF110 project. 

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }
[[ -z "$SF110SRC" ]] && { echo "> The environment variable SF110SRC is empty" ; exit 1; }

# Read arguments
sf110_project=$1
fqname=$2
method_name=$3

# Some useful variables
project_sources=$SF110SRC/$sf110_project
tests_dir=experiments/sf110/$sf110_project/tests
class_name=${fqname##*.}
grammar_to_fuzz=grammars/$class_name'Grammar.json'
results_dir=experiments/sf110/$sf110_project
objects_file=$results_dir/$class_name-$method_name-objects.xml
dtrace_file=$results_dir/$class_name-$method_name.dtrace.gz
mutants_dir=$results_dir/mutants
target_name=$class_name-$method_name
invs_file=$target_name'.inv.gz'
output_dir=experiments/sf110/$sf110_project/output

# Fuzzing vars
invs_to_fuzz=2000;

# Start
echo '> SpecFuzzer'
echo '> Target: '$sf110_project'/'$fqname$'.'$method_name
echo '> Grammar: '$grammar_to_fuzz

# Build classpath
cp_for_tests_compilation=$project_sources/build/classes/:$project_sources/lib/*:$SPECFUZZER/lib/hamcrest-core-1.3.jar:$SPECFUZZER/lib/junit-4.12.jar
cp_for_daikon=build/classes/:lib/*:$cp_for_tests_compilation:$tests_dir/build/classes/

# Clean file for this step to work properly
# Clean file for this step to work properly
rm invs_file.xml
rm invs-by-mutants.csv
cp base_invs_file.xml invs_file.xml
cp base-invs-by-mutants.csv invs-by-mutants.csv

# Run the SpecFuzzer
java -cp $cp_for_daikon daikon.Daikon --grammar-to-fuzz $grammar_to_fuzz --living-fuzzed-invariants invs_file.xml --fuzzed-invariants $invs_to_fuzz --serialiazed-objects $objects_file $dtrace_file

mutations_log=$mutants_dir'/'$class_name-$method_name'-mutants.log'
invs_file=$target_name'.inv.gz'

echo '> Checking invariants on Mutants'
for mutant_dtrace in $mutants_dir"/"$target_name*.dtrace.gz; do
  base_name=${mutant_dtrace/%$".dtrace.gz"}
  mutant_objects_file=$base_name"-objects.xml"
  mutant_number=${base_name#$mutants_dir'/'$target_name'-m'}
  curr_mutant=$(sed -n $mutant_number'p' $mutations_log)
  if [[ $curr_mutant == *$class_name':'* || $curr_mutant == *$class_name*'<init>'* || $curr_mutant == *$class_name*$method_name* ]]; then
    echo '> Checking on mutant: '$mutant_dtrace
    java -cp $cp_for_daikon daikon.tools.InvariantChecker --conf --serialiazed-objects $mutant_objects_file $invs_file $mutant_dtrace
    echo ''
    echo '> Saving mutants results file'
    python3 single-mutant-result.py invs.csv 1 $mutant_dtrace
  fi
done
echo ''

mkdir -p $output_dir
base_file_name=$class_name'-'$method_name'-specfuzzer'

echo '> Mutation killing ability'
python3 process-final-results.py invs-by-mutants.csv
mutka_file=$output_dir'/'$base_file_name'-invs-by-mutants.csv'
echo '> Mutation killing ability results saved in: '$mutka_file
cp invs-by-mutants.csv $mutka_file

assertions_file=$output_dir'/'$base_file_name.assertions
echo ''
echo '> Writing assertions to file: '$assertions_file
java -cp build/classes/:lib/* daikon.PrintInvariants $invs_file --ppt-select '.'$class_name':::OBJECT' --format java > $assertions_file
java -cp build/classes/:lib/* daikon.PrintInvariants $invs_file --ppt-select '.'$class_name'\.'$method'.' --format java >> $assertions_file
mv $invs_file $output_dir'/'$base_file_name.inv.gz
mv invs_file.xml $output_dir'/'$base_file_name'-filteredinvs.xml'

echo '> Done!'
