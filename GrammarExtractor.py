"""GrammarExtractor

This script allows to extract a grammar of specifications from a Java file. 
The output grammar will allow to build a set of rich relational specifictions (similar to those in the Alloy relational logic)
that capture complex properties over linked structures. 

@author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
"""

import sys
import javalang
import networkx as nx
import json
import GrammarBuilder as builder

def parse_java_file(file):
  """Parse the given Java file"""
  content = file.read()
  return javalang.parse.parse(content)


def build_type_graph(t,visited):
  """Build the type graph from the given starting type"""
  visited.append(t.name)
  type_graph.add_node(t.name)
  # Get the fields of the given type
  fields = [decl for decl in t.body if isinstance(decl,javalang.tree.FieldDeclaration)]
  to_visit = set([])
  for fld in fields:
    if (fld.declarators[0].initializer==None):
      # For each fields that has no initializer
      fld_decl_name = fld.declarators[0].name
      type_graph.add_node(fld.type.name)
      type_graph.add_edge(t.name,fld.type.name,label=fld_decl_name)
      to_visit.add(fld.type.name)

  # Visit each the field type that has not been visited yet
  inner_classes = [decl for decl in t.body if isinstance(decl,javalang.tree.ClassDeclaration)]
  for cl_decl in inner_classes:
    if (cl_decl.name in to_visit):
      build_type_graph(cl_decl,visited)

def traverse_graph(type_name,currExpr,grammar,k):
  """"Traverse the type graph from the given type and extend the given grammar"""
  if (k > 0):
    for edge in type_graph.adj[type_name]:
      label = type_graph[type_name][edge][0]['label']
      if (edge==type_name):
        # We have a closure case, so create the quantificaiton related symbols
        builder.add_quantification_symbols(grammar,type_name,currExpr,label)
        
def extract_grammar(t):
  """Extract the grammar from the obtained type graph"""
  print("Extracting grammar from initial type:",t.name)
  grammar = builder.create()
  traverse_graph(t.name,t.name,grammar,bound)
  print()
  print("Symbols:")
  for name in grammar:
    print(name,":",grammar[name])
  print()
  print("Full grammar:",json.dumps(grammar))

type_graph = nx.MultiDiGraph() # Type graph of the SUT
bound = 3 # Bound on graph exploration

if __name__ == "__main__":
  
  # Get the arguments
  java_file = open(sys.argv[1], "r")
  
  # Parse the given java file
  print("Parsing java file:",java_file.name)
  tree = parse_java_file(java_file)
  main_type = tree.types[0]
  print()

  # Build the corresponding type graph
  print("Building the Type Graph")
  build_type_graph(main_type,[])
  print("nodes: ",type_graph.nodes.data())
  print("edges: ",type_graph.edges.data())
  print()

  # Extract the Grammar
  print("Generating the Grammar from the Type Graph")
  extract_grammar(main_type)
  print()
  print("Done!")
