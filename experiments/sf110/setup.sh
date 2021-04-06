#!/bin/bash

# This script allows to setup the analysis for a class of a SF110 project

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }
[[ -z "$SF110SRC" ]] && { echo "> The environment variable SF110SRC is empty" ; exit 1; }
[[ -z "$DAIKONDIR" ]] && { echo "> The environment variable DAIKONDIR is empty" ; exit 1; }

# Read arguments
sf110_project=$1
fqname=$2
method_name=$3

# Create useful constants
sf110_dir=$SF110SRC
project_sources=$SF110SRC/$sf110_project
class_package=$(echo "$fqname" | sed 's/\.[^.]*$//')
class_name=${fqname##*.}
tests_dir=experiments/sf110/$sf110_project/tests
results_dir=experiments/sf110/$sf110_project

echo ""
echo "> Compiling project: $sf110_project"
pushd $sf110_dir/$sf110_project > /dev/null
ant clean compile
popd > /dev/null

echo ""
echo '> Extracting Grammar for class '$sf110_project'/'$fqname
java -cp dest/jar/FuzzSpecs.jar:lib/*:$SF110SRC/$sf110_project/build/classes/:$SF110SRC/$sf110_project/lib/* grammar.GrammarExtractor $fqname

echo ''
echo '> Tests exercising current method: '$tests_dir
echo '> Compiling tests..'
mkdir -p $tests_dir/build/classes
cp_for_tests_compilation=$project_sources/build/classes/:$project_sources/lib/*:$EVOSPEX/lib/hamcrest-core-1.3.jar:$EVOSPEX/lib/junit-4.12.jar
javac -cp $cp_for_tests_compilation -g $tests_dir/testers/*.java -d $tests_dir/build/classes

echo ''
mkdir -p $results_dir
cp_for_daikon=build/classes/:lib/*:$cp_for_tests_compilation:$tests_dir/build/classes/
output_dir=$results_dir/$class_name/$method_name
decls_file=$class_name-$method_name.decls
echo '> Dynamic Comparability Analysis'
timeout 1m java -cp $cp_for_daikon daikon.DynComp testers.$class_name'TesterDriver' --output-dir=$results_dir --decl-file=$decls_file

if [ -f "$results_dir/$class_name-$method_name.decls" ]; then
    echo "$class_name-$method_name.decls exists."
else 
    echo "$class_name-$method_name.decls does not exist."
fi

driver=testers.$class_name'TesterDriver'

echo '> Running Chicory for dtrace generation from driver: '$driver
java -cp $cp_for_daikon daikon.Chicory --output-dir=$results_dir --comparability-file=$results_dir/$decls_file --ppt-select-pattern=".*$method_name.*" --dtrace-file=$class_name-$method_name.dtrace.gz $driver $results_dir/$class_name-$method_name-objects.xml
echo 'Objects saved in file: '$results_dir'/'$class_name'-'$method_name'-objects.xml'
echo ''

./experiments/sf110/gen-mutants.sh $sf110_project $fqname $method_name

echo '> Done!'
