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
class_package=$(echo "$fqname" | sed 's/\.[^.]*$//')
method_dir=$class_dir/$method_name
tests_dir=$method_dir/2/tests
results_dir=experiments/sf110/$sf110_project
decls_file=$results_dir/$class_name-$method_name.decls
objects_file=$results_dir/$class_name-$method_name-objects.xml
dtrace_file=$results_dir/$class_name-$method_name.dtrace.gz

# Major vars
MAJOR_HOME=../major/
build_dir=$project_sources/build/classes
source_dir=$project_sources/src/main/java
target_file=$(find $SF110SRC/$sf110_project -name $class_name.java)

# Create mutants dir
mkdir -p $results_dir/mutants/

# Start
echo '> Generating mutants for SF110 project class'
echo '> Cleaning previous mutants'
echo '> Target: '$sf110_project'/'$fqname
$MAJOR_HOME/bin/javac -cp $SF110SRC/$sf110_project/build/classes/:$SF110SRC/$sf110_project/lib/ -nowarn -J-Dmajor.export.mutants=true -XMutator:ALL -d $build_dir $target_file
mv mutants.log $results_dir/mutants/$class_name-$method_name'-mutants.log'
echo '> Mutants generated!'
echo ''

echo '> Processing mutants'
reduced_file=${target_file#"$source_dir"}
cp_for_tests_compilation=$project_sources/build/classes/:$project_sources/lib/*:$EVOSPEX/lib/hamcrest-core-1.3.jar:$EVOSPEX/lib/junit-4.12.jar
cp_for_daikon=build/classes/:lib/*:$cp_for_tests_compilation:$tests_dir/build/classes/
for dir in mutants/*/
do
  echo '> Processing mutant: '$dir$reduced_file
  dir2=${dir%*/}
  number=${dir2##*/}
  mutant_line=$(sed $number"q;d" $results_dir/mutants/$class_name-$method_name'-mutants.log')
  echo 'Mutant line: '$mutant_line
  if [[ $mutant_line == *$class_name':'* || $mutant_line == *$class_name*'<init>'* || $mutant_line == *$class_name*$method_name* ]]; then
    echo '> Compiling mutant'
    javac -cp $cp_for_tests_compilation -g $dir$reduced_file -d $build_dir
    #javac -cp $SF110SRC/$sf110_project/build/classes/:$SF110SRC/$sf110_project/lib/* -g $dir$reduced_file -d $build_dir
    echo '> Mutant compiled'
    echo '> Generating traces with Chicory from mutant'
    java -cp $cp_for_daikon daikon.Chicory --output-dir=$results_dir/mutants --comparability-file=$decls_file --ppt-select-pattern=".*$method_name.*" --dtrace-file=$class_name-$method_name-m$number.dtrace.gz $class_package.RegressionTestDriver $results_dir/mutants/$class_name-$method_name-m$number-objects.xml
  else
    echo '> Mutant not processed since it does not include current method or is not over an attribute'
  fi
done
echo '> All mutated traces generated!'
echo '> Results saved in '$results_dir
echo '> Done!'
