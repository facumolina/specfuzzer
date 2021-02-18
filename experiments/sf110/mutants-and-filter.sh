#!/bin/bash

# This script allows to generate the mutants for a class of SF110 project and then to filter invariants from a previous steps taking into account its mutation killing ability.

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }
[[ -z "$SF110SRC" ]] && { echo "> The environment variable SF110SRC is empty" ; exit 1; }
[[ -z "$EVOSPEX" ]] && { echo "> The environment variable EVOSPEX is empty" ; exit 1; }

# Read arguments
sf110_project=$1
class_name=$2
method_name=$3

# Some useful variables
project_dir=$EVOSPEX/src/test/resources/sf110/$sf110_project
project_sources=$SF110SRC/$sf110_project
class_dir=$project_dir/$class_name
fqname=$(cat $project_dir/target-classes.txt | grep "\.$class_name")
method_dir=$class_dir/$method_name
tests_dir=$method_dir/2/tests
results_dir=experiments/sf110/$sf110_project
objects_file=$results_dir/$class_name-$method_name-objects.xml
dtrace_file=$results_dir/$class_name-$method_name.dtrace.gz

# Major vars
MAJOR_HOME=../major/
build_dir=$project_sources/build/classes
source_dir=$project_sources/src/main/java
target_file=$(find $SF110SRC/$sf110_project -name $class_name.java)

# Start
echo '> Generating mutants for SF110 project class'
echo '> Cleaning previous mutants'
echo '> Target: '$sf110_project'/'$fqname
$MAJOR_HOME/bin/javac -cp $SF110SRC/$sf110_project/build/classes/:$SF110SRC/$sf110_project/lib/ -nowarn -J-Dmajor.export.mutants=true -XMutator:ALL -d $build_dir $target_file
echo '> Mutants generated!'
echo ''

echo '> Processing mutants'
reduced_file=${target_file#"$source_dir"}
for dir in mutants/*/
do
  echo '> Processing mutant: '$dir$reduced_file
  echo '> Compiling mutant'
  echo '> Mutant compiled'
  echo '> Generating traces with Chicory from mutant'
done
echo 'All traces generated!'
echo ''

echo '> Filtering'
echo ''
 
# Build classpath
cp_for_tests_compilation=$project_sources/build/classes/:$project_sources/lib/*:$EVOSPEX/lib/hamcrest-core-1.3.jar:$EVOSPEX/lib/junit-4.12.jar
#javac -cp $cp_for_tests_compilation -g @$tests_dir/sources.txt -d $tests_dir/build/classes

#cp_for_daikon=build/classes/:lib/*:$cp_for_tests_compilation:$tests_dir/build/classes/

echo '> Results saved in '$results_dir

echo '> Done!'
