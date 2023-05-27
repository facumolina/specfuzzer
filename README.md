![SpecFuzzer Logo](https://github.com/facumolina/specfuzzer/blob/master/img/specfuzzer-logo.png "SpecFuzzer Logo")

SpecFuzzer is a tool for inferring class specifications of Java classes. Given a Java class and a test suite for it, SpecFuzzer uses a combination of grammar-based fuzzing, dynamic invariant detection and mutation analysis, to automatically infer class specifications for the given class. Such specifications are essentially assertions related to specific program points, such as class invariants, preconditions and postconditions.  

## Requirements

* `ant >= 1.10`
* `java >= 1.8`
* `python >= 3.7`

## Build

SpecFuzzer can be built with the following command:
```bash
ant compile jar
```

To run its tests:
```bash
ant junit
```

## Running SpecFuzzer on a simple example

SpecFuzzer takes as input a target Java class For this example, our target class will be the ```SorterList``` class. 

### Setup step

This step simply sets the conditions for the next (inference) step. It is performed with the following command:
```bash
./specfuzzer.sh --setup <cp> <target_class> <test_suite>
```
where ```<cp>``` is the target classpath, ```<target_class>``` is the fully quallified name of the target class and ```<test_suite>``` is the test suite fully quallified name. This execution will performing the following tasks:

1. The extraction of a grammar from the target class. 
2. The execution of the test suite to obtain the execution traces in the ```dtrace``` format used by Daikon, our invariant detector.
3. The generation of mutants with Major, and the execution of test suite for each one of the mutants. 

NOTE: as target classes may have many mutants, the third step can be computationally expensive and in ocassions may require a considerable amount of time. 

### Inference step

## Running SpecFuzzer on other classes

To run SpecFuzzer on any given class, you will need:
* the target classpath ```<cp>```
* the fully quallified name of the target class ```<target_class>```
* the fully quallified name of the test suite ```<test_suite>```

From there, the two steps can be performed as follows:

```bash
./specfuzzer.sh --setup <cp> <target_class> <test_suite>
./specfuzzer.sh --infer <cp> <target_class> <test_suite>
```

<!---

## Other useful commands

### Alloy Parser Generation

`java -jar lib/antlr-4.7.1-complete.jar -package antlr -o src/main/ antlr/AlloyExprGrammar.g4`

### Grammar Generation

Extracting a Grammar from class:

`java -cp dest/jar/FuzzSpecs.jar:lib/* grammar.GrammarExtractor DataStructures.List`

Fuzzing Specifications

`java -cp dest/jar/FuzzSpecs.jar:lib/* fuzzer.BasicFuzzer grammars/ListGrammar.json`

### Running Daikon with the Fuzzing support

Run DynComp to perform dynamic comparability:

`java -cp build/classes/:lib/daikon.jar daikon.DynComp testers.ListTesterDriver --output-dir=daikon-outputs`

Run Chicory front-end to produce the dtrace file from the tester class:

`java -cp build/classes/:lib/daikon.jar daikon.Chicory --output-dir=daikon-outputs/ --comparability-file=daikon-outputs/ListTesterDriver.decls-DynComp --ppt-omit-pattern='ListTester.*' testers.ListTesterDriver daikon-outputs/ListTesterDriver-objects.xml`

Run Daikon including Fuzzed Invariants:

`java -cp "build/classes/:lib/*" daikon.Daikon --grammar-to-fuzz grammars/ListGrammar.json --fuzzed-invariants 10 --serialiazed-objects daikon-outputs/ListTesterDriver-objects.xml daikon-outputs/ListTesterDriver.dtrace.gz`

Check Daikon inferred invariants:

`java -cp build/classes/:lib/* daikon.tools.InvariantChecker --conf --serialiazed-objects daikon-outputs/ListTesterDriver-objects.xml ListTesterDriver.inv.gz daikon-outputs/ListTesterDriver.dtrace.gz`

-->

