"""GrammarBuilder

Module that contains the basic part of the grammars that will later be extended
when analyzing a particular SUT

@author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
"""
import json
import utils.TypesUtil as types_util

# Constant symbols that will be part of all the grammars
START_SYMBOL = "<start>"

# Quantifications
QT_EXPR = "<Quantified_Expr>"
QUANTIFIER = "<Quantifier>"
QUANTIFIER_VALUE = ["all", "some"]

# Reference comparisons
REF_OP = "<Reference_Op>"
REF_OP_VALUE = ["==","!="]

# Reference and Set comparison
VAR_SET_CMP_OP = "<Var_Set_Cmp_Op>"
VAR_SET_CMP_OP_VALUE = ["in", "not in"]

# Numeric operators
NUMERIC_OP = "<Num_Op>"
NUMERIC_OP_VALUE = ["==","!=",">","<",">=","<="]

# Quantified variable name
QT_VAR_NAME = "n"

# Other constants
NULL = "null"

def create():
  """Create a Base Grammar that will serve as base for generating grammars"""
  base_grammar = {}
  base_grammar[START_SYMBOL] = [QT_EXPR]
  base_grammar[QT_EXPR] = []
  base_grammar[QUANTIFIER] = QUANTIFIER_VALUE
  base_grammar[REF_OP] = REF_OP_VALUE
  base_grammar[VAR_SET_CMP_OP] = VAR_SET_CMP_OP_VALUE
  base_grammar[NUMERIC_OP] = NUMERIC_OP_VALUE
  return base_grammar

def get_set_symbol(type_name):
  """Return the non-terminal symbol denoting a set of the given type"""
  return "<" + type_name + "_Set_Expr>"

def get_qt_obj_symbol(type_name):
  """Return the non-terminal symbol denoting a quantified object of the given type"""
  return "<" + type_name + "_Qt_Obj>"

def get_qt_obj_set_symbol(type_name):
  """Return the non-terminal symbol denoting a quantified set of the given type"""
  return "<" + type_name + "_Set_Qt_Expr>"

def get_qt_obj_cmp_symbol(type_name):
  """Return the non-terminal symbol denoting a comparison of objects of a set of the given type"""
  return "<Qt_" + type_name + "_Obj_Cmp>"

def get_qt_obj_dest_cmp_symbol(type_name,dest_type):
  """Return the non-terminal symbol denoting a comparison of objects of a set of the given type"""
  return "<Qt_" + type_name + "_Obj_" + dest_type + "_Cmp>"

def extend_grammar(grammar, symbol, value):
  """Add the given value as an option for the symbol of the given grammar"""
  if not grammar.get(symbol):
    grammar[symbol] = []
  grammar[symbol].append(value)

def get_cmp_symbol(type_name):
  """Get the comparison symbol for the given type"""
  if types_util.is_numeric(type_name):
    return NUMERIC_OP
  else:
    return REF_OP

def add_quantification_symbols(grammar, type_name, currExpr, label):
  """Add quantification symbols to the given grammar"""
  current_set_symbol = get_set_symbol(type_name)
  extend_grammar(grammar,current_set_symbol,currExpr + ".*" + label)
  extend_grammar(grammar,current_set_symbol,currExpr + ".^" + label)
  # Options for the quantified expressions
  current_obj_cmp_symbol = get_qt_obj_cmp_symbol(type_name)
  quantified_option = QUANTIFIER + " " + QT_VAR_NAME + " : " + current_set_symbol + " : " + current_obj_cmp_symbol
  extend_grammar(grammar,QT_EXPR,quantified_option)
  # Options for the quantified objects comparisons
  current_qt_obj_symbol = get_qt_obj_symbol(type_name)
  qt_object_cmp_option = QT_VAR_NAME + " " + REF_OP + " " + current_qt_obj_symbol
  extend_grammar(grammar,current_obj_cmp_symbol,qt_object_cmp_option)
  current_qt_obj_set_symbol = get_qt_obj_set_symbol(type_name)
  qt_var_set_cmp_option = QT_VAR_NAME + " " + VAR_SET_CMP_OP + " " + current_qt_obj_set_symbol
  extend_grammar(grammar,current_obj_cmp_symbol,qt_var_set_cmp_option)
  # Options for the quantified objects 
  extend_grammar(grammar,current_qt_obj_symbol,QT_VAR_NAME + "." + label)
  extend_grammar(grammar,current_qt_obj_symbol,QT_VAR_NAME + "." + label + "." + label)
  extend_grammar(grammar,current_qt_obj_symbol,NULL)
  # Options for the quantified sets
  extend_grammar(grammar,current_qt_obj_set_symbol,QT_VAR_NAME + ".*" + label)
  extend_grammar(grammar,current_qt_obj_set_symbol,QT_VAR_NAME + ".^" + label)

def add_quantification_over_field_symbols(grammar, type_name, currExpr, dest_type, cyclic_label, dest_label):
  """Add quantification symbols to the given grammar"""
  current_set_symbol = get_set_symbol(type_name)
  formatted_dest_type = types_util.format_type(dest_type)
  current_obj_dest_cmp_symbol = get_qt_obj_dest_cmp_symbol(type_name, formatted_dest_type)
  quantified_option = QUANTIFIER + " " + QT_VAR_NAME + " : " + current_set_symbol + " : " + current_obj_dest_cmp_symbol
  extend_grammar(grammar,QT_EXPR,quantified_option)
  # Options for the quantified object field comparison
  cmp_symbol = get_cmp_symbol(formatted_dest_type)
  qt_obj_field_option = QT_VAR_NAME + "." + dest_label + " " + cmp_symbol + " " + QT_VAR_NAME + "." + cyclic_label + "." + dest_label
  extend_grammar(grammar,current_obj_dest_cmp_symbol,qt_obj_field_option)

