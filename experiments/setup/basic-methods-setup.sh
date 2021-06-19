#!/bin/bash

# Setup for gassert.BasicMethod class 

# Define vars
fqname='gassert.BasicMethods'
tester_base='BasicMethodsTester'
omit_pattern=$tester_base'.*'
driver_name='BasicMethodsTesterDriver'
driver='testers.BasicMethodsTesterDriver'
daikon_out=$SPECFUZZER'/daikon-outputs'
cmp_file=$daikon_out'/BasicMethodsTesterDriver.decls-DynComp'
objs_file='daikon-outputs/BasicMethodsTesterDriver-objects.xml'
source_file='gassert/BasicMethods.java'

./experiments/setup/common.sh $fqname $tester_base $driver_name $source_file
 
