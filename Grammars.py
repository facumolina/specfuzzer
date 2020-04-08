import sys

START_SYMBOL = "<start>"

import re

RE_NONTERMINAL = re.compile(r'(<[^<> ]*>)')

def nonterminals(expansion):
    # In later chapters, we allow expansions to be tuples,
    # with the expansion being the first element
    if isinstance(expansion, tuple):
        expansion = expansion[0]

    return re.findall(RE_NONTERMINAL, expansion)

import random

class ExpansionError(Exception):
    pass

def simple_grammar_fuzzer(grammar, start_symbol=START_SYMBOL,
                          max_nonterminals=10, max_expansion_trials=100,
                          log=False):
    term = start_symbol
    expansion_trials = 0

    while len(nonterminals(term)) > 0:
        symbol_to_expand = random.choice(nonterminals(term))
        expansions = grammar[symbol_to_expand]
        expansion = random.choice(expansions)
        new_term = term.replace(symbol_to_expand, expansion, 1)

        if len(nonterminals(new_term)) < max_nonterminals:
            term = new_term
            if log:
                print("%-40s" % (symbol_to_expand + " -> " + expansion), term)
            expansion_trials = 0
        else:
            expansion_trials += 1
            if expansion_trials >= max_expansion_trials:
                raise ExpansionError("Cannot expand " + repr(term))

    return term

LOGICAL_EXPR_GRAMMAR = {
    "<start>":
        ["<logical_expr>"],

    "<logical_expr>":
        ["<integer_comparison>","<quantified_expr>","<reference_comparison>"],

    "<integer_comparison>":
        ["<integer_var> <numeric_logical_op> <integer>","<integer_var> <numeric_logical_op> <integer_operation>"],

    "<quantified_expr>":
        ["<quantifier> n : <integer_set_expr> : n <numeric_logical_op> <integer>"],

    "<reference_comparison>":
        ["<reference_var> <reference_op> <reference_var>"],

    "<quantifier>":
        ["all","some"],

    "<integer_set_expr>":
        ["thiz.header.*next.value"],

    "<reference_op>":
        ["==","!="],
        
    "<boolean_op>":
        ["and", "or", "implies"],

    "<integer_operation>":
        ["<integer_var> <numeric_op> <integer_operation>","<integer>"],

    "<numeric_op>":
        ["+","-"],

    "<numeric_logical_op>":
        ["<",">","<=",">=","!=","=="],

    "<integer>":
        ["<integer_number>","<integer_var>"],

    "<reference_var>":
        ["this", "this.header", "this.header.next", "null"],

    "<integer_var>":
        ["this.header.value","this.size","#(this.header.*next.value)"],

    "<boolean_var>":
        ["a","b"],

    "<integer_number>":
        ["<digit><integer_number>", "<digit>"],

    "<digit>":
        ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
}

if __name__ == "__main__":
    total = sys.argv[1]
    max_non_terminal = sys.argv[2]

    for i in range(int(total)):
        print(simple_grammar_fuzzer(grammar=LOGICAL_EXPR_GRAMMAR, max_nonterminals=int(max_non_terminal)))
