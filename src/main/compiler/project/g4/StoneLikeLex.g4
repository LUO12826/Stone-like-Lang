lexer grammar StoneLikeLex;

If
	: 'if'
	;

Else
	: 'else'
	;
	
While
	: 'while'
	;

Return
	: 'return'
	;

Var
	: 'var'
	;

Const
	: 'const'
	;

Func
	: 'func'
	;

Add
	: '+'
	;
	
Sub
	: '-'
	;
	
Mul
	: '*'
	;

Div
	: '/'
	;

Assign
	: '='
	;

Equal
	: '=='
	;

NotEqual
	: '!='
	;
	
Less
	: '<'
	;

LessEqual
	: '<='
	;
	
Greater
	: '>'
	;
	
GreaterEqual
	: '>='
	;
	
Not
	: '!'
	;

And
	: '&&'
	;
	
Or
	: '||'
	;
	
LeftParen
	: '('
	;
	
RightParen
	: ')'
	;
	
LeftBrace
	: '{'
	;

RightBrace
	: '}'
	;
	
LeftBracket
	: '['
	;
	
RightBracket
	: ']'
	;
	
Semicolon
	: ';'
	;
	
Comma
	: ','
	;

Dquote
	: '"'
	;

Dot
    : '.'
    ;

Identifier
	: Alpha ( Digit | Alpha )*
	;

IntegerLiteral
	: Digit ( Digit )*
	;

RealLiteral
    : IntegerLiteral ( '.' IntegerLiteral )?
    ;

StringLiteral
	: '"' (.)*? '"'
	;

Alpha
	: [a-zA-Z]
	;

Digit
	: [0-9]
	;

Whitespace
	: [ \t\r\n]+ -> skip
	;

Comment
	: '/*' (.)*? '*/' -> skip
	;