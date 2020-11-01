package compiler.project.lexer;

/**
 * @author: 骆荟州
 * @createTime: 2020/10/31 3:46 下午
 * @updateTime:
 */
public class Token {

    public TokenType tokenType;
    public Object value;
    public int line;
    public int col;


    public Token(TokenType tokenType) {
        this.tokenType = tokenType;
    }

    public Token(TokenType tokenType, Object value) {
        this.tokenType = tokenType;
        this.value = value;
    }

    public void setLineCol(int line, int col) {
        this.line = line;
        this.col = col;
    }

    @Override
    public String toString() {
        return "Token{" +
                "tokenType=" + tokenType +
                ", value=" + value +
                ", line=" + line +
                ", col=" + col +
                '}';
    }
}
