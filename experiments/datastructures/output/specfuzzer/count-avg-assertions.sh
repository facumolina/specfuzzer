#!/bin/bash

class=$1
method=$2

count_total=0
for file in $class'-'$method*.assertions; do
  count=0
  count_enabled=1
  while read p; do
    if [[ $p == *':::OBJECT'* || $p == *'================='* || $p == *':::EXIT'* || $p == *':::ENTER'* ]]; then
      if [[ $p == *':::OBJECT'* || $p == *$class'.'$method'('*':::EXIT'* ]]; then
        # AvlTreeList.remove
	count_enabled=1
      else
	count_enabled=0
      fi
      continue;
    fi
    if [[ $count_enabled == 1 ]]; then
      count=$((count+1))
    fi
  done <$file
  echo 'Count in file '$file': '$count
  count_total=$((count_total+count))
done
echo 'Total: '$count_total
echo 'Avg: '$((count_total/10))
