#!/bin/bash

# Setup for DataStructures.AvlTreeList class

# Define vars
fqname='DataStructures.kodkod.IntTreeSet'
tester_base='IntTreeSetTester'
omit_pattern=$tester_base'.*'
driver_name='IntTreeSetTesterDriver'
driver='testers.IntTreeSetTesterDriver'
daikon_out=$SPECFUZZER'/daikon-outputs'
cmp_file=$daikon_out'/IntTreeSetTesterDriver.decls-DynComp'
objs_file='daikon-outputs/IntTreeSetTesterDriver-objects.xml'
source_file='DataStructures/kodkod/IntTreeSet.java'

./experiments/setup/common.sh $fqname $tester_base $driver_name $source_file
