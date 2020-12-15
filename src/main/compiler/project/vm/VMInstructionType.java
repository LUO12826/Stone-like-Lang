package compiler.project.vm;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/14 10:25 上午
 * @updateTime:
 */
public enum VMInstructionType {

    add("add"),     //加法
    sub("sub"),     //减法
    neg("neg"),     //求相反数
    mul("mul"),     //乘法
    div("div"),     //除法
    and("and"),     //逻辑与
    or("or"),       //逻辑或
    not("not"),     //逻辑取反
    push("push"),   //入栈
    pop("pop"),     //弹栈
    j("j"),   //无条件跳转
    je("je"), //相等则跳转
    jne("jne"), //不相等则跳转
    gt("gt"),       // 大于
    lt("lt"),       // 小于
    ge("ge"),       // 大于或等于
    le("le"),       // 小于或等于
    ne("ne"),       // 不等于
    eq("eq"),       // 等于
    call("call"),   //函数调用
    ret("ret"),     // 函数返回
    print("print"), //输出内容
    halt("halt"),   //程序结束
    ;

    private String string;

    public String getString() {
        return string;
    }

    VMInstructionType(String string) {
        this.string = string;
    }

}
