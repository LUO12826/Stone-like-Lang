package compiler.project.vm;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/14 11:22 上午
 * @updateTime:
 */
public enum MemorySegment {
    LOCAL("LOCAL"),
    STATIC("STATIC"),
    ARGUMENT("ARGUMENT"),
    CONSTANT("CONSTANT"),
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
