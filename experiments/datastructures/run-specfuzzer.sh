#!/bin/bash

target_name=$1;
dtrace='daikon-outputs/'$target_name'.dtrace.gz';
objects='daikon-outputs/'$target_name'-objects.xml';
grammar=$2
invs_to_fuzz=$3
invs_file=$target_name'.inv.gz'
class=$4
method=$5
executions=$6
mutants_dir='daikon-outputs/mutants';
output_dir=$SPECFUZZER/"experiments/datastructures/output/specfuzzer"

echo '> SpecFuzzer'
echo 'dtrace: '$dtrace
echo 'objects: '$objects
echo 'class: '$class
echo 'grammar: '$grammar
echo 'method: '$method
echo 'executions: '$executions
echo ''

for value in $(eval echo {1..$executions})
do
echo '> Execution number: '$value
SECONDS=0

# Prepare files
mkdir -p $output_dir
base_file_name=$class'-'$method'-specfuzzer-'$value
rm -f invs_file.xml
rm -f invs-by-mutants.csv
cp base_invs_file.xml invs_file.xml
cp base-invs-by-mutants.csv invs-by-mutants.csv
log_file=$output_dir'/'$base_file_name'.log'

# Actual execution of Daikon + Fuzzed specs
echo '> SpecFuzzer' > $log_file
echo '# Inference step (Daikon + Fuzzed Specs)' >> $log_file
java -Xmx8g -cp build/classes/:lib/* daikon.Daikon --grammar-to-fuzz $grammar --living-fuzzed-invariants invs_file.xml --fuzzed-invariants $invs_to_fuzz --serialiazed-objects $objects $dtrace >> $log_file
inference_sec=$SECONDS

mutations_log=$mutants_dir'/'$target_name'-mutants.log'

# Now perform the filtering step using a seconds budget. If the budget is passed, then stop. 
FILTERING_BUDGET=5400
SECONDS=0
processed_mutants=0
echo '' >> $log_file
echo '# Filtering step' >> $log_file
echo '' >> $log_file
for mutant_dtrace in $mutants_dir"/"$target_name*.dtrace.gz; do
  base_name=${mutant_dtrace/%$".dtrace.gz"}
  mutant_objects_file=$base_name"-objects.xml"
  mutant_number=${base_name#$mutants_dir'/'$target_name'-m'}
  curr_mutant=$(sed -n $mutant_number'p' $mutations_log)
  if [[ $curr_mutant == *$class':'* || $curr_mutant == *$class'@<init>'* || $curr_mutant == *$class*$method* ]]; then
    # The mutant is in a static method OR in a constructor OR in the current method
    echo '- Mutation is: '$curr_mutant >> $log_file
    echo 'Checking invs on mutant: '$mutant_dtrace >> $log_file
    java -Xmx8g -cp build/classes/:lib/* daikon.tools.InvariantChecker --conf --serialiazed-objects $mutant_objects_file $invs_file $mutant_dtrace >> $log_file
    echo 'Saving mutants results file' >> $log_file
    python3 scripts/single-mutant-result.py invs.csv 1 $mutant_dtrace >> $log_file
    echo '' >> $log_file
    processed_mutants=$((processed_mutants+1))
  fi
  # Check budget
  if [ "$SECONDS" -gt "$FILTERING_BUDGET" ]; then
    echo 'Filtering step finished due to timeout: '$SECONDS >> $log_file
    break
  fi
done
filtering_sec=$SECONDS

mutka_file=$output_dir'/'$base_file_name'-invs-by-mutants.csv'
echo '# Mutation killing ability results saved in: '$mutka_file >> $log_file
cp invs-by-mutants.csv $mutka_file

echo '' >> $log_file
assertions_file=$output_dir'/'$base_file_name.assertions
echo '# Writing assertions to file: '$assertions_file >> $log_file
java -cp build/classes/:lib/* daikon.PrintInvariants $invs_file --ppt-select '.'$class':::OBJECT' --format java > $assertions_file
java -cp build/classes/:lib/* daikon.PrintInvariants $invs_file --ppt-select '.'$class'\.'$method'.' --format java >> $assertions_file
mv $invs_file $output_dir'/'$base_file_name.inv.gz
mv invs_file.xml $output_dir'/'$base_file_name'-filteredinvs.xml'

# Filter the specs with the buckets approach
echo '# Filtering specs with buckets' >> $log_file
SECONDS=0
python3 scripts/buckets-filter.py $mutka_file $assertions_file $class $method >> $log_file
buckets_sec=$SECONDS
echo '' >> $log_file
echo 'Done!' >> $log_file

# Save stats to the csv file
csv_file=$output_dir'/'$base_file_name.csv
echo '# Writing stats to csv file: '$csv_file 
if [[ "$value" == 1 ]]; then
  echo "class,method,exec_nr,fuzzed_nr,inference_time,inferred_nf,mutants_nr,filtering_time,filtered_ma,buckets_time,buckets_nr,filtered_buckets" > $csv_file
fi
python3 scripts/save-stats-csv.py $class $method $value $invs_to_fuzz $processed_mutants $inference_sec $filtering_sec $buckets_sec $assertions_file $mutka_file $csv_file

echo '# Finished execution '$value
echo ''

done # Close executions loop
