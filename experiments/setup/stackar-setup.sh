#!/bin/bash

# Setup for DataStructures.daikon.StackAr class 

# Define vars
fqname='DataStructures.daikon.StackAr'
tester_base='StackArTester'
omit_pattern=$tester_base'.*'
driver_name='StackArTesterDriver'
driver='testers.StackArTesterDriver'
daikon_out=$SPECFUZZER'/daikon-outputs'
cmp_file=$daikon_out'/StackArTesterDriver.decls-DynComp'
objs_file='daikon-outputs/StackArTesterDriver-objects.xml'
source_file='DataStructures/daikon/StackAr.java'

./experiments/setup/common.sh $fqname $tester_base $driver_name $source_file
 
