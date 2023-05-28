#!/bin/bash

echo '> Cleaning previous mutants'
rm -f mutants.log
rm -rf mutants/

target_file=$1;
driver_base=$2;
build_dir=build/classes
source_dir=src/examples/
output_dir=$3

echo '> Generating mutants with Major for file: '$target_file
$MAJOR_HOME/bin/javac -cp $build_dir -nowarn -J-Dmajor.export.mutants=true -XMutator:ALL -d $build_dir $source_dir$target_file
echo '> Mutants generated!'
mv mutants.log $output_dir'/'$driver_base'Driver-mutants.log'
echo ''

echo '> Processing mutants'
for dir in mutants/*/     # list directories in the form "/tmp/dirname/"
do
  echo '> Processing mutant: '$dir$target_file
  echo '> Compiling mutant'
  javac -cp $build_dir -g $dir$target_file -d $build_dir
  echo '> Mutant compiled'
  echo '> Generating traces with Chicory from mutant'
  dir2=${dir%*/}
  number=${dir2##*/}
  java -cp $build_dir:lib/daikon.jar daikon.Chicory --output-dir=daikon-outputs/mutants --comparability-file=$output_dir/$driver_base'Driver.decls-DynComp' --ppt-omit-pattern=$driver_base'.*' --ppt-omit-pattern='org.junit.*' --dtrace-file=$driver_base'Driver-m'$number'.dtrace.gz' testers.$driver_base'Driver' daikon-outputs/mutants/$driver_base'Driver-m'$number'-objects.xml' > /dev/null 2>&1
  echo ''
done

# Move the whole mutants folder to the output folder
mkdir -p $output_dir/mutants-traces
mkdir -p $output_dir/mutants
rm -rf $output_dir/mutants/*
rm -rf $output_dir/mutants-traces/*
mv mutants/* $output_dir/mutants/
mv daikon-outputs/mutants/$driver_base* $output_dir/mutants-traces/

echo '> Done!'

