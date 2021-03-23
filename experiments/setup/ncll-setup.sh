#!/bin/bash

# Setup for DataStructures.commonscollections.NodeCachingLinkedList class
 
# Define vars
fqname='DataStructures.commonscollections.NodeCachingLinkedList'
tester_base='NodeCachingLinkedListTester'
omit_pattern=$tester_base'.*'
driver_name='NodeCachingLinkedListTesterDriver'
driver='testers.NodeCachingLinkedListTesterDriver'
daikon_out=$SPECFUZZER'/daikon-outputs'
cmp_file=$daikon_out'/NodeCachingLinkedListTesterDriver.decls-DynComp'
objs_file='daikon-outputs/NodeCachingLinkedListTesterDriver-objects.xml'
source_file='DataStructures/commonscollections/NodeCachingLinkedList.java'

./experiments/setup/common.sh $fqname $tester_base $driver_name $source_file

