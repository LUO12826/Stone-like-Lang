/**
 * @Author 范承祥
 * @CreateTime 2020/12/20
 * @UpdateTime 2020/12/20
 */
package compiler.project.exception;

public enum SyntaxExceptionType {
    MISS_PARENTHESIS("圆括号未闭合"),
    MISS_BRACKET("中括号未闭合"),
    MISS_BRACE("大括号未闭合"),
    MISS_COMMA("缺少逗号"),
    NO_VIABLE_ALTERNATIVE("没有与之匹配的语法规则"),
    UNKNOWN_TYPE("未知类型");

    private String message;
    SyntaxExceptionType(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
