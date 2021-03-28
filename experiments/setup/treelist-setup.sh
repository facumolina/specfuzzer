#!/bin/bash

# Setup for DataStructures.commonscollections.TreeList class
 
# Define vars
fqname='DataStructures.commonscollections.TreeList'
tester_base='TreeListTester'
omit_pattern=$tester_base'.*'
driver_name='TreeListTesterDriver'
driver='testers.TreeListTesterDriver'
daikon_out=$SPECFUZZER'/daikon-outputs'
cmp_file=$daikon_out'/TreeListTesterDriver.decls-DynComp'
objs_file='daikon-outputs/TreeListTesterDriver-objects.xml'
source_file='DataStructures/commonscollections/TreeList.java'

./experiments/setup/common.sh $fqname $tester_base $driver_name $source_file

