#!/bin/bash

target_name=$1;
dtrace='daikon-outputs/'$target_name'.dtrace.gz';
objects='daikon-outputs/'$target_name'-objects.xml';
grammar=$2
invs_to_fuzz=$3
invs_file=$target_name'.inv.gz'
class=$4
method=$5
output_file=$6
mutants_dir='daikon-outputs/mutants';

echo '> SpecFuzzer'
echo 'dtrace: '$dtrace
echo 'objects: '$objects

# Clean file for this step to work properly
cp base_invs_file.xml invs_file.xml
cp base-invs-by-mutants.csv invs-by-mutants.csv

# Actual execution of Daikon + Fuzzed specs
java -cp build/classes/:lib/* daikon.Daikon --grammar-to-fuzz $grammar --living-fuzzed-invariants invs_file.xml --fuzzed-invariants $invs_to_fuzz --serialiazed-objects $objects $dtrace

mutations_log=$mutants_dir'/'$target_name'-mutants.log'
# Now perform the filtering step
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
  else
    echo '> Ignored mutant: '$curr_mutant
  fi
done

echo '> Mutation killing ability'
python3 process-final-results.py invs-by-mutants.csv
mutka_file='experiments/datastructures/output/'$class'-'$method'-specfuzzer-invs-by-mutants.csv'
echo '> Mutation killing ability results saved in: '$mutka_file
cp invs-by-mutants.csv $mutka_file

rm -f $output_file
echo ''
echo '> Writing output to file: '$output_file
java -cp build/classes/:lib/* daikon.PrintInvariants $invs_file --ppt-select '.'$class':::OBJECT' > $output_file
java -cp build/classes/:lib/* daikon.PrintInvariants $invs_file --ppt-select '.'$method'.' >> $output_file
mv $invs_file 'experiments/datastructures/output/'$class'-'$method'-specfuzzer.inv.gz'

echo '> Output written.'

