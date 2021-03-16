#!/bin/bash

output_folder=experiments/datastructures/output/

# This script allows to generate invariants for the SortedList case study by using a given technique: daikon, specfuzzer or gassert

technique=$1
invs_to_fuzz=100
class='SortedList'
method='add'

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

# Run the specfuzzer technique
echo '> Analyzing DataStructures.korat.singlysortedlist.SortedList.add with technique: '$technique

# Daikon standalone
if [ $technique == "daikon" ]
then
  output_file=sortedlist-add-daikon.assertions
  echo '> Inferring with Daikon standalone'
  ./experiments/datastructures/run-daikon.sh daikon-outputs/SortedListTesterDriver.dtrace.gz SortedListTesterDriver.inv.gz $class $method $output_folder$output_file
fi

if [ $technique = "specfuzzer" ]
then
  output_file=sortedlist-add-specfuzzer.assertions
  echo '> Inferring with SpecFuzzer'
  ./experiments/datastructures/run-specfuzzer.sh daikon-outputs/SortedListTesterDriver.dtrace.gz daikon-outputs/SortedListTesterDriver-objects.xml grammars/SortedListGrammar.json $invs_to_fuzz SortedListTesterDriver.inv.gz $class $method $output_folder$output_file
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
