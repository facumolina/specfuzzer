#!/bin/bash

output_folder=experiments/datastructures/output/

# This script allows to generate invariants for the TreeList clear case study by using a given technique: daikon, specfuzzer or gassert

technique=$1
invs_to_fuzz=500
class='TreeList'
method='clear'

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

# Run the specfuzzer technique
echo '> Analyzing DataStructures.commonscollections.TreeList.clear with technique: '$technique

# Daikon standalone
if [ $technique == "daikon" ]
then
  output_file=treelist-clear-daikon.assertions
  echo '> Inferring with Daikon standalone'
  ./experiments/datastructures/run-daikon.sh daikon-outputs/TreeListTesterDriver.dtrace.gz TreeListTesterDriver.inv.gz $class $method $output_folder$output_file
fi

# Daikon with SpecFuzzer
if [ $technique = "specfuzzer" ] 
then
  output_file=treelist-clear-specfuzzer.assertions
  echo '> Inferring with Daikon + SpecFuzzer'
  ./experiments/datastructures/run-specfuzzer.sh daikon-outputs/TreeListTesterDriver.dtrace.gz daikon-outputs/TreeListTesterDriver-objects.xml grammars/TreeListGrammar.json $invs_to_fuzz TreeListTesterDriver.inv.gz $class $method $output_folder$output_file
fi

# GAssert
if [ $technique == "gassert" ] 
then
  echo '> Inferring with GAssert'
  echo '> Go to $GASSERT/scripts and perform: '
  echo '  ./run_gassert.sh GASSERT DataStructuresNCLL_addlast 10 daikon.assertions'
fi

echo ''
echo '> Done!'
