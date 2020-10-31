package compiler.project.lexer;

<<<<<<< HEAD
import compiler.project.exception.LexerException;
import compiler.project.exception.LexerExceptionType;
import compiler.project.io.CodeReader;

=======
import compiler.project.io.CodeReader;

import java.util.HashSet;
import java.util.Set;

>>>>>>> lhz
/**
 * @author: 骆荟州
 * @createTime: 2020/10/31 2:58 下午
 * @updateTime:
 */
public class Lexer {

<<<<<<< HEAD
=======
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

>>>>>>> lhz
    private StringBuilder tempWord = new StringBuilder();

    private int line = 1;

    private int col = 0;

<<<<<<< HEAD
=======
    private State state = State.START_STATE;

>>>>>>> lhz
    private CodeReader reader;

    public Lexer(CodeReader reader) {
        this.reader = reader;
    }

<<<<<<< HEAD
    public Token nextToken() throws LexerException {
        // 获取下一个非空字符
        char c = reader.nextNotSpaceChar();

        if (isLetter(c)) {
            // 字母
            tempWord.append(c);
            c = reader.nextChar();
            while (isLetter(c) || isDigit(c)) {
                tempWord.append(c);
                c = reader.nextChar();
            }

            // 回退
            reader.retract();

            // 获取临时单词串
            String word = tempWord.toString();

            // 清空临时单词数组
            tempWord.setLength(0);

            // 查找关键字表
            if (Language.keywordMap.containsKey(word)) {
                return new Token(Language.keywordMap.get(word));
            }

            // 填充符号表并返回索引
            SymbolTableItem item = new SymbolTableItem();
            item.setName(word);
            item.setLine(line);
            Language.symbolTable.add(item);
            int index = Language.symbolTable.size() - 1;

            return new Token(TokenType.TokenID, index);
        } else if (isDigit(c)) {
            // 数字
            tempWord.append(c);
            c = reader.nextChar();
            while (isDigit(c)) {
                tempWord.append(c);
                c = reader.nextChar();
            }

            //判断是否为非法标识符
            if (isLetter(c)) {
                reader.retract();
                tempWord.setLength(0);
                throw new LexerException(LexerExceptionType.IllegalIdentifier, line);
            }

            // 回退
            reader.retract();

            // 填充常量表并获取索引
            double number = Double.parseDouble(tempWord.toString());
            Language.numberLiteralTable.add(number);
            int index = Language.numberLiteralTable.size() - 1;

            // 清空临时单词数组
            tempWord.setLength(0);

            return new Token(TokenType.TokenNumber, index);
        }
        switch (c) {
            case '=':
                c = reader.nextChar();
                if (c == '=') {
                    return new Token(TokenType.TokenEqual);
                }
                reader.retract();
                return new Token(TokenType.TokenAssign);

            case '!':
                c = reader.nextChar();
                if (c == '=') {
                    return new Token(TokenType.TokenNotEqual);
                }
                reader.retract();
                return new Token(TokenType.TokenNot);

            case '>':
                c = reader.nextChar();
                if (c == '=') {
                    return new Token(TokenType.TokenGreaterEqual);
                }
                reader.retract();
                return new Token(TokenType.TokenGreater);

            case '<':
                c = reader.nextChar();
                if (c == '=') {
                    return new Token(TokenType.TokenLessEqual);
                }
                reader.retract();
                return new Token(TokenType.TokenLess);

            case '\"':
                c = reader.nextChar();
                while (!isDoubleQuotationOrNewline(c) && c != '\0') {
                    tempWord.append(c);
                    c = reader.nextChar();
                }

                // 判断双引号是否未闭合
                if (c == '\n' || c == '\r' || c == '\0') {
                    reader.retract();
                    tempWord.setLength(0);
                    throw new LexerException(LexerExceptionType.NotClosedDoubleQuotation, line);
                }

                // 填充常量表并获取索引
                String literalString = tempWord.toString();
                Language.stringLiteralTable.add(literalString);
                int index = Language.stringLiteralTable.size() - 1;

                // 清空临时单词表
                tempWord.setLength(0);

                return new Token(TokenType.TokenString, index);
            case '+':
                return new Token(TokenType.TokenAdd);
            case '-':
                return new Token(TokenType.TokenSub);
            case '*':
                return new Token(TokenType.TokenMul);
            case '/':
                return new Token(TokenType.TokenDiv);
            case '(':
                return new Token(TokenType.TokenLeftParen);
            case ')':
                return new Token(TokenType.TokenRightParen);
            case '{':
                return new Token(TokenType.TokenLeftBarce);
            case '}':
                return new Token(TokenType.TokenRightBrace);
            case '[':
                return new Token(TokenType.TokenLeftBracket);
            case ']':
                return new Token(TokenType.TokenRightBracket);
            case ';':
                return new Token(TokenType.TokenSemicolon);
            case ',':
                return new Token(TokenType.TokenComma);
            case '\r':
                // Windows或早期Mac平台换行符处理
                line++;
                c = reader.nextChar();
                if (c == '\n') {
                    return new Token(TokenType.TokenNewline);
                }
                reader.retract();
                return new Token(TokenType.TokenNewline);
            case '\n':
                // Unix及新版本Mac换行符处理
                line++;
                return new Token(TokenType.TokenNewline);
            case '\0': {
                return new Token(TokenType.TokenEOF);
            }
            default:
                reader.retract();
                tempWord.setLength(0);
                throw new LexerException(LexerExceptionType.IllegalCharacter, line);
        }

    }

    /**
     * 是否为字母
     * @param c 字符
     * @return 是否为字母
     */
=======
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

>>>>>>> lhz
    private boolean isLetter(char c) {
        return Character.isLetter(c);
    }

<<<<<<< HEAD
    /**
     * 是否为数字
     * @param c 字符
     * @return 是否为数字
     */
=======

>>>>>>> lhz
    private boolean isDigit(char c) {
        return Character.isDigit(c);
    }

<<<<<<< HEAD
    /**
     * 是否为双引号或换行符
     * @param c 字符
     * @return 是否为双引号或换行符
     */
    private boolean isDoubleQuotationOrNewline(char c) {
=======
    private boolean isCharExceptDquoteNewline(char c) {
>>>>>>> lhz
        return c == '"' || c == '\r' || c == '\n';
    }

}