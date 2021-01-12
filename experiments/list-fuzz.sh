#!/bin/bash

# This script allows to perform all the steps of the fuzzing based specification inference technique for the List case study. The steps are the following:
# 1. Grammar extraction
# 2. Fuzzing-based inference 
iterations=$1
to_fuzz=$2

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

# Extract the grammar
echo '> Extracting the grammar from class: DataStructures.List'
java -cp dest/jar/FuzzSpecs.jar:lib/* grammar.GrammarExtractor DataStructures.List
echo ''

echo '> Performing Fuzzing-based Specification Inference'
./spec-fuzzer.sh grammars/ListGrammar.json ListTesterDriver $iterations $to_fuzz
echo ''

echo '> Done!'
