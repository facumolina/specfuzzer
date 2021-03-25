#!/bin/bash

sorted=$(grep -ri "all n : List.\*(next) : n.x <= n.next.x" List-insert-specfuzzer*.assertions | wc -l)
acyclic=$(grep -ri "all n : List.\*(next) : n not in n.^(next)" List-insert-specfuzzer*.assertions | wc -l)
inserted=$(grep -ri "Integer_Variable in List.\*(next).x ) holds for: <orig(this) , orig(data)" List-insert-specfuzzer*.assertions | wc -l)
echo 'NoFilter - sorted: '$sorted
echo 'NoFilter - acyclic: '$acyclic
echo 'NoFilter - inserted: '$inserted

echo ''
sorted_filter=$(grep -ri "all n : List.\*(next) : n.x &lt;= n.next.x" List-insert-specfuzzer*-filteredinvs.xml | wc -l)
acyclic_filter=$(grep -ri "all n : List.\*(next) : n not in n.^(next)" List-insert-specfuzzer*-filteredinvs.xml | wc -l)
inserted_filter=$(grep -ri "Integer_Variable in List.\*(next).x" List-insert-specfuzzer*-filteredinvs.xml | wc -l)
echo 'Filter - sorted: '$sorted_filter
echo 'Filter - acyclic: '$acyclic_filter
echo 'Filter - inserted: '$inserted_filter
