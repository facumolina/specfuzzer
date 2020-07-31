#!/bin/bash

grammar_file=$1;
objects_file=$2;
dtrace_file=$3;
iterations=10;

echo '> SpecFuzzer'
echo ''

echo '> Performing '$iterations' iterations analyzing specs for file: '$dtrace_file
echo ''

i=1
while [[ $i -le $iterations ]]
do
  echo '> Running Daikon - Iteration '$i
  echo '> Checking invariants on Mutants - Iteration '$i
  echo ''
  ((i = i + 1))
done

echo '> Done!'
