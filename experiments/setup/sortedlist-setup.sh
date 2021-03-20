#!/bin/bash

# Setup for DataStructures.korat.singlysortedlist.SortedList
 
# Define vars
fqname='DataStructures.korat.singlysortedlist.SortedList'
tester_base='SortedListTester'
omit_pattern=$tester_base'.*'
driver_name='SortedListTesterDriver'
driver='testers.SortedListTesterDriver'
daikon_out=$SPECFUZZER'/daikon-outputs'
cmp_file=$daikon_out'/SortedListTesterDriver.decls-DynComp'
objs_file='daikon-outputs/SortedListTesterDriver-objects.xml'
source_file='DataStructures/korat/singlysortedlist/SortedList.java'

# Actual setup
./experiments/setup/common.sh $fqname $tester_base $driver_name $source_file

