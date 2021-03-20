#!/bin/bash

output_folder=experiments/datastructures/output/

# This script allows to generate invariants for the SortedList.add case study by using one of the following techniques:
# * daikon 
# * specfuzzer
# * gassert
# * evospex

# Arguments
technique=$1
# Common
fqname='DataStructures.Lkorat.singlysortedlist.SortedList'
class='SortedList'
method='add'
target_name='SortedListTesterDriver'
# Daikon
trace='daikon-outputs/'$target_name'.dtrace.gz'
inv_file=$target_name'.inv.gz'
# SpecFuzzer
invs_to_fuzz=200
grammar='grammars/SortedListGrammar.json'

output_file=$class'-'$method'-'$technique'.assertions'

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

echo '> Analyzing DataStructures.korat.singlysortedlist.SortedList.add with technique: '$technique

# Daikon standalone
if [ $technique == "daikon" ]
then
  echo '> Daikon'
  ./experiments/datastructures/run-daikon.sh $trace $inv_file $class $method $output_folder$output_file
fi

# SpecFuzzer
if [ $technique = "specfuzzer" ]
then
  ./experiments/datastructures/run-specfuzzer.sh $target_name $grammar $invs_to_fuzz $class $method $output_folder$output_file
fi

# GAssert
if [ $technique == "gassert" ]
then
  echo '> GAssert'
  echo '> Go to $GASSERT/scripts and perform: '
  echo '  ./run_gassert.sh GASSERT DataStructuresSortedList_add 90 daikon.assertions'
fi

# EvoSpex
if [ $technique == "evospex" ]
then
  echo '> EvoSpex'
  objects_folder='SortedList/add\(int\)/3/'
  ./experiments/datastructures/run-evospex.sh $fqname $method $objects_folder
fi


echo ''
echo '> Done!'
