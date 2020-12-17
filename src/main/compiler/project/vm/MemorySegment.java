package compiler.project.vm;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/14 11:22 上午
 * @updateTime:
 *
 * StoneLike虚拟机指令中可操作的内存段。
 *
 * LOCAL指当前函数的栈帧空间。目前，全局作用域被当作是一个巨大的函数，而不是C语言中那样的一个特殊作用域。
 * STATIC目前被当成一个临时空间，而不是C语言中的全局作用域。
 * ARGUMENT被设计来传递参数，不过之后可能会通过运算栈来传参数，就用不到它了。
 * HEAP目前被用于数组寻址。
 * NULL目前只在pop指令中用到，用于直接从栈上弹出并丢弃一个数。
 */
public enum MemorySegment {

    LOCAL("LOCAL"),
    STATIC("STATIC"),
    ARGUMENT("ARGUMENT"),
    CONSTANT("CONSTANT"),
    HEAP("HEAP"),
    NULL("NULL"),
    ;

    private String string;

    public String getString() {
        return string;
    }

    MemorySegment(String string) {
        this.string = string;
    }
}
