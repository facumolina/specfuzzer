#!/bin/bash

# Setup for gassert.BasicMethod class 

# Define vars
fqname='DataStructures.eiffel.Composite'
tester_base='CompositeTester'
driver_name='CompositeTesterDriver'
source_file='DataStructures/eiffel/Composite.java'

./experiments/setup/common.sh $fqname $tester_base $driver_name $source_file
 
