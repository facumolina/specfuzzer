#!/bin/bash

output_folder=experiments/datastructures/output/

# This script allows to generate invariants for the List case study by using a given technique: daikon, specfuzzer or gassert

technique=$1
invs_to_fuzz=500
class='NodeCachingLinkedList'
method='addLast'

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

# Run the specfuzzer technique
echo '> Analyzing DataStructures.commonscollections.NodeCachingLinkedList.addLast with technique: '$technique

# Daikon standalone
if [ $technique == "daikon" ]
then
  output_file=ncll-addlast-daikon.assertions
  echo '> Inferring with Daikon standalone'
  ./experiments/datastructures/run-daikon.sh daikon-outputs/NodeCachingLinkedListTesterDriver.dtrace.gz NodeCachingLinkedListTesterDriver.inv.gz $class $method $output_folder$output_file
fi

# Daikon with SpecFuzzer
if [ $technique = "specfuzzer" ] 
then
  output_file=ncll-addlast-specfuzzer.assertions
  echo '> Inferring with Daikon + SpecFuzzer'
  ./experiments/datastructures/run-specfuzzer.sh daikon-outputs/NodeCachingLinkedListTesterDriver.dtrace.gz daikon-outputs/NodeCachingLinkedListTesterDriver-objects.xml grammars/NodeCachingLinkedListGrammar-reduced.json $invs_to_fuzz NodeCachingLinkedListTesterDriver.inv.gz $class $method $output_folder$output_file
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
