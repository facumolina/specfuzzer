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

for value in $(eval echo {1..$executions})
do
echo '> Execution number: '$value
SECONDS=0

# Clean file for this step to work properly
rm invs_file.xml
rm invs-by-mutants.csv
cp base_invs_file.xml invs_file.xml
cp base-invs-by-mutants.csv invs-by-mutants.csv

# Actual execution of Daikon + Fuzzed specs
echo '> Inference step'
java -cp build/classes/:lib/* daikon.Daikon --grammar-to-fuzz $grammar --living-fuzzed-invariants invs_file.xml --fuzzed-invariants $invs_to_fuzz --serialiazed-objects $objects $dtrace
SECONDS_INFERENCE=$SECONDS

mutations_log=$mutants_dir'/'$target_name'-mutants.log'

# Now perform the filtering step using a seconds budget. If the budget is passed, then stop. 
FILTERING_BUDGET=3600
SECONDS=0
echo '> Filtering step'
echo ''
for mutant_dtrace in $mutants_dir"/"$target_name*.dtrace.gz; do
  base_name=${mutant_dtrace/%$".dtrace.gz"}
  mutant_objects_file=$base_name"-objects.xml"
  mutant_number=${base_name#$mutants_dir'/'$target_name'-m'}
  curr_mutant=$(sed -n $mutant_number'p' $mutations_log)
  if [[ $curr_mutant == *$class':'* || $curr_mutant == *$class*'<init>'* || $curr_mutant == *$class*$method* ]]; then
    # The mutant is in a static method OR in a constructor OR in the current method
    echo '> Mutation is: '$curr_mutant
    echo 'Checking invs on mutant: '$mutant_dtrace
    java -cp build/classes/:lib/* daikon.tools.InvariantChecker --conf --serialiazed-objects $mutant_objects_file $invs_file $mutant_dtrace
    echo 'Saving mutants results file'
    python3 single-mutant-result.py invs.csv 1 $mutant_dtrace
    echo ''
    #else
    #echo '> Ignored mutant: '$curr_mutant
  fi
  # Check budget
  if [ "$SECONDS" -gt "$FILTERING_BUDGET" ]; then
    echo '> Filtering step finished due to timeout: '$SECONDS
    break
  fi
done
SECONDS_FILTERING=$SECONDS

mkdir -p $output_dir
base_file_name=$class'-'$method'-specfuzzer-'$value

echo '> Mutation killing ability'
python3 process-final-results.py invs-by-mutants.csv
mutka_file=$output_dir'/'$base_file_name'-invs-by-mutants.csv'
echo '> Mutation killing ability results saved in: '$mutka_file
cp invs-by-mutants.csv $mutka_file

assertions_file=$output_dir'/'$base_file_name.assertions
echo ''
echo '> Writing assertions to file: '$assertions_file
java -cp build/classes/:lib/* daikon.PrintInvariants $invs_file --ppt-select '.'$class':::OBJECT' --format java > $assertions_file
java -cp build/classes/:lib/* daikon.PrintInvariants $invs_file --ppt-select '.'$class'\.'$method'.' --format java >> $assertions_file
mv $invs_file $output_dir'/'$base_file_name.inv.gz
mv invs_file.xml $output_dir'/'$base_file_name'-filteredinvs.xml'
stats_file=$output_dir'/'$base_file_name.log

echo "Inferece time (sec): $(($SECONDS_INFERENCE))" > $stats_file
echo "Filtering time (sec): $(($SECONDS_FILTERING))" >> $stats_file

echo '> Finished execution '$value
echo ''

done # Close executions loop
