// Define the Alloy Expressions Grammar
grammar AlloyExprGrammar;

expr: 
	qt_expr
	;

qt_expr:
	quantifier 'n' ':' set_expr ':' qt_obj_cmp
	;

set_expr:
	type_id '.' closure_op '(' field_id ')'
	;

qt_obj_cmp:
	'n != null'
	;
	  
type_id:
	'List'
	;

field_id : 'next' ; // match lower-case identifiers

closure_op:
	'*'
	| '^'
	;

quantifier:
	'all'
	| 'some'
	;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines