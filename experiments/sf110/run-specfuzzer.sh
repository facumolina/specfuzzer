#!/bin/bash

# This script allows to run specfuzzer for a single method that belongs to a class of a SF110 project. 

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

# Create results dir
results_dir=experiments/sf110/$sf110_project
mkdir -p $results_dir

# Start
echo '> SpecFuzzer'
echo '> Target: '$sf110_project'/'$fqname$'.'$method_name

echo ''
echo '> tests exercising current method: '$tests_dir
echo '> compiling tests ..'
find $tests_dir -name "Regression*.java" > $tests_dir/sources.txt
mkdir -p $tests_dir/build/classes
cp_for_tests_compilation=$project_sources/build/classes/:$project_sources/lib/*:$EVOSPEX/lib/hamcrest-core-1.3.jar:$EVOSPEX/lib/junit-4.12.jar
javac -cp $cp_for_tests_compilation -g @$tests_dir/sources.txt -d $tests_dir/build/classes

echo ''
echo '> Results saved in '$results_dir

echo '> Done!'
