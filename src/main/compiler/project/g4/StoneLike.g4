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
    | '[' expression ( ',' expression )* {notifyErrorListeners("Missing ']'");}
    | expression ( ',' expression )* ']' {notifyErrorListeners("Missing '['");}
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
	| IntegerLiteral
	| RealLiteral
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
	| Identifier '[' expression {notifyErrorListeners("Missing ']'");}
    | Identifier expression ']' {notifyErrorListeners("Missing '['");}
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
	| Identifier '(' expressionList {notifyErrorListeners("Missing ')'");}
	| Identifier expressionList ')' {notifyErrorListeners("Missing ')'");}
	| Identifier '(' {notifyErrorListeners("Missing ')'");}
    | Identifier ')' {notifyErrorListeners("Missing '('");}
	;

codeBlock
	: '{' (statement(';')*)* '}'
	| '{' (statement(';')*)* {notifyErrorListeners("Missing '}'");}
	| (statement(';')*)* '}' {notifyErrorListeners("Missing '{'");}
	;
