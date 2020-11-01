package compiler.project.lexer;

import com.sun.tools.javac.util.FatalError;
import compiler.project.io.CodeReader;

/**
 * @author: 骆荟州
 * @createTime: 2020/10/31 2:58 下午
 * @updateTime:
 *
 * 另一种自动机的不完整实现。
 */
public class LexerAlt {

    enum State {
        START_STATE, // 开始状态
        ID_STATE,    // 标识符状态
        NUMBER_STATE,   // 整型数状态
        STRING_STATE,   // 字符串状态
        SYMBOL_STATE,
        DONE_STATE        // 结束状态
    }

    private StringBuilder tempWord = new StringBuilder();

    private int line = 1;

    private int col = 0;

    private State state = State.START_STATE;

    private CodeReader reader;

    public LexerAlt(CodeReader reader) {
        this.reader = reader;
    }

    public Token nextToken() throws Exception {

        if(reader.peek() == '\0') {
            return null;
        }

        state = State.START_STATE;
        Token token = null;
        char c = reader.nextChar();
        if(c == '\0') {
            return null;
        }
        line = reader.getLine();
        col = reader.getCol();
        reader.retract();

        while (state != State.DONE_STATE) {
            c = reader.nextChar();
            if(isLetter(c)) {
                switch (state) {
                    case START_STATE:
                        state = State.ID_STATE;
                        break;
                    case ID_STATE:
                    case STRING_STATE:
                        break;
                    case NUMBER_STATE:
                        token = handleNumberDone();
                        break;
                    case SYMBOL_STATE:
                        token = handleSymbolDone();
                    default:

                }
            }
            else if(isDigit(c)) {
                switch (state) {
                    case START_STATE:
                        state = State.NUMBER_STATE;
                        break;
                    case ID_STATE:
                    case STRING_STATE:
                    case NUMBER_STATE:
                        break;

                    case SYMBOL_STATE:
                        token = handleSymbolDone();
                    default:
                }
            }
            else {
                switch (state) {
                    case START_STATE:
                        switch (c) {
                            case '\"':
                                state = State.STRING_STATE;
                                break;
                            case '=':
                            case '<':
                            case '>':
                            case '!':
                                token = handleDoubleCharSymbol(c);
                                break;

                            default:
                                TokenType type = Language.symbolMap.get(Character.toString(c));
                                if(type == null) {
                                    state = State.SYMBOL_STATE;
                                }
                                else {
                                    state = State.DONE_STATE;
                                    token = new Token(type);
                                    token.setLineCol(line, col);
                                    reader.nextChar();
                                }
                        }

                        break;
                    case ID_STATE:
                        token = handleIdDone();
                        break;
                    case STRING_STATE:
                        if(c == '\"') {
                            token = handleStringDone();
                        }
                        if(c == '\r' || c == '\n') {
                             throw new FatalError("err2");
                        }
                        break;
                    case NUMBER_STATE:
                        token = handleNumberDone();
                        break;
                    case SYMBOL_STATE:
                        token = handleSymbolDone(c);
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

    private Token handleDoubleCharSymbol(char c) {
        Token token = reader.nextChar() == '='?
                new Token(Language.symbolMap.get(Character.toString(c))) : new Token(Language.symbolMap.get(Character.toString(c) + "="));
        state = State.DONE_STATE;
        reader.nextChar();
        return token;
    }

    private Token handleIdDone() {
        state = State.DONE_STATE;
        String word = tempWord.toString();
        TokenType type = Language.keywordMap.get(word);
        Token token = type == null ? new Token(TokenType.TokenID, word) : new Token(type);
        token.setLineCol(line, col);
        return token;
    }

    private Token handleSymbolDone() {
        state = State.DONE_STATE;
        TokenType type = Language.symbolMap.get(tempWord.toString());
        Token token = type == null? null : new Token(type);
        token.setLineCol(line, col);
        return token;
    }

    private Token handleSymbolDone(char c) {
        tempWord.append(c);
        TokenType type = Language.symbolMap.get(tempWord.toString());
        if(type == null) {
            return null;
        }
        state = State.DONE_STATE;
        Token token = new Token(type);
        token.setLineCol(line, col);
        reader.nextChar();
        return token;
    }

    private Token handleNumberDone() {
        state = State.DONE_STATE;
        double num = Double.parseDouble(tempWord.toString());
        Token token = new Token(TokenType.TokenNumber, num);
        token.setLineCol(line, col);
        return token;
    }

    private Token handleStringDone() {
        state = State.DONE_STATE;
        tempWord.deleteCharAt(0);
        Token token = new Token(TokenType.TokenString, tempWord.toString());
        token.setLineCol(line, col);
        reader.nextChar();
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
