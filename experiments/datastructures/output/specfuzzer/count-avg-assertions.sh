#!/bin/bash

class=$1
method=$2

count_obj_total=0
count_pc_total=0
count_total=0
for file in $class'-'$method*.assertions; do
  count=0
  count_obj=0
  count_pc=0
  count_enabled=1
  isobj=0
  ispc=0
  while read p; do
    if [[ $p == *':::OBJECT'* || $p == *'================='* || $p == *':::EXIT'* || $p == *':::ENTER'* ]]; then
      if [[ $p == *':::OBJECT'* || $p == *$class'.'$method'('*':::EXIT'* ]]; then
	count_enabled=1
	if [[ $p == *':::OBJECT'* ]]; then
	  isobj=1
	  ispc=0
	fi
	if [[ $p == *$class'.'$method'('*':::EXIT'* ]]; then
          isobj=0
          ispc=1
        fi
      else
	count_enabled=0
      fi
      continue;
    fi
    if [[ $count_enabled == 1 ]]; then
      count=$((count+1))
      if [[ $isobj == 1 ]]; then
	count_obj=$((count_obj+1))
      fi
      if [[ $ispc == 1 ]]; then
        count_pc=$((count_pc+1))
      fi
    fi
  done <$file
  echo 'Count in file '$file': '$count' - Obj: '$count_obj' - Pc: '$count_pc
  count_total=$((count_total+count))
  count_obj_total=$((count_obj_total+count_obj))
  count_pc_total=$((count_pc_total+count_pc))
done
echo 'Total: '$count_total
echo 'Avg: '$((count_total/10))
echo 'Total obj: '$count_obj_total
echo 'Avg: '$((count_obj_total/10))
echo 'Total pc: '$count_pc_total
echo 'Avg: '$((count_pc_total/10))
