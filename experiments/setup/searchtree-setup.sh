#!/bin/bash

# Setup for DataStructures.korat.binarysearchtree.SearchTree case
fqname='DataStructures.korat.binarysearchtree.SearchTree'
tester_base='SearchTreeTester'
omit_pattern=$tester_base'.*'
driver_name='SearchTreeTesterDriver'
driver='testers.SearchTreeTesterDriver'
daikon_out=$SPECFUZZER'/daikon-outputs'
cmp_file=$daikon_out'/SearchTreeTesterDriver.decls-DynComp'
objs_file='daikon-outputs/SearchTreeTesterDriver-objects.xml'
source_file='DataStructures/korat/binarysearchtree/SearchTree.java'

# Actual setup
./experiments/setup/common.sh $fqname $tester_base $driver_name $source_file
 
