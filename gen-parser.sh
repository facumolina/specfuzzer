#!/bin/bash

echo '> Generating Parser for grammar defined in file antlr/AlloyExprGrammar.g4'
java -cp lib/antlr-4.7.1-complete.jar org.antlr.v4.Tool -o src/main/ -package antlr antlr/AlloyExprGrammar.g4

echo '> Compiling sources'
ant compile

echo '> Done!'

