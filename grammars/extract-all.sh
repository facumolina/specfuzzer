#!/bin/bash

# Extract all the grammars that are used to test the system
java -cp "lib/*" grammar.GrammarExtractor gassert.SimpleMethods
java -cp "lib/*" grammar.GrammarExtractor DataStructures.List
java -cp "lib/*" grammar.GrammarExtractor DataStructures.AvlTreeList
java -cp "lib/*" grammar.GrammarExtractor DataStructures.CollectionAttribute
java -cp "lib/*" grammar.GrammarExtractor DataStructures.MapWrapper
java -cp "lib/*" grammar.GrammarExtractor DataStructures.eiffel.Composite
java -cp "lib/*" grammar.GrammarExtractor DataStructures.sf110.Region
