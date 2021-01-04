#!/bin/bash

grammar_file=$1;
target_name=$2;
objects_file="daikon-outputs/"$2"-objects.xml";
dtrace_file="daikon-outputs/"$2".dtrace.gz";
mutants_dir="daikon-outputs/mutants";
invs_file=$target_name".inv.gz"

iterations=2;
invs_to_fuzz=$3;

echo '> SpecFuzzer'
echo ''

echo '> Performing '$iterations' iterations analyzing specs for file: '$dtrace_file
echo ''

i=1
while [[ $i -le $iterations ]]
do
  echo '> Running Daikon - Iteration '$i
  java -cp build/classes/:lib/* daikon.Daikon --user-defined-invariant invariant.FuzzedInvariant --grammar-to-fuzz $grammar_file --living-fuzzed-invariants invs_file.xml --fuzzed-invariants $invs_to_fuzz --serialiazed-objects $objects_file $dtrace_file > /dev/null 2>&1

  echo '> Checking invariants on Mutants - Iteration '$i
  for mutant_dtrace in $mutants_dir"/"$target_name*.dtrace.gz; do
    base_name=${mutant_dtrace/%$".dtrace.gz"}
    mutant_objects_file=$base_name"-objects.xml"
    echo '> Checking on mutant: '$mutant_dtrace
    java -cp build/classes/:lib/* daikon.tools.InvariantChecker --conf --serialiazed-objects $mutant_objects_file $invs_file $mutant_dtrace
    echo ''
  done
  echo ''

  ((i = i + 1))
done

echo '> Done!'
