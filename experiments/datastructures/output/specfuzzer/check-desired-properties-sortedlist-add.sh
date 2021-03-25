#!/bin/bash

assertions_file_base='SortedList-add'

header=$(grep -ri "this.header != null" $assertions_file_base-specfuzzer*.assertions | wc -l)
doubly_linked_1=$(grep -ri "all n : SortedList.header.\*(next + previous) : n = n.next.previous" $assertions_file_base-specfuzzer*.assertions | wc -l)
doubly_linked_2=$(grep -ri "all n : SortedList.header.\*(next + previous) : n = n.previous.next" $assertions_file_base-specfuzzer*.assertions | wc -l)
circular=$(grep -ri "all n : SortedList.header.\*(next + previous) : n in n.^(next + previous)" $assertions_file_base-specfuzzer*.assertions | wc -l)
sorted=$(grep -ri "all n : SortedList.header.\*(next+previous)-SortedList.header-Sorted.List.header.previous : n.element <= n.element.x" $assertions_file_base-specfuzzer*.assertions | wc -l)
size_ok_1=$(grep -ri "#(SortedList.header.\*(next + previous)) = SortedList.size + 1" $assertions_file_base-specfuzzer*.assertions | wc -l)
size_ok_2=$(grep -ri "SortedList.size = #(SortedList.header.\*(next + previous)) - 1" $assertions_file_base-specfuzzer*.assertions | wc -l)
inserted=$(grep -ri "Integer_Variable in SortedList.header.\*(next + previous).element ) holds for: <orig(this) , orig(value)>" $assertions_file_base-specfuzzer*.assertions | wc -l)
size_increased=$(grep -ri "this.size - orig(this.size) - 1 == 0" $assertions_file_base-specfuzzer*.assertions | wc -l)

echo 'No filter applied:'
echo 'header not null: '$header
echo 'doubly linked: '$doubly_linked_1' / '$doubly_linked_2
echo 'circular: '$circular
echo 'sorted: '$sorted
echo 'size: '$size_ok_1' / '$size_ok_2
echo 'inserted: '$inserted
echo 'size increased: '$size_increased

echo ''
header_filter=$(grep -ri "this.header != null" $assertions_file_base-specfuzzer*-invs-by-mutants.csv | wc -l)
doubly_linked_1_filter=$(grep -ri "all n : SortedList.header.\*(next + previous) : n = n.next.previous" $assertions_file_base-specfuzzer*-filteredinvs.xml | wc -l)
doubly_linked_2_filter=$(grep -ri "all n : SortedList.header.\*(next + previous) : n = n.previous.next" $assertions_file_base-specfuzzer*-filteredinvs.xml | wc -l)
circular_filter=$(grep -ri "all n : SortedList.header.\*(next + previous) : n in n.^(next + previous)" $assertions_file_base-specfuzzer*-filteredinvs.xml | wc -l)
sorted_filter=$(grep -ri "all n : SortedList.header.\*(next+previous)-SortedList.header-Sorted.List.header.previous : n.element <= n.element.x" $assertions_file_base-specfuzzer*-filteredinvs.xml | wc -l)
size_ok_1_filter=$(grep -ri "#(SortedList.header.\*(next + previous)) = SortedList.size + 1" $assertions_file_base-specfuzzer*-filteredinvs.xml | wc -l)
inserted_filter=$(grep -ri "Integer_Variable in SortedList.header.\*(next + previous).element" $assertions_file_base-specfuzzer*-filteredinvs.xml | wc -l)
size_increased_filter=$(grep -ri "this.size - orig(this.size) - 1 == 0" $assertions_file_base-specfuzzer*-invs-by-mutants.csv | wc -l)
echo 'Mutant filter applied:'
echo 'header: '$header_filter
echo 'doubly linked: '$doubly_linked_1_filter' / '$doubly_linked_2_filter
echo 'circular: '$circular_filter
echo 'sorted: '$sorted_filter
echo 'size: '$size_ok_1_filter
echo 'inserted: '$inserted_filter
echo 'size increased: '$size_increased_filter
