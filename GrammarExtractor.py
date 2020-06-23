"""GrammarExtractor

This script allows to extract a grammar of specifications from a Java file. 
The output grammar will allow to build a set of rich relational specifictions (similar to those in the Alloy relational logic)
that capture complex properties over linked structures. 

@author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
"""

import sys
import javalang

def parse_java_file(file):
  """Parse the given Java file"""
  content = file.read()
  return javalang.parse.parse(content)


def build_type_graph(t,visited):
  """Build the type graph from the given starting type"""
  print(t.name)
  visited.append(t.name)
  fields = [decl for decl in t.body if isinstance(decl,javalang.tree.FieldDeclaration)]
  to_visit = set([])
  for fld in fields:
    if (fld.declarators[0].initializer==None):
      print(fld.declarators[0].name,"-->",fld.type.name)  
      to_visit.add(fld.type.name)

  print() 
  inner_classes = [decl for decl in t.body if isinstance(decl,javalang.tree.ClassDeclaration)]
  for cl_decl in inner_classes:
    if (cl_decl.name in to_visit):
      build_type_graph(cl_decl,visited)

if __name__ == "__main__":
  java_file = open(sys.argv[1], "r")
  tree = parse_java_file(java_file)
  build_type_graph(tree.types[0],[])
