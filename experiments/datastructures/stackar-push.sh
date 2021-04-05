#!/bin/bash

# This script allows to generate invariants for the StackAr.push case study by using a given technique: daikon, specfuzzer, gassert or evospex

# Arguments
technique=$1
# Common 
fqname='DataStructures.daikon.StackAr'
class='StackAr'
method='push'
target_name='StackArTesterDriver'
# Daikon
trace='daikon-outputs/'$target_name'.dtrace.gz'
inv_file=$target_name'.inv.gz'
# SpecFuzzer
invs_to_fuzz=2000
grammar='grammars/StackArGrammar.json'

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

# Run the technique
echo '> Analyzing DataStructures.StackAr.push with technique: '$technique

# Daikon standalone
if [ $technique == "daikon" ]
then
  echo '> Daikon'
  ./experiments/datastructures/run-daikon.sh $trace $inv_file $class $method 
if
fi

# SpecFuzzer
if [ $technique = "specfuzzer" ]
then
  ./experiments/datastructures/run-specfuzzer.sh $target_name $grammar $invs_to_fuzz $class $method 10
fi

# GAssert
if [ $technique == "gassert" ] 
then
  echo '> GAssert'
  echo '> Go to $GASSERT/scripts and perform: '
  echo '  ./run_gassert.sh GASSERT DataStructuresStackAr_push 90 daikon.assertions'
fi

# EvoSpex
if [ $technique == "evospex" ]
then
  echo '> EvoSpex'
  objects_folder='StackAr/push\(java.lang.Object\)/3/'
  ./experiments/datastructures/run-evospex.sh $fqname $method $objects_folder 10
fi


echo ''
echo '> Done!'
