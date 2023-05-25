#!/bin/bash

grammar_file=$1;
target_name=$2;
objects_file="daikon-outputs/"$2"-objects.xml";
dtrace_file="daikon-outputs/"$2".dtrace.gz";
mutants_dir="daikon-outputs/mutants";
invs_file=$target_name".inv.gz"

iterations=$3;
invs_to_fuzz=$4;

echo '> SpecFuzzer'
echo ''

# Clean file for this step to work properly
cp base_invs_file.xml invs_file.xml
cp base-invs-by-mutants.csv invs-by-mutants.csv 

echo '> Performing '$iterations' iterations analyzing specs for file: '$dtrace_file
echo ''

i=1
while [[ $i -le $iterations ]]
do
  echo '> Running Daikon - Iteration '$i
  java -cp build/classes/:lib/* daikon.Daikon --user-defined-invariant invariant.FuzzedUnaryInvariant --grammar-to-fuzz $grammar_file --living-fuzzed-invariants invs_file.xml --fuzzed-invariants $invs_to_fuzz --serialiazed-objects $objects_file $dtrace_file 

  echo '> Checking invariants on Mutants - Iteration '$i
  for mutant_dtrace in $mutants_dir"/"$target_name*.dtrace.gz; do
    base_name=${mutant_dtrace/%$".dtrace.gz"}
    mutant_objects_file=$base_name"-objects.xml"

    echo '> Checking on mutant: '$mutant_dtrace
    java -cp build/classes/:lib/* daikon.tools.InvariantChecker --conf --serialiazed-objects $mutant_objects_file $invs_file $mutant_dtrace
    echo ''

    echo '> Saving mutants results file'
    python3 single-mutant-result.py invs.csv $i $mutant_dtrace

  done
  echo ''

  ((i = i + 1))
done

echo '> Rating living invariants by mutation killing ability'
python3 process-final-results.py invs-by-mutants.csv

echo '> Done!'
