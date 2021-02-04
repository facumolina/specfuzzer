#!/bin/bash

output_folder=experiments/datastructures/output/

# This script allows to generate invariants for the List case study by using a given technique: daikon, specfuzzer or gassert

technique=$1
invs_to_fuzz=100
class='List'
method='insert'

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

# Run the specfuzzer technique
echo '> Analyzing DataStructures.List.insert with technique: '$technique

# Daikon standalone
if [ $technique == "daikon" ]
then
  output_file=list-insert-daikon.assertions
  echo '> Inferring with Daikon standalone'
  ./experiments/datastructures/run-daikon.sh daikon-outputs/ListTesterDriver.dtrace.gz ListTesterDriver.inv.gz $class $method $output_folder$output_file
fi

# Daikon with SpecFuzzer
if [ $technique = "specfuzzer" ]
then
  output_file=list-insert-specfuzzer.assertions
  echo '> Inferring with Daikon + SpecFuzzer'
  ./experiments/datastructures/run-specfuzzer.sh daikon-outputs/ListTesterDriver.dtrace.gz daikon-outputs/ListTesterDriver-objects.xml grammars/ListGrammar.json $invs_to_fuzz ListTesterDriver.inv.gz $class $method $output_folder$output_file
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
