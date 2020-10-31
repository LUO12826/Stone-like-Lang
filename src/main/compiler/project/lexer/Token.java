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
}
