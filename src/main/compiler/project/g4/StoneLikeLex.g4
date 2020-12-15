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
	
LeftBarce
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

Identifier
	: Alpha ( Digit | Alpha )*
	;

NumberLiteral
	: Digit ( Digit )*
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

Whitespce
	: [ \t\r\n]+ -> skip
	;

Comment
	: '/*' (.)*? '*/' -> skip
	;