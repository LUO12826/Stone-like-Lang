/**
 * @Author 范承祥
 * @CreateTime 2020/10/31
 * @UpdateTime 2020/10/31
 */
package compiler.project.exception;

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
     * 构造函数
     *
     * @param type 异常类型
     * @param line 异常行号
     */
    public LexerException(LexerExceptionType type, int line) {
        this.type = type;
        this.line = line;
    }

    public LexerExceptionType getType() {
        return type;
    }

    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        return "LexerException{" +
                "type=" + type +
                ", line=" + line +
                '}';
    }
}
