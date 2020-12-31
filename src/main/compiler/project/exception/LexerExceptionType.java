/**
 * @Author 范承祥
 * @CreateTime 2020/10/31
 * @UpdateTime 2020/10/31
 */
package compiler.project.exception;

/**
 * 异常类型
 */
public enum LexerExceptionType {
    /**
     * 双引号未闭合类型
     */
    NotClosedDoubleQuotation("双引号未闭合"),

    /**
     * 非法标识符类型
     */
    IllegalIdentifier("非法标识符"),

    /**
     * 非法字符类型
     */
    IllegalCharacter("非法字符");

    /**
     * 类型信息
     */
    private String message;

    LexerExceptionType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
