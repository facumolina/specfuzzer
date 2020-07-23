#!/bin/bash

echo '> Cleaning previous mutants'
rm -f mutants.log
rm -rf mutants/

MAJOR_HOME=../major/
target_file=$1;
build_dir=build/classes
source_dir=src/examples/

echo '> Generating mutants with Major for file: '$target_file
$MAJOR_HOME/bin/javac -nowarn -J-Dmajor.export.mutants=true -XMutator:ALL -d $build_dir $source_dir$target_file
echo '> Mutants generated!'
echo ''

echo '> Compiling mutants'
javac -g mutants/1/$target_file -d $build_dir
echo '> Mutants compiled and ready to create mutated traces!'
echo ''

echo '> Generating traces with Chicory'
java -cp $build_dir:lib/daikon.jar daikon.Chicory --output-dir=daikon-outputs/mutants --comparability-file=daikon-outputs/ListTesterDriver.decls-DynComp --ppt-omit-pattern='ListTester.*' --dtrace-file=ListTesterDriver-m1.dtrace.gz testers.ListTesterDriver daikon-outputs/mutants/ListTesterDriver-m1-objects.xml

echo '> Done!'

