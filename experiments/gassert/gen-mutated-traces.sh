#!/bin/bash

echo '> Cleaning previous mutants'
rm -f mutants.log
rm -rf mutants/

MAJOR_HOME=../major/
subject_sources=$1
target_file=$2;
driver_base=$3;
build_dir=$subject_sources/build/classes/java/main
source_dir=$subject_sources/src/main/java/
echo 'Build dir: '$build_dir
echo 'Source dir: '$source_dir
echo '> Generating mutants with Major for file: '$target_file
$MAJOR_HOME/bin/javac -cp $build_dir -nowarn -J-Dmajor.export.mutants=true -XMutator:ALL -d $build_dir $source_dir$target_file
echo '> Mutants generated!'
mv mutants.log daikon-outputs/mutants/$driver_base'Driver-mutants.log'
echo ''

#echo '> Processing mutants'
#for dir in mutants/*/     # list directories in the form "/tmp/dirname/"
#do
#  echo '> Procesing mutant: '$dir$target_file
#  echo '> Compiling mutant'
#  javac -cp $build_dir -g $dir$target_file -d $build_dir
#  echo '> Mutant compiled'
#  echo '' 
#  echo '> Generating traces with Chicory from mutant'
#  dir2=${dir%*/}
#  number=${dir2##*/}
#  java -cp $build_dir:lib/daikon.jar daikon.Chicory --output-dir=daikon-outputs/mutants --comparability-file=daikon-outputs/$driver_base'Driver.decls-DynComp' --ppt-omit-pattern=$driver_base'.*' --ppt-omit-pattern='org.junit.*' --dtrace-file=$driver_base'Driver-m'$number'.dtrace.gz' testers.$driver_base'Driver' daikon-outputs/mutants/$driver_base'Driver-m'$number'-objects.xml'
#done

#echo '> Done!'

