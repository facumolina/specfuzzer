#!/bin/bash

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
  echo '> Inferring with Daikon standalone'
  java -cp build/classes/:lib/* daikon.Daikon daikon-outputs/ListTesterDriver.dtrace.gz
fi

# Daikon with SpecFuzzer
if [ $technique = "specfuzzer" ] 
then
  echo '> Inferring with Daikon + SpecFuzzer'
  java -cp build/classes/:lib/* daikon.Daikon --user-defined-invariant invariant.FuzzedInvariant --grammar-to-fuzz grammars/ListGrammar.json --fuzzed-invariants $invs_to_fuzz --serialiazed-objects daikon-outputs/ListTesterDriver-objects.xml daikon-outputs/ListTesterDriver.dtrace.gz
fi

# GAssert
if [ $technique == "gassert" ] 
then
  echo '> Inferring with GAssert'
fi

echo ''
echo '> Done!'
