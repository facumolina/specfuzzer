#!/bin/bash

class=$1
method=$2

count_total=0
for file in $class'-'$method*.csv; do
  count=$(python filtered-unique.py $file $class $method)
  echo 'Count in file '$file': '$count
  count_total=$((count_total+count))
done
echo 'Total: '$count_total
echo 'Avg: '$((count_total/10))
