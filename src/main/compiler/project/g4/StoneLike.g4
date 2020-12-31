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
    | '[' expression ( ',' expression )* {notifyErrorListeners("缺失 ']'");}
    | expression ( ',' expression )* ']' {notifyErrorListeners("缺失 '['");}
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
	| Identifier '[' expression {notifyErrorListeners("缺失 ']'");}
    | Identifier expression ']' {notifyErrorListeners("缺失 '['");}
    | '(' expression {notifyErrorListeners("缺失 ')'");}
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
	| Identifier '[' expression {notifyErrorListeners("缺失 ']'");}
    | Identifier expression ']' {notifyErrorListeners("缺失 '['");}
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
	| Identifier '(' expressionList {notifyErrorListeners("缺失 ')'");}
	| Identifier expressionList ')' {notifyErrorListeners("缺失 '('");}
	| Identifier '(' {notifyErrorListeners("缺失 ')'");}
    | Identifier ')' {notifyErrorListeners("缺失 '('");}
	;

codeBlock
	: '{' (statement(';')*)* '}'
	| '{' (statement(';')*)* {notifyErrorListeners("缺失 '}'");}
	| (statement(';')*)* '}' {notifyErrorListeners("缺失 '{'");}
	;
