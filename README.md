# spec-fuzzer
SpecFuzzer: Fuzzing Software Specifications

# Requirements

* `java >= 1.8`
* `python >= 3.7`

# Compilation

Compile sources and create jar:

1. `ant compile`
2. `ant jar`

Run tests

`ant junit`

# Alloy Parser Generation

`java -jar lib/antlr-4.7.1-complete.jar -package antlr -o src/main/ antlr/AlloyExprGrammar.g4`

# Grammar Generation

Extracting a Grammar from class:

`java -cp dest/jar/FuzzSpecs.jar:lib/* grammar.GrammarExtractor DataStructures.List`

Fuzzing Specifications

Python: `python FuzzSpecs.py grammars/ListGrammar.json 1`

Java: `java -cp dest/jar/FuzzSpecs.jar:lib/* fuzzer.BasicFuzzer grammars/ListGrammar.json`

Running the Alloy expressions parser

`java -cp lib/antlr-4.7.1-complete.jar:build/classes/ org.antlr.v4.gui.TestRig antlr.AlloyExprGrammar expr -tree`

# Running Daikon with the Fuzzing support

Run DynComp to perform dynamic comparability:

`java -cp build/classes/:lib/daikon.jar daikon.DynComp testers.ListTesterDriver --output-dir=daikon-outputs`

Run Chicory front-end to produce the dtrace file from the tester class:

`java -cp build/classes/:lib/daikon.jar daikon.Chicory --output-dir=daikon-outputs/ --comparability-file=daikon-outputs/ListTesterDriver.decls-DynComp --ppt-omit-pattern='ListTester.*' testers.ListTesterDriver daikon-outputs/ListTesterDriver-objects.xml`

Run Daikon including Fuzzed Invariants:

`java -cp "build/classes/:lib/*" daikon.Daikon --grammar-to-fuzz grammars/ListGrammar.json --fuzzed-invariants 10 --serialiazed-objects daikon-outputs/ListTesterDriver-objects.xml daikon-outputs/ListTesterDriver.dtrace.gz`

Check Daikon inferred invariants:

`java -cp build/classes/:lib/* daikon.tools.InvariantChecker --conf --serialiazed-objects daikon-outputs/ListTesterDriver-objects.xml ListTesterDriver.inv.gz daikon-outputs/ListTesterDriver.dtrace.gz`

