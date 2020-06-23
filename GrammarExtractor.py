"""GrammarExtractor

This script allows to extract a grammar of specifications from a Java file. 
The output grammar will allow to build a set of rich relational specifictions (similar to those in the Alloy relational logic)
that capture complex properties over linked structures. 

@author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
"""

import sys
import javalang
import networkx as nx

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

type_graph = nx.MultiDiGraph() # Type graph of the SUT

if __name__ == "__main__":
  java_file = open(sys.argv[1], "r")
  print("Parsing java file:",java_file.name)
  tree = parse_java_file(java_file)
  print("Building the type graph")
  build_type_graph(tree.types[0],[])
  print()
  print("Type Graph")
  print("nodes: ",type_graph.nodes.data())
  print("edges: ",type_graph.edges.data())
  print()
  print("Done!")
