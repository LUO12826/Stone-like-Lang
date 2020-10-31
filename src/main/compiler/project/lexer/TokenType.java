package compiler.project.lexer;

/**
 * @author: 骆荟州
 * @createTime: 2020/10/30 11:03 下午
 * @updateTime:
 */
public enum TokenType {

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
    TokenLeftBarce("{"),
    TokenRightBrace("}"),
    TokenLeftBracket("["),
    TokenRightBracket("]"),
    TokenSemicolon(";"),
    TokenComma(","),
    TokenNewline("\n|\r|\r\n"),

    TokenEOF("<eof>"),
    TokenString("<string>"),
    TokenNumber("<number>"),
    TokenID("<id>");

    private String str;

    private TokenType(String str) {
        this.str = str;
    }

    public String getStirng() {
        return str;
    }
}
