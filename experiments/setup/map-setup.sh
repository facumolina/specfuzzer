#!/bin/bash

# Setup for gassert.BasicMethod class 

# Define vars
fqname='DataStructures.eiffel.Map'
tester_base='MapTester'
driver_name='MapTesterDriver'
source_file='DataStructures/eiffel/Map.java'

./experiments/setup/common.sh $fqname $tester_base $driver_name $source_file
 
