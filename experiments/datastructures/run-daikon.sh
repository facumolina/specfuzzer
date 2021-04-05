#!/bin/bash

dtrace=$1
invfile=$2
class=$3
method=$4

outputfile=experiments/datastructures/output/daikon/$class'-'$method'-daikon.assertions'

echo '> Running Daikon on dtrace file: '$dtrace

java -cp build/classes/:lib/* daikon.Daikon $dtrace

rm -f $outputfile
echo ''
echo '> Writing output to file: '$outputfile
java -cp lib/daikon.jar daikon.PrintInvariants $invfile --ppt-select '.'$class':::OBJECT' > $outputfile
java -cp lib/daikon.jar daikon.PrintInvariants $invfile --ppt-select '.'$class'\.'$method'.' >> $outputfile
mv $invfile experiments/datastructures/output/daikon/$class'-'$method.inv.gz

echo '> Output written.'

