#!/bin/bash

# Arguments
target_classpath=$1;
target_class_fqname=$2;
target_class_name=${target_class_fqname##*.}
test_suite=$3;
test_suite_name=${test_suite##*.}
method=$4

# Output files
OUTPUT_FOLDER=$SPECFUZZER'/output'
subject_dir=$OUTPUT_FOLDER'/'$target_class_fqname
setup_dir=$subject_dir'/setup'
inference_dir=$subject_dir'/inference'
dtrace='output/'$target_class_fqname'/setup/'$test_suite_name'.dtrace.gz';
objects='output/'$target_class_fqname'/setup/'$test_suite_name'-objects.xml';
grammar=$setup_dir'/'$target_class_name'Grammar.json';
output_dir=$inference_dir

invs_to_fuzz=2000
invs_file=$test_suite_name'.inv.gz'

echo 'step: inference'
echo 'dtrace: '$dtrace
echo 'objects: '$objects
echo 'class: '$target_class_name
echo 'grammar: '$grammar
echo 'method: '$method
echo ''

SECONDS=0

# Prepare files
mkdir -p $inference_dir
base_file_name=$target_class_name'-'$method
rm -f invs_file.xml
rm -f invs-by-mutants.csv
cp base_invs_file.xml invs_file.xml
cp base-invs-by-mutants.csv invs-by-mutants.csv

# Actual execution of Daikon + Fuzzed specs
echo '# Dynamic Invariant Detection (Daikon + Fuzzed Specs)'
java -Xmx8g -cp build/classes/:lib/* daikon.Daikon --grammar-to-fuzz $grammar --living-fuzzed-invariants invs_file.xml --fuzzed-invariants $invs_to_fuzz --serialiazed-objects $objects $dtrace
inference_sec=$SECONDS

mutations_log=$setup_dir'/'$test_suite_name'-mutants.log'
mutants_dir=$setup_dir'/mutants-traces'

# Now perform the filtering step using a seconds budget. If the budget is passed, then stop. 
FILTERING_BUDGET=5400
SECONDS=0
processed_mutants=0
echo ''
echo '# Mutation Analysis'
for mutant_dtrace in $mutants_dir"/"$test_suite_name*.dtrace.gz; do
  base_name=${mutant_dtrace/%$".dtrace.gz"}
  mutant_number=${base_name##*-m}
  mutant_objects_file='output/'$target_class_fqname'/setup/mutants-traces/'$test_suite_name"-m"$mutant_number"-objects.xml"
  curr_mutant=$(sed -n $mutant_number'p' $mutations_log)
  if [[ $curr_mutant == *$target_class_name':'* || $curr_mutant == *$target_class_name'@<init>'* || $curr_mutant == *$target_class_name*$method* ]]; then
    # The mutant is in a static method OR in any method of the class
    echo 'checking invariants on mutant:' $mutant_number
    echo 'mutation is: '$curr_mutant
    echo 'trace: '$mutant_dtrace
    echo 'objects: '$mutant_objects_file
    java -Xmx8g -cp build/classes/:lib/* daikon.tools.InvariantChecker --conf --serialiazed-objects $mutant_objects_file $invs_file $mutant_dtrace > /dev/null 2>&1
    python3 scripts/single-mutant-result.py invs.csv 1 $mutant_dtrace
    echo ''
    processed_mutants=$((processed_mutants+1))
  fi
  # Check budget
  if [ "$SECONDS" -gt "$FILTERING_BUDGET" ]; then
    echo 'mutation analysis step finished due to timeout: '$SECONDS
    break
  fi
done
filtering_sec=$SECONDS

mutka_file=$output_dir'/'$base_file_name'-invs-by-mutants.csv'
echo 'mutation killing ability results saved in: '$mutka_file
cp invs-by-mutants.csv $mutka_file

echo ''
assertions_file=$output_dir'/'$base_file_name.assertions
echo 'writing assertions to file: '$assertions_file
java -cp build/classes/:lib/* daikon.PrintInvariants $invs_file --ppt-select '.'$target_class_name':::OBJECT' --format java > $assertions_file
java -cp build/classes/:lib/* daikon.PrintInvariants $invs_file --ppt-select '.'$target_class_name'\.'$method'.' --format java >> $assertions_file
mv $invs_file $output_dir'/'$base_file_name.inv.gz
mv invs_file.xml $output_dir'/'$base_file_name'-filteredinvs.xml'

# Filter the specs with the buckets approach
echo 'reducing specs with buckets (computed from mutation analysis)'
SECONDS=0
python3 scripts/buckets-filter.py $mutka_file $assertions_file $target_class_name $method > /dev/null 2>&1
buckets_sec=$SECONDS
specfuzzer_output_file=$output_dir'/'$base_file_name'-buckets.assertions'
echo 'output assertions in file: '$specfuzzer_output_file
echo ''
echo 'SpecFuzzer output:'
cat $specfuzzer_output_file
echo ''


# Save stats to the csv file
base_csv_file=$target_class_name'-'$method'-stats'
csv_file=$output_dir'/'$base_csv_file.csv
echo 'statistics saved in file: '$csv_file

echo "class,method,fuzzed_nr,inference_time,inferred_nf,mutants_nr,filtering_time,filtered_ma,buckets_time,buckets_nr,filtered_buckets" > $csv_file
python3 scripts/save-stats-csv.py $target_class_name $method $invs_to_fuzz $processed_mutants $inference_sec $filtering_sec $buckets_sec $assertions_file $mutka_file $csv_file > /dev/null 2>&1

echo ''
echo '> Done!'
