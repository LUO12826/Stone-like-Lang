grammar StoneLike;

import StoneLikeLex;

program
	: (globalStatement(';')*)*
	;

globalStatement
	: callStatement
	| expression
	| valueDeclaration
	| functionDeclaration
	| assignStatement
	| whileStatement
	| ifStatement
	;

functionBlockStatement
    : callStatement
    | expression
    | valueDeclaration
    | assignStatement
    | whileStatement
    | ifStatement
    | returnStatement
    ;


statement
	: callStatement
	| expression
	| valueDeclaration
	| assignStatement
	| whileStatement
	| ifStatement
	;


expression
	: expression '&&' boolExpression
	| expression '||' boolExpression
	| '!' expression
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
	: 'func' Identifier parameterClause functionBlock
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
	| Identifier '=' arrayExpression
	;

leftValue
	: Identifier
	| Identifier '[' expression ']'
	;

whileStatement
	: 'while' expression commonCodeBlock
	;

ifStatement
	: 'if' expression commonCodeBlock ( elseClause )*
	;

elseClause
	: 'else' commonCodeBlock
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

commonCodeBlock
	: '{' (statement(';')*)* '}'
	;

functionBlock
    : '{' (functionBlockStatement(';')*)* '}'
    ;
