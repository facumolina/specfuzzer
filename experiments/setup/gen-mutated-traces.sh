#!/bin/bash

echo '> Cleaning previous mutants'
rm -f mutants.log
rm -rf mutants/

MAJOR_HOME=../major/
target_file=$1;
driver_base=$2;
build_dir=build/classes
source_dir=src/examples/

echo '> Generating mutants with Major for file: '$target_file
$MAJOR_HOME/bin/javac -nowarn -J-Dmajor.export.mutants=true -XMutator:ALL -d $build_dir $source_dir$target_file
echo '> Mutants generated!'
echo ''

echo '> Processing mutants'
for dir in mutants/*/     # list directories in the form "/tmp/dirname/"
do
  echo '> Procesing mutant: '$dir$target_file
  echo '> Compiling mutant'
  javac -g $dir$target_file -d $build_dir
  echo '> Mutant compiled'
  echo '' 
  echo '> Generating traces with Chicory from mutant'
  dir2=${dir%*/}
  number=${dir2##*/}
  java -cp $build_dir:lib/daikon.jar daikon.Chicory --output-dir=daikon-outputs/mutants --comparability-file=daikon-outputs/$driver_base'Driver.decls-DynComp' --ppt-omit-pattern=$driver_base'.*' --dtrace-file=$driver_base'Driver-m'$number'.dtrace.gz' testers.$driver_base'Driver' daikon-outputs/mutants/$driver_base'Driver-m'$number'-objects.xml'
done

echo '> Done!'
