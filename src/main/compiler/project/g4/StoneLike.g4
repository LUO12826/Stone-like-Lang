grammar StoneLike;

import StoneLikeLex;

statements
	: statement (';')? (statements)?
	;

statement
	: callStatement
	| expression
	| declaration                                                   
	| assignStatement                                               
	| whileStatement                                                                                              
	| ifStatement                                                                                                   
	| returnStatement
	;	

expression
	: expression '&&' boolExpression
	| expression '||' boolExpression
	| '!' expression
	| boolExpression
	;

expressionList
	: expressionList ',' expression 
	| expression
	;

boolExpression
	: additiveExpression relationalOperator additiveExpression 
	| additiveExpression
	;

relationalOperator
	: '<=' 	
	| '>=' 	
	| '==' 	
	| '<' 	
	| '>' 	
	| '!='
	;

additiveExpression
	: additiveExpression operator=('+'|'-') term
	| term
	;

term
	: term operator=('*'|'/') factor
	| factor
	;

factor
	: Identifier
	| Identifier '[' expression ']'
	| '(' expression ')'
	| NumberLiteral
	| StringLiteral
	| '-' factor
	| callStatement
	;

declaration
	: variableDeclaration
	| constantDeclaration
	| functionDeclaration
	;

variableDeclaration
	: 'var' initializerList
	;

constantDeclaration
	: 'const' initializerList
	;

functionDeclaration
	: 'func' Identifier parameterClause codeBlock
	;

initializerList
	: initializer
	| initializer ',' initializerList
	;

initializer
	: Identifier '=' expression
	| Identifier '[' expression ']' '=' '[' expression ( ',' expression )* ']'
	;

parameterClause
	: '(' ')' 
	| '(' parameterList ')'
	;

parameterList
	: Identifier 
	| Identifier '['']'
	| Identifier ',' parameterList
	| Identifier '['']' ',' parameterList
	;

assignStatement
	: leftValue '=' expression
	;

leftValue
	: Identifier 
	| Identifier '[' expression ']'
	;

whileStatement
	: 'while' expression codeBlock
	;

ifStatement
	: 'if' expression codeBlock ( elseClause )*
	;

elseClause
	: 'else' codeBlock 	
	| 'else' ifStatement
	;

returnStatement
	: 'return'
	| 'return' expression
	;

callStatement
	: Identifier '(' expressionList ')'
	| Identifier '(' ')'
	;

codeBlock
	: '{' (statements)? '}'
	;
