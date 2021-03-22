#!/bin/bash

output_folder=experiments/datastructures/output/

# This script allows to generate invariants for the SearchTree.insert case study by using one of the following techniques:
# * daikon
# * specfuzzer
# * gassert
# * evospex

# Arguments
technique=$1
# Common
fqname='DataStructures.korat.binarysearchtree.SearchTree'
class='SearchTree'
method='insert'
target_name='SearchTreeTesterDriver'
# Daikon
trace='daikon-outputs/'$target_name'.dtrace.gz'
inv_file=$target_name'.inv.gz'
# SpecFuzzer
invs_to_fuzz=2000
grammar='grammars/SearchTreeGrammar.json'

output_file=$class'-'$method'-'$technique'.assertions'


# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

echo '> Analyzing DataStructures.korat.binarysearchtree.SearchTree.insert with technique: '$technique

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
  echo '  ./run_gassert.sh GASSERT DataStructuresSearchTree_insert 90 daikon.assertions'
fi

# EvoSpex
if [ $technique == "evospex" ]
then
  echo '> EvoSpex'
  objects_folder='SearchTree/insert\(int\)/3/'
  ./experiments/datastructures/run-evospex.sh $fqname $method $objects_folder 10
fi


echo ''
echo '> Done!'

