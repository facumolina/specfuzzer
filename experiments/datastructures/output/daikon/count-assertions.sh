#!/bin/bash

file=$1
count=0
count_enabled=1
while read p; do
  if [[ $p == *':::OBJECT'* || $p == *'================='* || $p == *':::EXIT'* || $p == *':::ENTER'* ]]; then
    if [[ $p == *':::OBJECT'* || $p == *':::EXIT'* ]]; then
      count_enabled=1
    fi
    if [[ $p == *':::ENTER'* ]]; then
      count_enabled=0
    fi
    continue;
  fi
  if [[ $count_enabled == 1 ]]; then
    count=$((count+1))
  fi
done <$file
echo $count
