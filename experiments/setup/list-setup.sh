#!/bin/bash

# Setup for DataStructures.List class 

# Define vars
fqname='DataStructures.List'
tester_base='ListTester'
omit_pattern=$tester_base'.*'
driver_name='ListTesterDriver'
driver='testers.ListTesterDriver'
daikon_out=$SPECFUZZER'/daikon-outputs'
cmp_file=$daikon_out'/ListTesterDriver.decls-DynComp'
objs_file='daikon-outputs/ListTesterDriver-objects.xml'
source_file='DataStructures/List.java'

./experiments/setup/common.sh $fqname $tester_base $driver_name $source_file
 
