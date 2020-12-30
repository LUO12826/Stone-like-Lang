/**
 * @Author 范承祥
 * @CreateTime 2020/10/31
 * @UpdateTime 2020/10/31
 */
package compiler.project.exception;

import org.antlr.v4.runtime.Token;

/**
 * 词法异常
 */
public class LexerException extends Exception {
    /**
     * 异常类型
     */
    private LexerExceptionType type;

    /**
     * 异常行号
     */
    private int line;

    /**
     * 出错字符串
     */
    private String error;

    /**
     * 出错令牌
     */
    private Token offendingSymbol;

    /**
     * 构造函数
     *
     * @param type 异常类型
     * @param line 异常行号
     * @parm error 出错字符串
     */
    public LexerException(LexerExceptionType type, int line) {
        this.type = type;
        this.line = line;
    }

    /**
     * 构造函数
     *
     * @param type 异常类型
     * @param line 异常行号
     * @parm error 出错字符串
     */
    public LexerException(LexerExceptionType type, int line,String error) {
        this.type = type;
        this.line = line;
        this.error = error;
    }

    /**
     * 构造函数
     *
     * @param type 异常类型
     * @param line 异常行号
     * @param offendingSymbol 出错令牌
     */
    public LexerException(LexerExceptionType type, int line,Token offendingSymbol) {
        this.type = type;
        this.line = line;
        this.offendingSymbol = offendingSymbol;
    }

    public LexerExceptionType getType() {
        return type;
    }

    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("\n>>>>> ErrorType: ");
        builder.append(type);
        if(error!=null&&!error.isEmpty()) {
            builder.append("\n>>>>> ErrorSymbol: ");
            builder.append(error);
        }
        builder.append("\n>>>>> ErrorMessage: ");
        builder.append(type.getMessage());
        builder.append("\n>>>>> ErrorLine: ");
        builder.append(line);
        builder.append("\n");
        return  builder.toString();
    }
}
