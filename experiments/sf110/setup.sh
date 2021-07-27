#!/bin/bash

# This script allows to setup the analysis for a class of a SF110 project

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }
[[ -z "$SF110SRC" ]] && { echo "> The environment variable SF110SRC is empty" ; exit 1; }
[[ -z "$DAIKONDIR" ]] && { echo "> The environment variable DAIKONDIR is empty" ; exit 1; }

# Read arguments
sf110_project=$1
fqname=$2

# Create useful variables
sf110_dir=$SF110SRC
project_sources=$SF110SRC/$sf110_project
project_bin=$sf110_dir/$sf110_project/build/classes
project_jars=$sf110_dir/$sf110_project/lib
subject_cp="$project_bin:$project_jars/*:$sf110_dir/$sf110_project/build/tests"
class_package=$(echo "$fqname" | sed 's/\.[^.]*$//')
class_name=${fqname##*.}
setup_output_dir=experiments/sf110/$sf110_project/setup-files/
class_config=experiments/sf110/$sf110_project/$class_name
echo ""
echo "> Compiling project: $sf110_project"
pushd $project_sources > /dev/null
ant clean compile
popd > /dev/null

mkdir -p $setup_output_dir
echo ""
echo '> Extracting Grammar for class '$sf110_project'/'$fqname
java -cp lib/*:$subject_cp grammar.GrammarExtractor $fqname $setup_output_dir

# Generate tests
test_class_name=$class_name'Tester'
./experiments/sf110/randoop-gen-tests.sh $sf110_project $fqname $test_class_name

echo ""
echo "> Compiling tests: $sf110_project"
pushd $project_sources > /dev/null
ant compile-tests
popd > /dev/null

# Collect state objects and mutants
echo '> Running DynComp, Chicory and Mutation Analysis with MAJOR'
driver_name=$test_class_name'Driver'
driver_fqname='testers.'$driver_name
echo 'Running DynComp from driver: '$driver_fqname
java -cp lib/daikon.jar:$subject_cp daikon.DynComp $driver_fqname --output-dir=$setup_output_dir
echo ''
cmp_file=$setup_output_dir$driver_name'.decls-DynComp'
omit_pattern=$test_class_name'.*'
objs_file=$setup_output_dir$driver_name'-objects.xml'
echo 'Running Chicory for dtrace generation from driver: '$driver_fqname
java -cp lib/daikon.jar:$subject_cp daikon.Chicory --output-dir=$setup_output_dir --comparability-file=$cmp_file --ppt-omit-pattern=$omit_pattern $driver_fqname $objs_file
echo 'Objects saved in file: '$objs_file
echo ''

# Use Major to create the mutated traces
echo '> Generating mutants with MAJOR'
target_file="${fqname//.//}".java
./experiments/sf110/gen-mutated-traces.sh $sf110_project $target_file $test_class_name
echo ''

echo '> Done!'
