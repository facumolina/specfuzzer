"""TypesUtils

Module that contains utilities for types

@author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
"""

INTEGER = "Integer"
FLOAT = "Float"
DOUBLE = "Double"
BOOLEAN = "Boolean"

BASIC_JAVA_TYPES = ["int","float","double","boolean"]

def is_reference(java_type_name):
	"""Returns true if the given type is a reference"""
	return (java_type_name not in BASIC_JAVA_TYPES)

def format_type(java_type_name):
  """Format the given type name"""
  if java_type_name=="int":
    return INTEGER
  if java_type_name=="float":
    return FLOAT
  if java_type_name=="double":
    return DOUBLE
  if java_type_name=="boolean":
    return BOOLEAN
  return java_type_name

def is_numeric(formatted_type_name):
	"""Returns true if the given formatted type is numeric or not"""
	return formatted_type_name==INTEGER or formatted_type_name==FLOAT or formatted_type_name==DOUBLE 

def is_integer(formatted_type_name):
	"""Returns true if the given formatted type is integer"""
	return formatted_type_name==INTEGER