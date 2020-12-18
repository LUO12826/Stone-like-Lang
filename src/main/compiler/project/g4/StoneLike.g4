grammar StoneLike;

import StoneLikeLex;

program
	: (statement(';')*)*
	;

statement
	: callStatement
	| expression
	| valueDeclaration
	| functionDeclaration
	| assignStatement
	| whileStatement
	| ifStatement
	| returnStatement
	;


expression
    : '!' expression
	| expression '&&' expression
	| expression '||' expression
	| boolExpression
	;

arrayExpression
    : '[' expression ( ',' expression )* ']'
    ;

expressionList
	: (expression | arrayExpression) (',' (expression | arrayExpression) )*
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



valueDeclaration
	: variableDeclaration
	| constantDeclaration
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
	: initializer (','initializer)*
	;

initializer
	: Identifier '=' expression
	| Identifier '=' arrayExpression
	;

parameterClause
	: '(' ')'
	| '(' parameterList ')'
	;

parameterList
	: Identifier (','Identifier)*
	;

assignStatement
	: leftValue '=' expression
	| leftValue '=' arrayExpression
	;

leftValue
	: Identifier
	| Identifier '[' expression ']'
	;

whileStatement
	: 'while' expression codeBlock
	;

ifStatement
	: 'if' expression codeBlock ( elseClause )?
	;

elseClause
	: 'else' codeBlock
	| 'else' ifStatement
	;

returnStatement
	: 'return' expression
	| 'return'
	;

callStatement
	: Identifier '(' expressionList ')'
	| Identifier '(' ')'
	;

codeBlock
	: '{' (statement(';')*)* '}'
	;
