// Define the Alloy Expressions Grammar
grammar AlloyExprGrammar;

parse
  :  expr EOF
  ;

expr:
  name
  | qt_expr
  | expr binary_op expr
  | expr compare_op expr
  | unary_op expr
  | set_expr
  | NUMBER
	;

qt_expr:
  quantifier name ':' set_expr ':' expr
  ;

set_expr:
  name '.' closure_op '(' closure_field ')'
  ;

compare_op:
  '='
  | '!='
  | 'in'
  | 'not in'
  | '<'
  | '>'
  | '<='
  | '>='
  ;

binary_op:
  '||'
  | 'or'
  | '&&'
  | 'and'
  | 'implies'
  | '=>'
  ;

unary_op:
  '!'
  | 'not'
  | 'no'
  ;

closure_op:
  '*'
  | '^'
  ;

quantifier:
  'all'
  | 'some'
  ;

name:
  ID
  | ID '.' name
  ;

closure_field:
  ID
  | ID '+' closure_field
  ;

ID
  : ID_START ID_CHAR*
  ;

ID_START:
  [A-Z] 
  | [a-z]
  | '_'
  ;

ID_CHAR: 
  ID_START 
  | [0-9]
  ;

NUMBER:
  [0-9]+
  | [0-9]+ '.' [0-9]+
  ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines