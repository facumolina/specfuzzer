# fuzzing-specs
Fuzzing Software Specifications

# Requirements

* `java >= 1.8`
* `python >= 3.7`

# Compilation

## Compile sources and create jar

1. `ant compile`
2. `ant jar`

## Run tests
`ant junit`

# Grammar Generation

## Extracting a Grammar

`java -cp dest/jar/FuzzSpecs.jar:lib/* grammar.GrammarExtractor DataStructures.List`

## Fuzzing Specifications

`python FuzzSpecs.py grammars/ListGrammar.json 1`

`java -cp dest/jar/FuzzSpecs.jar fuzzer.Fuzzer grammars/ListGrammar.json`

## Running the Alloy expressions parser
`java -cp lib/antlr-4.7.1-complete.jar:build/classes/ org.antlr.v4.gui.TestRig antlr.AlloyExprGrammar expr -tree`

# Running Daikon with the Fuzzing support

## Run DynComp
`java -cp build/classes/:lib/daikon.jar daikon.DynComp DataStructures.ListTester --output-dir=daikon-outputs`

## Run Chicory front-end
`java -cp build/classes/:lib/daikon.jar daikon.Chicory --output-dir=daikon-outputs/ --comparability-file=daikon-outputs/ListTester.decls-DynComp DataStructures.ListTester`

## Run Daikon from Fuzzed specs

