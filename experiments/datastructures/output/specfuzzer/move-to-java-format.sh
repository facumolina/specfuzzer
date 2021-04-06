#!/bin/bash

class=$1
method=$2

dir=experiments/datastructures/output/specfuzzer

echo 'Copying invs for: '$class'.'$method
for file in $dir/$class'-'$method*.assertions; do
  echo 'Processing file: '$file
  invs_file="${file/.assertions/.inv.gz}"
  echo 'Copying invs from: '$invs_file
  java -cp build/classes/:lib/* daikon.PrintInvariants $invs_file --ppt-select '.'$class':::OBJECT' --format java > $file
  java -cp build/classes/:lib/* daikon.PrintInvariants $invs_file --ppt-select '.'$class'\.'$method'.' --format java >> $file 
done
echo 'Done!'
