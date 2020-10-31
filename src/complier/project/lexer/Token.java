package main.project.lexer;

/**
 * @author: 骆荟州
 * @createTime: 2020/10/30 11:03 下午
 * @updateTime:
 */
public enum Token {

    TokenFunc("func"),
    TokenIf("if"),
    TokenElse("else"),
    TokenWhile("while"),
    TokenVar("var"),
    TokenConst("const"),
    TokenReturn("return"),

    TokenAdd("+"),
    TokenSub("-"),
    TokenMul("*"),
    TokenDiv("/"),
    TokenAssign("="),
    TokenEqual("=="),
    TokenNotEqual("!="),
    TokenLess("<"),
    TokenLessEqual("<="),
    TokenGreater(">"),
    TokenGreaterEqual(">="),
    TokenNot("!"),
    TokenAnd("&&"),
    TokenOr("||"),

    TokenLeftParen("("),
    TokenRightParen(")"),
    TokenSemicolon(";"),
    TokenComma(","),
    TokenNewline("\n|\r|\r\n"),

    TokenEOF("<eof>"),
    TokenString("<string>"),
    TokenNumber("<number>"),
    TokenID("<id>");

    private String str;
    public Object value;
    public int line;
    public int col;

    private Token(String str) {
        this.str = str;
    }

    public String getString() { return str; }

}
