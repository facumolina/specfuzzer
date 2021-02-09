#!/bin/bash

# This script allows to setup the analysis for a class of a SF110 project

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }
[[ -z "$SF110SRC" ]] && { echo "> The environment variable SF110SRC is empty" ; exit 1; }

project=$1
cut=$2

java -cp dest/jar/FuzzSpecs.jar:lib/*:$SF110SRC/$project/build/classes/ grammar.GrammarExtractor $cut

