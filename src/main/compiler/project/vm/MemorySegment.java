package compiler.project.vm;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/14 11:22 上午
 * @updateTime:
 *
 * StoneLike虚拟机指令中可操作的内存段。
 *
 * LOCAL指当前函数的栈帧空间。目前，全局作用域被当作是一个巨大的函数，而不是C语言中那样的一个特殊作用域。
 * TEMP目前被当成一个临时空间，主要用于数组初始化。
 * DATA指可执行文件中的数据段。
 * CONSTANT指将操作数直接作为值压入栈。
 * HEAP目前被用于数组寻址。
 * GLOBAL_HEAP指在全局作用域进行数组寻址，LOCAL_HEAP指在局部作用域进行数组寻址。
 * NULL目前只在pop指令中用到，用于直接从栈上弹出并丢弃一个数。
 */
public enum MemorySegment {

    GLOBAL("GLOBAL"),
    LOCAL("LOCAL"),
    TEMP("TEMP"),
    DATA("DATA"),
    CONSTANT("CONSTANT"),
    LOCAL_HEAP("LOCAL_HEAP"),
    GLOBAL_HEAP("GLOBAL_HEAP"),
    NULL("NULL"),
    ;

    private final String string;

    public String getString() {
        return string;
    }

    MemorySegment(String string) {
        this.string = string;
    }
}
