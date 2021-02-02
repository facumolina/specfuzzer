#!/bin/bash

output_folder=experiments/datastructures/output/

# This script allows to generate invariants for the List case study by using a given technique: daikon, specfuzzer or gassert

technique=$1
invs_to_fuzz=100

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

# Run the specfuzzer technique
echo '> Analyzing DataStructures.List with technique: '$technique

# Daikon standalone
if [ $technique == "daikon" ]
then
  output_file=list-insert-daikon.assertions
  echo '> Inferring with Daikon standalone'
  java -cp build/classes/:lib/* daikon.Daikon daikon-outputs/ListTesterDriver.dtrace.gz
  rm -f $output_file
  echo ''
  echo '> Writing output to file: '$output_folder$output_file
  java -cp lib/daikon.jar daikon.PrintInvariants ListTesterDriver.inv.gz --ppt-select '.:::OBJECT' > $output_folder$output_file
  java -cp lib/daikon.jar daikon.PrintInvariants ListTesterDriver.inv.gz --ppt-select '.insert.' >> $output_folder$output_file
fi

# Daikon with SpecFuzzer
if [ $technique = "specfuzzer" ] 
then
  output_file=list-insert-specfuzzer.assertions
  echo '> Inferring with Daikon + SpecFuzzer'
  java -cp build/classes/:lib/* daikon.Daikon --user-defined-invariant invariant.FuzzedInvariant --grammar-to-fuzz grammars/ListGrammar.json --fuzzed-invariants $invs_to_fuzz --serialiazed-objects daikon-outputs/ListTesterDriver-objects.xml daikon-outputs/ListTesterDriver.dtrace.gz
  rm -f $output_file
  echo ''
  echo '> Writing output to file: '$output_folder$output_file
  java -cp build/classes/:lib/* daikon.PrintInvariants ListTesterDriver.inv.gz --ppt-select '.:::OBJECT' > $output_folder$output_file
  java -cp build/classes/:lib/* daikon.PrintInvariants ListTesterDriver.inv.gz --ppt-select '.insert.' >> $output_folder$output_file
fi

# GAssert
if [ $technique == "gassert" ] 
then
  echo '> Inferring with GAssert'
  echo '> Go to $GASSERT/scripts and perform: '
  echo '  ./run_gassert.sh GASSERT DataStructuresList_insert 10 daikon.assertions'
fi

echo ''
echo '> Done!'
