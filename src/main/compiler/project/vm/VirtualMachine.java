package compiler.project.vm;

import java.util.List;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/14 10:49 上午
 * @updateTime:
 */
public class VirtualMachine {

    private final static int MEM_SIZE = 65536;

    /**
     * 栈指针
     */
    private int sp;

    /**
     * 程序计数器，指向下一条要执行的代码
     */
    private int pc;

    /**
     * 当前函数栈帧底地址
     */
    private int frameBottomAddr;

    /**
     * 当前函数参数起始地址
     */
    private int argumentAddr;

    private int staticSegmentAddr;

    private List<IntermediateCode> codes;

    private IntermediateCode currentCode;
    private Object[] memory = new Object[MEM_SIZE];


    public VirtualMachine(List<IntermediateCode> codes) {
        this.codes = codes;
        init();
    }

    public VirtualMachine() {
        init();
    }

    public void execute() {
        while(true) {
            currentCode = codes.get(pc);
            pc++;
            switch(currentCode.instructionType) {
                case add:
                case sub:
                case neg:
                case mul:
                case div:
                    executeArithmetic();
                    break;
                case eq:
                case ne:
                case gt:
                case lt:
                case ge:
                case le:
                    executeCompare();
                    break;
                case and:
                case or:
                case not:
                    executeLogic();
                    break;
                case push:
                    executePush();
                    break;
                case pop:
                    executePop();
                    break;
                case call:
                    executeCall();
                    break;
                case ret:
                    executeReturn();
                    break;
                case jump:
                    executeJump();
                    break;
                case jumpc:
                    executeJumpC();
                    break;
                case print:
                    executePrint();
                case halt:
                    return;
            }

        }
    }

    void executePrint() {
        System.out.println(memory[sp]);
    }

    void executeArithmetic() {
        double op2 = (double)memory[sp];
        if(currentCode.instructionType == VMInstructionType.neg) {
            memory[sp] = -op2;
            return;
        }

        double op1 = (double)memory[sp - 1];
        switch(currentCode.instructionType) {
            case add:
                memory[sp -1] = op1 + op2;
                break;
            case sub:
                memory[sp -1] = op1 - op2;
                break;
            case mul:
                memory[sp -1] = op1 * op2;
                break;
            case div:
                memory[sp -1] = op1 / op2;
                break;
        }
        sp--;

    }

    double boolToDouble(boolean val) {
        return val ? 1 : 0;
    }

    void executeCompare() {

        double op1 = (double)memory[sp - 1];
        double op2 = (double)memory[sp];

        switch(currentCode.instructionType) {
            case eq:
                memory[sp - 1] = boolToDouble(op1 == op2);
                break;
            case ne:
                memory[sp - 1] = boolToDouble(op1 != op2);
                break;
            case gt:
                memory[sp - 1] = boolToDouble(op1 > op2);
                break;
            case lt:
                memory[sp - 1] = boolToDouble(op1 < op2);
                break;
            case ge:
                memory[sp - 1] = boolToDouble(op1 >= op2);
                break;
            case le:
                memory[sp - 1] = boolToDouble(op1 <= op2);
                break;
        }
        sp--;
    }

    void executeLogic() {

        double op2 = (double)memory[sp];
        if(currentCode.instructionType == VMInstructionType.not) {
            boolean original = op2 != 0;
            memory[sp] = boolToDouble(!original);
            return;
        }

        double op1 = (double)memory[sp - 1];
        switch(currentCode.instructionType) {
            case and:
                memory[sp - 1] = boolToDouble(op1 != 0 && op2 != 0);
                break;
            case or:
                memory[sp - 1] = boolToDouble(op1 != 0 || op2 != 0);
                break;
        }
        sp--;
    }

    void executePush() {
        sp++;
        Object op1 = currentCode.op1;
        switch(currentCode.segment) {
            case CONSTANT:
                memory[sp] = currentCode.op1;
                break;
            case LOCAL:
                memory[sp] = memory[frameBottomAddr + (int)op1];
                break;
            case ARGUMENT:
                memory[sp] = memory[argumentAddr + (int)op1];
                break;
            case STATIC:
                memory[sp] = memory[staticSegmentAddr + (int)op1];
                break;
        }
    }

    void executePop() {
        Object op1 = memory[sp];
        switch(currentCode.segment) {
            case LOCAL:
                memory[frameBottomAddr + (int)op1] = op1;
                break;
            case ARGUMENT:
                memory[argumentAddr + (int)op1] = op1;
                break;
            case STATIC:
                memory[staticSegmentAddr + (int)op1] = op1;
                break;
        }
        sp--;
    }

    void executeCall() {

    }

    void executeReturn() {

    }

    void executeJump() {

    }

    void executeJumpC() {

    }

    private void init() {
        sp = 255;
        frameBottomAddr = sp;
        pc = 0;
    }
}
