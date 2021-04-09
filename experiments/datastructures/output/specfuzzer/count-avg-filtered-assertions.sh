#!/bin/bash

class=$1
method=$2

count_total=0
count_obj_total=0
count_pc_total=0
for file in $class'-'$method*.csv; do
  count=$(python filtered-unique.py $file $class $method)
  count_obj=$(python filtered-unique-obj.py $file $class $method)
  count_pc=$(python filtered-unique-pc.py $file $class $method)
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
