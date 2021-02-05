#!/bin/bash

output_folder=experiments/datastructures/output/

# This script allows to generate invariants for the SearchTree case study by using a given technique: daikon, specfuzzer or gassert

technique=$1
invs_to_fuzz=100
class='SearchTree'
method='insert'

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

# Run the specfuzzer technique
echo '> Analyzing DataStructures.SearchTree.insert with technique: '$technique

# Daikon standalone
if [ $technique == "daikon" ]
then
  output_file=searchtree-insert-daikon.assertions
  echo '> Inferring with Daikon standalone'
  ./experiments/datastructures/run-daikon.sh daikon-outputs/SearchTreeTesterDriver.dtrace.gz SearchTreeTesterDriver.inv.gz $class $method $output_folder$output_file
fi

if [ $technique = "specfuzzer" ]
then
  output_file=searchtree-insert-specfuzzer.assertions
  echo '> Inferring with Daikon + SpecFuzzer'
  ./experiments/datastructures/run-specfuzzer.sh daikon-outputs/SearchTreeTesterDriver.dtrace.gz daikon-outputs/SearchTreeTesterDriver-objects.xml grammars/SearchTreeGrammar.json $invs_to_fuzz SearchTreeTesterDriver.inv.gz $class $method $output_folder$output_file
fi

# GAssert
if [ $technique == "gassert" ] 
then
  echo '> Inferring with GAssert'
  echo '> Go to $GASSERT/scripts and perform: '
  echo '  ./run_gassert.sh GASSERT DataStructuresSearchTree_insert 10 daikon.assertions'
fi

echo ''
echo '> Done!'
