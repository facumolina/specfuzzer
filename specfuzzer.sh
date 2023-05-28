#!/bin/bash

# SpecFuzzer - A Tool for Inferring Class Specifications via Grammar-based Fuzzing
#
# This script allows to perform the two steps of SpecFuzzer, which are a setup step and the actual inference step.
# Usage:
# 1. Setup setup: ./specfuzzer.sh --setup <classpath> <target_class> <test_suite>
# 2. Postcondition inference: ./specfuzzer.sh --infer <classpath> <target_class> <test_suite>

# First, verify that the required environment variables are set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is not set" ; exit 1; }
[[ -z "$DAIKONDIR" ]] && { echo "> The environment variable DAIKONDIR is not set" ; exit 1; }
[[ -z "$MAJOR_HOME" ]] && { echo "> The environment variable MAJOR_HOME is not set" ; exit 1; }

target_classpath=$2;
target_class=$3;


echo '> SpecFuzzer'

if [ "$1" = "--setup" ]; then
  target_class_src=$4;
  test_suite=$5;
  ./setup/setup.sh $target_classpath $target_class $target_class_src $test_suite
  exit 0
fi

if [ "$1" = "--infer" ]; then
  echo 'step: inference'
fi

echo './specfuzzer.sh: invalid option: '$1
echo 'usage: ./specfuzzer.sh --states <classpath> <target_class> <test_suite>'
echo '       ./specfuzzer.sh --infer <classpath> <target_class> <test_suite>'
exit 1
