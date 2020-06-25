"""TypesUtils

Module that contains utilities for types

@author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
"""

INTEGER = "Integer"
FLOAT = "Float"
DOUBLE = "Double"
BOOLEAN = "Boolean"

def format_type(type_name):
  """Format the given type name"""
  if type_name=="int":
    return INTEGER
  if type_name=="float":
    return FLOAT
  if type_name=="double":
    return DOUBLE
  if type_name=="boolean":
    return BOOLEAN
  return type_name

def is_numeric(type_name):
	return type_name==INTEGER or type_name==FLOAT or type_name==DOUBLE