![SpecFuzzer Logo](https://github.com/facumolina/specfuzzer/blob/master/img/specfuzzer-logo.png "SpecFuzzer Logo")

SpecFuzzer is a tool for inferring class specifications of Java classes. Given a Java class and a test suite for it, SpecFuzzer uses a combination of grammar-based fuzzing, dynamic invariant detection and mutation analysis, to automatically infer class specifications for the given class. These specifications are essentially assertions related to specific program points, such as class invariants, preconditions and postconditions.  

## Requirements

* `ant >= 1.10`
* `java >= 1.8`
* `python >= 3.7`
* [`daikon 5.8.2 (our modified version)`](https://github.com/facumolina/daikon-specfuzzer)
* [`major v1.3.4`](https://mutation-testing.org/)

## Installation

### Local installation

The installation requires downloading and installing SpecFuzzer, Daikon and Major. First, after cloning this repo, build the tool with the following command:
```bash
ant compile jar
```
Second, clone and build our Daikon version (including support for fuzzed specs):  
```bash
git clone https://github.com/facumolina/daikon-specfuzzer.git
cd daikon-specfuzzer
./build.sh
```
Third, download and uncompress [Major v1.3.4](https://mutation-testing.org/downloads/files/major-1.3.4_jre7.zip)

Finally, set the following environment variables:
```bash
export SPECFUZZER=<working_dir>/specfuzzer
export DAIKONDIR=<working_dir>/daikon-specfuzzer
export MAJOR_HOME=<working_dir>/major
```

## Running SpecFuzzer on a simple example

SpecFuzzer takes as input a target Java class and a test suite for it. As an example, let's consider the following class and test suite included within SpecFuzzer:
* target class: ```DataStructures.SortedList```
* target test suite: ```testers.SortedListTesterDriver```

From these inputs, the execution of SpecFuzzer involvers the following steps:

### Setup step

The setup simply sets the conditions for the next (inference) step, and can be performed as follows:
```bash
./specfuzzer.sh --setup build/classes DataStructures.SortedList testers.SortedListTesterDriver
```
This execution will perform the following tasks: 
1. The extraction of a grammar from the target class: . 
2. The execution of the test suite to obtain the execution traces in the ```dtrace``` format used by Daikon, our invariant detector.
3. The generation of mutants with Major, and the execution of the test suite for each one of the mutants. 

All related files will be saved on folder: ```output/DataStructures.SortedList/setup/```.

NOTE: as Major may produce many mutants for the target classes, the execution of the test suite for each mutant can be expensive and in ocassions may require a considerable amount of time. 

### Inference step

The inference step performs the actual inference of class specifications, and can be performed as follows:
```bash
./specfuzzer.sh --infer build/classes DataStructures.SortedList testers.SortedListTesterDriver
```
The execution of this step involves the execution of the _assertion fuzzer_ to obtain candidate specifications, the execution of Daikon to determine de likely invariants, and the execution of the _assertion selector_ to discard redundant/irrelevant assertions.
During the execution of this step, relevant information will be reported, and at the end, the discovered class specifications will be reported and saved in a file:
```java
...
```

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

