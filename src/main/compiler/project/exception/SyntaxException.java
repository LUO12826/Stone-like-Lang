/**
 * @Author 范承祥
 * @CreateTime 2020/12/20
 * @UpdateTime 2020/12/20
 */
package compiler.project.exception;

import org.antlr.v4.runtime.Token;

public class SyntaxException {
    /**
     * 异常类型
     */
    private SyntaxExceptionType type;

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
    public SyntaxException(SyntaxExceptionType type, int line) {
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
    public SyntaxException(SyntaxExceptionType type, int line,String error) {
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
    public SyntaxException(SyntaxExceptionType type, int line,Token offendingSymbol) {
        this.type = type;
        this.line = line;
        this.offendingSymbol = offendingSymbol;
    }

    public SyntaxExceptionType getType() {
        return type;
    }

    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("ErrorType: ");
        builder.append(type);
        if(error!=null&&!error.isEmpty()) {
            builder.append("\nErrorSymbol: ");
            builder.append(error);
        }
        builder.append("\nErrorMessage: ");
        builder.append(type.getMessage());
        builder.append("\nErrorLine: ");
        builder.append(line);
        builder.append("\n");
        return  builder.toString();
    }
}
