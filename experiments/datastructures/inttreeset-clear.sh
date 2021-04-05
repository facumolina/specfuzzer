#!/bin/bash

# This script allows to generate invariants for the IntTreeSet.clear case study by using a given technique: daikon, specfuzzer, gassert or evospex

# Arguments
technique=$1
# Common
fqname='DataStructures.kodkod.IntTreeSet'
class='IntTreeSet'
method='clear'
target_name='IntTreeSetTesterDriver'
# Daikon
trace='daikon-outputs/'$target_name'.dtrace.gz'
inv_file=$target_name'.inv.gz'
# SpecFuzzer
invs_to_fuzz=2000
grammar='grammars/IntTreeSetGrammar.json'


# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

# Run the technique
echo '> Analyzing DataStructures.kodkod.IntTreeSet.clear with technique: '$technique

# Daikon standalone
if [ $technique == "daikon" ]
then
  echo '> Daikon'
  ./experiments/datastructures/run-daikon.sh $trace $inv_file $class $method
fi

# SpecFuzzer
if [ $technique = "specfuzzer" ] 
then
  ./experiments/datastructures/run-specfuzzer.sh $target_name $grammar $invs_to_fuzz $class $method 10
fi

# GAssert
if [ $technique == "gassert" ] 
then
  echo '> Inferring with GAssert'
  echo '> Go to $GASSERT/scripts and perform: '
  echo '  ./run_gassert.sh GASSERT DataStructuresIntTreeSet_clear 90 daikon.assertions'
fi

# EvoSpex
if [ $technique == "evospex" ]
then
  echo '> EvoSpex'
  objects_folder='IntTreeSet/clear\(\)/3/'
  ./experiments/datastructures/run-evospex.sh $fqname $method $objects_folder 10
fi

echo ''
echo '> Done!'
