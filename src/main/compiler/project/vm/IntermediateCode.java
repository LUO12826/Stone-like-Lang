package compiler.project.vm;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/14 11:20 上午
 * @updateTime:
 */
public class IntermediateCode {

    public VMInstructionType instructionType;

    public Object op1;

    public Object op2;

    public MemorySegment segment;

    public IntermediateCode(VMInstructionType type, Object op1, Object op2, MemorySegment segment) {
        this.instructionType = type;
        this.op1 = op1;
        this.op2 = op2;
        this.segment = segment;
    }

    public IntermediateCode(VMInstructionType type, MemorySegment segment, Object op1) {
        this.instructionType = type;
        this.segment = segment;
        this.op1 = op1;
    }

    public IntermediateCode(VMInstructionType type, Object op1) {
        this.instructionType = type;
        this.op1 = op1;
    }

    public IntermediateCode(VMInstructionType type) {
        this.instructionType = type;
    }

}