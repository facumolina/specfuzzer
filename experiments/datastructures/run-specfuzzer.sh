#!/bin/bash

dtrace=$1
objects=$2
grammar=$3
invstofuzz=$4
invfile=$5
class=$6
method=$7
outputfile=$8

echo '> Running Daikon + SpecFuzzer on dtrace file: '$dtrace

java -cp build/classes/:lib/* daikon.Daikon --grammar-to-fuzz $grammar --fuzzed-invariants $invstofuzz --serialiazed-objects $objects $dtrace

rm -f $outputfile
echo ''
echo '> Writing output to file: '$outputfile
java -cp build/classes/:lib/* daikon.PrintInvariants $invfile --ppt-select '.'$class':::OBJECT' > $outputfile
java -cp build/classes/:lib/* daikon.PrintInvariants $invfile --ppt-select '.'$method'.' >> $outputfile

echo '> Output written.'

