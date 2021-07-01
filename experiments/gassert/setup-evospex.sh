#!/bin/bash

# This script allows to setup the analysis for EvoSpex for a class of a GASSERT subject

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }
[[ -z "$EVOSPEX" ]] && { echo "> The environment variable EVOSPEX is empty" ; exit 1; }
[[ -z "$EVOSPEXOG" ]] && { echo "> The environment variable EVOSPEXOG is empty" ; exit 1; }
[[ -z "$GASSERTDIR" ]] && { echo "> The environment variable GASSERTDIR is empty" ; exit 1; }

# Read arguments
gassert_subject=$1
fqname=$2
method=$3

# Create useful variables
gassert_dir=$GASSERTDIR
subject_sources=$gassert_dir/subjects/$gassert_subject
class_package=$(echo "$fqname" | sed 's/\.[^.]*$//')
class_name=${fqname##*.}

# Compile project
echo ""
echo "> Compiling GAssert subject: $gassert_subject"
pushd $subject_sources > /dev/null
./gradlew -q -Dskip.tests jar
popd > /dev/null
subject_cp="$subject_sources/build/libs/*"
echo ''

# Check for dir and files
resources_dir=$subject_sources/evospex-resources
classes_file=$resources_dir/classes.txt
method_file=$resources_dir/method.txt
[ ! -d "$resources_dir" ] && { echo "> Directory $resources_dir DOES NOT exists."; exit 1; }
[[ ! -f "$classes_file" ]] && { echo "> File $classes_file DOES NOT exists."; exit 1; }
[[ ! -f "$method_file" ]] && { echo "> File $method_file DOES NOT exists."; exit 1; }

# Run BE generation
echo '> Test Generation'
outdir_tests=$subject_sources/src/test/java
mutator_dir=$EVOSPEXOG/generate-objects

pushd $mutator_dir > /dev/null

testlimit=50000000
testlimit2ph=10000000
outputlimit2ph=5000
timelimit=120 # XX seconds
maxBEit=6 # Up to XX iterations in the first stage of BE
scope=3

echo -e "\n\n> Results for subject: $gassert_subject, class: $class_name, method: $method, scope: $scope"
echo "> Executing: $0 $*"


echo "going to generate JUnit tests in: $outdir_tests"
echo "cleaning up old tests: $outdir_tests"
echo "Finished!"
echo ''

# Mention that the model needs to be created
echo '> Model file: do not forget to create it!'
echo ''