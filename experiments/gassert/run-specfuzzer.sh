#!/bin/bash

# This script allows to run SpecFuzzer for a GAssert subkect. 

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }
[[ -z "$GASSERTDIR" ]] && { echo "> The environment variable GASSERTDIR is empty" ; exit 1; }

# Read arguments
gassert_subject=$1
fqname=$2
method_name=$3

# Create useful variables
gassert_dir=$GASSERTDIR
subject_sources=$gassert_dir/subjects/$gassert_subject
class_package=$(echo "$fqname" | sed 's/\.[^.]*$//')
class_name=${fqname##*.}
specfuzzer_cp=lib/*
setup_files=experiments/gassert/$gassert_subject/setup-files
subject_cp=$subject_sources/build/libs/*

# Input files
grammar_to_fuzz=$setup_files/$class_name'Grammar.json'
objects_file=$setup_files/$class_name'TesterDriver-objects.xml'
dtrace_file=$setup_files/$class_name'TesterDriver.dtrace.gz'
mutants_dir=$setup_files/mutants
target_name=$class_name'TesterDriver'
invs_file=$target_name'.inv.gz'
output_dir=experiments/gassert/$gassert_subject/output/
mkdir -p $output_dir
executions=1

# SpecFuzzer params
invs_to_fuzz=2000;

# Start
echo '> SpecFuzzer'
echo 'target: '$gassert_subject'/'$fqname$'.'$method_name
echo 'grammar: '$grammar_to_fuzz
echo 'dtrace: '$dtrace_file
echo 'objects: '$objects_file
echo 'executions: '$executions
echo ''


# Build classpath
cp_for_daikon=lib/*:$subject_cp:

# Execution SpecFuzzer the specified number of times.
for value in $(eval echo {1..$executions})
do
echo '> Execution number: '$value
SECONDS=0

# Prepare files
base_file_name=$class_name'-'$method_name'-specfuzzer-'$value
rm -f invs_file.xml
rm -f invs-by-mutants.csv
cp base_invs_file.xml invs_file.xml
cp base-invs-by-mutants.csv invs-by-mutants.csv
log_file=$output_dir$base_file_name'.log'

echo '> SpecFuzzer' > $log_file
echo '# Inference step (Daikon + Fuzzed Specs)' >> $log_file
# Run SpecFuzzer
java -Xmx8g -cp $cp_for_daikon daikon.Daikon --grammar-to-fuzz $grammar_to_fuzz --living-fuzzed-invariants invs_file.xml --fuzzed-invariants $invs_to_fuzz --serialiazed-objects $objects_file $dtrace_file >> $log_file
inference_sec=$SECONDS

# Saving assertion files
echo '' >> $log_file
assertions_file=$output_dir$base_file_name.assertions
echo '# Writing assertions to file: '$assertions_file >> $log_file
java -cp $cp_for_daikon daikon.PrintInvariants $invs_file --ppt-select '.'$class':::OBJECT' --format java > $assertions_file
java -cp $cp_for_daikon daikon.PrintInvariants $invs_file --ppt-select '.'$class'\.'$method_name'.' --format java >> $assertions_file
mv $invs_file $output_dir'/'$base_file_name.inv.gz
mv invs_file.xml $output_dir'/'$base_file_name'-filteredinvs.xml'

done # Close executions loop

echo '> Done!'
