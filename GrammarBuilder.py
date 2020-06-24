"""GrammarBuilder

Module that contains the basic part of the grammars that will later be extended
when analyzing a particular SUT

@author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
"""
import json

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

def extend_grammar(grammar, symbol, value):
  """Add the given value as an option for the symbol of the given grammar"""
  if not grammar.get(symbol):
    grammar[symbol] = []
  grammar[symbol].append(value)

