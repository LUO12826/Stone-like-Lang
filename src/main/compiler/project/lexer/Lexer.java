package compiler.project.lexer;

import compiler.project.exception.LexerException;
import compiler.project.exception.LexerExceptionType;
import compiler.project.io.CodeReader;

/**
 * @author: 范承祥
 * @createTime: 2020/10/31 2:58 下午
 * @updateTime:
 */

/**
 * 词法分析器
 */
public class Lexer {

    /**
     * 临时单词串
     */
    private StringBuilder tempWord = new StringBuilder();

    /**
     * 行号
     */
    private int line = 1;

    /**
     * 源代码读入器
     */
    private CodeReader reader;


    public Lexer(CodeReader reader) {
        this.reader = reader;
    }

    /**
     * 获取下一个Token
     * @return Token
     * @throws LexerException 词法分析错误异常
     */
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

            // 填充标识符表并返回索引
            SymbolTableItem item = new SymbolTableItem();
            item.setName(word);
            item.setLine(line);
            int index = Language.addSymbolTableItem(item);

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
                tempWord.append(c);
                String error = tempWord.toString();
                reader.retract();
                tempWord.setLength(0);
                throw new LexerException(LexerExceptionType.IllegalIdentifier, line, error);
            }

            // 判断是否为浮点数
            if(c == '.'){
                tempWord.append(c);
                c = reader.nextChar();
                if(isDigit(c)){
                    while (isDigit(c)) {
                        tempWord.append(c);
                        c = reader.nextChar();
                    }

                    //判断是否为非法实数
                    if (isLetter(c)) {
                        tempWord.append(c);
                        String error = tempWord.toString();
                        reader.retract();
                        tempWord.setLength(0);
                        throw new LexerException(LexerExceptionType.IllegalReal, line, error);
                    }

                    // 回退
                    reader.retract();

                    // 填充常量表并获取索引
                    double number = Double.parseDouble(tempWord.toString());
                    int index = Language.addNumberLiteral(number);

                    // 清空临时单词数组
                    tempWord.setLength(0);

                    return new Token(TokenType.TokenNumber, index);
                }
                tempWord.append(c);
                String error = tempWord.toString();
                reader.retract();
                tempWord.setLength(0);
                throw new LexerException(LexerExceptionType.IllegalReal, line, error);
            }

            // 回退
            reader.retract();

            // 填充常量表并获取索引
            double number = Double.parseDouble(tempWord.toString());
            int index = Language.addNumberLiteral(number);

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
                int index = Language.addStringLiteral(literalString);

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
                return new Token(TokenType.TokenLeftBrace);
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
                throw new LexerException(LexerExceptionType.IllegalCharacter, line, String.valueOf(c));
        }

    }

    /**
     * 是否为字母
     * @param c 字符
     * @return 是否为字母
     */
    private boolean isLetter(char c) {
        return Character.isLetter(c);
    }

    /**
     * 是否为数字
     * @param c 字符
     * @return 是否为数字
     */
    private boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    /**
     * 是否为双引号或换行符
     * @param c 字符
     * @return 是否为双引号或换行符
     */
    private boolean isDoubleQuotationOrNewline(char c) {
        return c == '"' || c == '\r' || c == '\n';
    }

}
