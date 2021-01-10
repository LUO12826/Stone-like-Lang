/**
 * @Author 范承祥
 * @CreateTime 2020/12/20
 * @UpdateTime 2020/12/20
 */
package compiler.project.exception;

/**
 * 语法错误类型
 */
public enum SyntaxExceptionType {
    /**
     * 圆括号未闭合
     */
    MISS_PARENTHESIS("圆括号未闭合"),

    /**
     * 中括号未闭合
     */
    MISS_BRACKET("中括号未闭合"),

    /**
     * 大括号未闭合
     */
    MISS_BRACE("大括号未闭合"),

    /**
     * 缺少逗号
     */
    MISS_COMMA("缺少逗号"),

    /**
     * 没有与之匹配的语法规则
     */
    NO_VIABLE_ALTERNATIVE("没有与之匹配的语法规则"),

    /**
     * 未知类型
     */
    UNKNOWN_TYPE("未知类型");

    private String message;
    SyntaxExceptionType(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
