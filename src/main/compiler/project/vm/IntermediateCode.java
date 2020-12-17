package compiler.project.vm;

import com.sun.tools.javac.util.StringUtils;
import compiler.project.helper.Helper;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/14 11:20 上午
 * @updateTime:
 *
 * StoneLike虚拟机执行的代码。
 * 只有要通过虚拟机代码为数组字面量赋值的时候用到第二个操作数。
 */
public class IntermediateCode {

    public VMInstructionType instructionType;

    public int op1;

    public int op2 = -1;

    public MemorySegment segment;

    public IntermediateCode(VMInstructionType type, MemorySegment segment, int op1, int op2) {
        this.instructionType = type;
        this.op1 = op1;
        this.op2 = op2;
        this.segment = segment;
    }

    public IntermediateCode(VMInstructionType type, MemorySegment segment, int op1) {
        this.instructionType = type;
        this.segment = segment;
        this.op1 = op1;
    }

    public IntermediateCode(VMInstructionType type, MemorySegment segment) {
        this.instructionType = type;
        this.segment = segment;
    }

    public IntermediateCode(VMInstructionType type, int op1) {
        this.segment = MemorySegment.LOCAL;
        this.instructionType = type;
        this.op1 = op1;
    }

    public IntermediateCode(VMInstructionType type) {
        this.instructionType = type;
        this.segment = MemorySegment.LOCAL;
    }

    @Override
    public String toString() {
        String seg = segment != null ? segment.getString() : "";

        return Helper.fillWithBlank(instructionType.getString(), 6)
                + "\t" + op1 + "\t" + op2 + "\t" + seg;
    }
}
