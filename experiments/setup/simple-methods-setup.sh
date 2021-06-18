#!/bin/bash

# Setup for DataStructures.List class 

# Define vars
fqname='gassert.SimpleMethods'
tester_base='SimpleMethodsTester'
omit_pattern=$tester_base'.*'
driver_name='SimpleMethodsTesterDriver'
driver='testers.SimpleMethodsTesterDriver'
daikon_out=$SPECFUZZER'/daikon-outputs'
cmp_file=$daikon_out'/SimpleMethodsTesterDriver.decls-DynComp'
objs_file='daikon-outputs/SimpleMethodsTesterDriver-objects.xml'
source_file='gassert/SimpleMethods.java'

./experiments/setup/common.sh $fqname $tester_base $driver_name $source_file
 
