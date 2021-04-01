#!/bin/bash

# Setup for DataStructures.AvlTreeList class

# Define vars
fqname='DataStructures.AvlTreeList'
tester_base='AvlTreeListTester'
omit_pattern=$tester_base'.*'
driver_name='AvlTreeListTesterDriver'
driver='testers.AvlListTesterDriver'
daikon_out=$SPECFUZZER'/daikon-outputs'
cmp_file=$daikon_out'/AvlTreeListTesterDriver.decls-DynComp'
objs_file='daikon-outputs/AvlTreeListTesterDriver-objects.xml'
source_file='DataStructures/AvlTreeList.java'

./experiments/setup/common.sh $fqname $tester_base $driver_name $source_file
