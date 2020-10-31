package compiler.project.lexer;

import compiler.project.io.CodeReader;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: 骆荟州
 * @createTime: 2020/10/31 2:58 下午
 * @updateTime:
 */
public class Lexer {

    enum State {
        START_STATE, // 开始状态
        ID_STATE,    // 标识符状态
        NUMBER_STATE,   // 整型数状态
        CHAR_STATE,  // 字符状态
        CHAR_STATE_A,
        CHAR_STATE_B,
        CHAR_STATE_C,
        STRING_STATE,   // 字符串状态
        SYMBOL_STATE,
        COMMENT_STATE,   // 注释状态
        DONE_STATE,        // 结束状态
        ERROR_STATE        // 错误状态
    }

    private StringBuilder tempWord = new StringBuilder();

    private int line = 1;

    private int col = 0;

    private State state = State.START_STATE;

    private CodeReader reader;

    public Lexer(CodeReader reader) {
        this.reader = reader;
    }

    public Token nextToken() {

        Token token = new Token(TokenType.TokenEOF);
        char c;

        while (state != State.DONE_STATE) {
            c = reader.nextChar();
            if(isDigit(c)) {
                switch (state) {
                    case START_STATE:
                        break;
                    case ID_STATE:
                        break;
                    case STRING_STATE:
                        break;
                    case NUMBER_STATE:
                        break;
                    default:

                }
            }
            else if(isLetter(c)) {
                switch (state) {
                    case START_STATE:
                        state = State.ID_STATE;
                        break;
                    case ID_STATE:
                        break;
                    case STRING_STATE:
                        break;
                    case NUMBER_STATE:
                        break;
                    default:

                }
            }
            else {
                if(c == '\0') {
                    state = State.DONE_STATE;
                }
                switch (state) {
                    case START_STATE:
                        break;
                    case ID_STATE:
                        state = State.DONE_STATE;
                        String word = tempWord.toString();
                        TokenType type = Language.keywordMap.get(word);
                        token = type == null ? new Token(TokenType.TokenID, word) : new Token(type);
                        token.setLineCol(line, col);
                        break;
                    case STRING_STATE:
                        break;
                    case NUMBER_STATE:
                        break;
                    default:

                }
            }

            tempWord.append(c);
        }

        tempWord.setLength(0);
        reader.retract();
        reader.nextBeforeNotSpaceChar();
        return token;
    }

    private boolean isLetter(char c) {
        return Character.isLetter(c);
    }


    private boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    private boolean isCharExceptDquoteNewline(char c) {
        return c == '"' || c == '\r' || c == '\n';
    }

}
