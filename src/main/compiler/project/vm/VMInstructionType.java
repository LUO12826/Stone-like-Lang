package compiler.project.vm;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/14 10:25 上午
 * @updateTime:
 */
public enum VMInstructionType {

    add("add"),     //加法
    sub("sub"),     //减法
    neg("neg"),
    mul("mul"),     //乘法
    div("div"),     //除法
    and("and"),     //逻辑与
    or("or"),       //逻辑或
    not("not"),     //逻辑取反
    push("push"),   //入栈
    pop("pop"),     //弹栈
    jump("jump"),   //无条件跳转
    jumpc("jumpc"), //条件跳转
    gt("gt"),       // 大于
    lt("lt"),       // 小于
    ge("ge"),       // 大于或等于
    le("le"),       // 小于或等于
    ne("ne"),       // 不等于
    eq("eq"),       // 等于
    call("call"),   //函数调用
    ret("ret"),     // 函数返回
    print("print"),
    halt("halt"),
    ;
    public String string;

    VMInstructionType(String string) {
        this.string = string;
    }
}
