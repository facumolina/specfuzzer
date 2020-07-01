# fuzzing-specs
Fuzzing Software Specifications

# Extracting a grammar

`java -cp dest/jar/FuzzSpecs.jar:lib/* grammar.GrammarExtractor DataStructures.List`

# Fuzzing Specifications

`python FuzzSpecs.py grammars/ListGrammar.json 10`

# Running the Alloy expressions parser
`java -cp lib/antlr-4.7.1-complete.jar:build/classes/ org.antlr.v4.gui.TestRig antlr.AlloyExprGrammar expr -tree`

