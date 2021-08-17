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

# Dir where the output is
output_dir=experiments/gassert/$gassert_subject/output
executions=10

echo '> Running Prioritization for case: '$fqname'.'$method_name

for mut_file in $output_dir'/'*-invs-by-mutants.csv; do
	base_name=${mut_file/%$"-invs-by-mutants.csv"}
	assertions_file=$base_name'.assertions'
	echo 'Analizing exec'
	echo 'invs by mutants file: '$mut_file
	echo 'assertions : '$assertions_file
	echo ''
	python3 scripts/prioritization-filter.py $mut_file $assertions_file $class_name $method_name
done
