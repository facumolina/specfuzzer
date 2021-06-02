#!/bin/bash

# This script allows to setup the analysis for a class of a GASSERT subject

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }
[[ -z "$GASSERTDIR" ]] && { echo "> The environment variable GASSERTDIR is empty" ; exit 1; }
[[ -z "$DAIKONDIR" ]] && { echo "> The environment variable DAIKONDIR is empty" ; exit 1; }

# Read arguments
gassert_subject=$1
fqname=$2
method_name=$3

# Create useful constants
gassert_dir=$GASSERTDIR
subject_sources=$gassert_dir/subjects/$gassert_subject
class_package=$(echo "$fqname" | sed 's/\.[^.]*$//')
class_name=${fqname##*.}
tests_dir=experiments/gassert/$gassert_subject/tests
results_dir=experiments/gassert/$gassert_subject
specfuzzer_cp=lib/*

echo ""
echo "> Compiling GAssert subject: $gassert_subject"
pushd $subject_sources > /dev/null
./gradlew -q -Dskip.tests jar
popd > /dev/null
subject_cp=$subject_sources/build/libs/*

# Grammar Extraction
echo '> Grammar Extraction'
java -cp $specfuzzer_cp:$subject_cp grammar.GrammarExtractor $fqname
echo ''

echo '> Done!'
