#!/bin/bash

# This script allows to setup the analysis for a class of a SF110 project

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }
[[ -z "$SF110SRC" ]] && { echo "> The environment variable SF110SRC is empty" ; exit 1; }
[[ -z "$DAIKONDIR" ]] && { echo "> The environment variable DAIKONDIR is empty" ; exit 1; }

# Read arguments
sf110_project=$1
class_name=$2
method_name=$3

# Some useful variables
project_dir=$EVOSPEX/src/test/resources/sf110/$sf110_project
project_sources=$SF110SRC/$sf110_project
class_dir=$project_dir/$class_name
fqname=$(cat $project_dir/target-classes.txt | grep "\.$class_name")
class_package=$(echo "$fqname" | sed 's/\.[^.]*$//')
method_dir=$class_dir/$method_name
tests_dir=$method_dir/2/tests
results_dir=experiments/sf110/$sf110_project

echo '> Compiling project'
cur_dir=$(pwd)
cd $project_sources
ant clean compile
cd $cur_dir

echo '> Extracting Grammar for class '$sf110_project'/'$fqname
java -cp dest/jar/FuzzSpecs.jar:lib/*:$SF110SRC/$sf110_project/build/classes/:$SF110SRC/$sf110_project/lib/* grammar.GrammarExtractor $fqname


echo ''
echo '> Tests exercising current method: '$tests_dir
echo '> Compiling tests..'
find $tests_dir -name "Regression*.java" > $tests_dir/sources.txt
mkdir -p $tests_dir/build/classes
cp_for_tests_compilation=$project_sources/build/classes/:$project_sources/lib/*:$EVOSPEX/lib/hamcrest-core-1.3.jar:$EVOSPEX/lib/junit-4.12.jar
javac -cp $cp_for_tests_compilation -g @$tests_dir/sources.txt -d $tests_dir/build/classes

echo ''
mkdir -p $results_dir
cp_for_daikon=build/classes/:lib/*:$cp_for_tests_compilation:$tests_dir/build/classes/
output_dir=$results_dir/$class_name/$method_name
echo '> Dynamic Comparability Analysis'
timeout 1m java -cp $cp_for_daikon daikon.DynComp $class_package.RegressionTestDriver --output-dir=$results_dir --decl-file=$class_name-$method_name.decls

if [ -f "$results_dir/$class_name-$method_name.decls" ]; then
    echo "$class_name-$method_name.decls exists."
else 
    echo "$class_name-$method_name.decls does not exist."
fi

echo '> Running Chicory for dtrace generation from driver: '$class_package'.RegressionTestDriver'
java -cp $cp_for_daikon daikon.Chicory --output-dir=$results_dir --comparability-file=$results_dir/$class_name-$method_name.decls --ppt-select-pattern=".*$method_name.*" --dtrace-file=$class_name-$method_name.dtrace.gz $class_package.RegressionTestDriver $results_dir/$class_name-$method_name-objects.xml
echo 'Objects saved in file: '$results_dir'/'$class_name'-'$method_name'-objects.xml'
echo ''

./experiments/sf110/gen-mutants.sh $sf110_project $class_name $method_name

echo '> Done!'
