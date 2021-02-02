#!/bin/bash

dtrace=$1
invfile=$2
method=$3
outputfile=$4

echo '> Running Daikon on dtrace file: '$dtrace

java -cp build/classes/:lib/* daikon.Daikon $dtrace

rm -f $outputfile
echo ''
echo '> Writing output to file: '$outputfile
java -cp lib/daikon.jar daikon.PrintInvariants $invfile --ppt-select '.:::OBJECT' > $outputfile
java -cp lib/daikon.jar daikon.PrintInvariants $invfile --ppt-select '.'$method'.' >> $outputfile

echo '> Output written.'

