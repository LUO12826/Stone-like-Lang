package compiler.project.vm;

import java.util.List;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/16 11:24 上午
 * @updateTime:
 */
public class StoneLikeVM {

    private final static int MEM_SIZE = 65536;

    /**栈指针*/
    private int sp;

    /**程序计数器，指向下一条要执行的代码*/
    private int pc;

    /**当前函数栈帧底地址*/
    private int frameBottomAddr;

    /**当前函数参数起始地址*/
    private int argumentAddr;

    private int staticSegmentAddr = 0;

    /**数据段*/
    private List<Object> dataSegment;

    /**中间代码序列*/
    private List<IntermediateCode> codes;

    /**当前pc指向的代码*/
    private IntermediateCode currentCode;

    /** 内存 */
    private final Object[] memory = new Object[MEM_SIZE];

    public StoneLikeVM(List<IntermediateCode> codes) {
        this.codes = codes;
        init();
    }

    public StoneLikeVM(Executable e) {
        this.dataSegment = e.dataSegment;
        this.codes = e.codeSegment;
        init();
    }

    public void execute() throws StoneLikeVMException {
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
                case j:
                    executeJump();
                    break;
                case je:
                    executeJumpEqual();
                    break;
                case jne:
                    executeJumpNotEqual();
                    break;
                case print:
                    executePrint();
                    break;
                case halt:
                    System.out.println(memory[sp]);
                    return;
            }

        }
    }

    void executePrint() {
        System.out.println(memory[sp]);
    }

    void executeArithmetic() throws StoneLikeVMException {
        try {
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
        catch(ClassCastException e) {
            throw new StoneLikeVMException("运行时类型不匹配");
        }


    }

    double boolToDouble(boolean val) {
        return val ? 1 : 0;
    }

    void executeCompare() throws StoneLikeVMException {
        try {
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
        catch(ClassCastException e) {
            throw new StoneLikeVMException("运行时类型不匹配");
        }

    }

    void executeLogic() throws StoneLikeVMException {

        try {
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
        catch(ClassCastException e) {
            throw new StoneLikeVMException("运行时类型不匹配");
        }

    }

    void executePush() throws StoneLikeVMException {
        sp++;
        try {
            Object op1 = currentCode.op1;
            switch(currentCode.segment) {
                case CONSTANT:
                    memory[sp] = dataSegment.get((int)currentCode.op1);
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
                case HEAP:
                    //在数组寻址时，把push指令的操作数认为是数组在栈帧中的地址，把操作数栈顶部元素认为是数组下标。
                    sp--;
                    int offset = (int)(double)memory[sp];
                    Object[] arr = (Object[])memory[frameBottomAddr + (int)op1];
                    memory[sp] = arr[offset];
                    break;
            }
        }
        catch(ClassCastException e) {
            throw new StoneLikeVMException("运行时类型不匹配");
        }
        catch(ArrayIndexOutOfBoundsException idxe) {
            throw new StoneLikeVMException("数组下标越界");
        }
    }

    void executePop() throws StoneLikeVMException {
        try {
            Object val = memory[sp];
            int offset;
            switch(currentCode.segment) {
                case LOCAL:
                    memory[frameBottomAddr + (int)currentCode.op1] = val;
                    break;
                case ARGUMENT:
                    memory[argumentAddr + (int)currentCode.op1] = val;
                    break;
                case STATIC:
                    int addr = staticSegmentAddr + (int)currentCode.op1;
                    offset = (int)currentCode.op2;
                    if(offset != -1) {
                        Object[] arr = (Object[])memory[addr];
                        arr[offset] = val;
                    }
                    else {
                        memory[addr] = val;
                    }
                    break;
                case NULL:
                    break;
                case HEAP:
                    //在数组寻址时，把pop指令的操作数认为是数组在栈帧中的地址，把操作数栈顶部元素认为是数组下标，第二个元素认为是要弹出的值。
                    offset = (int)(double)memory[sp];
                    Object[] arr = (Object[])memory[frameBottomAddr + (int)currentCode.op1];
                    arr[offset] = memory[sp - 1];
                    sp--;
                    break;
                default:
                    throw new StoneLikeVMException("pop指令目标段错误");
            }
            sp--;
        }
        catch(ArrayIndexOutOfBoundsException idxe) {
            System.out.println("程序计数器:" + pc);
            System.out.println("代码:" + currentCode.toString());
            throw new StoneLikeVMException("数组下标越界");

        }
        catch(ClassCastException e) {
            System.out.println("程序计数器:" + pc);
            System.out.println("代码:" + currentCode.toString());
            throw new StoneLikeVMException("运行时类型不匹配");
        }

    }

    void executeCall() {

    }

    void executeReturn() {

    }

    void executeJump() {
        pc = (int)currentCode.op1;
    }

    void executeJumpEqual() {
        boolean equalOrNot = (double) memory[sp] != 0;
        if(equalOrNot) {
            pc = (int)currentCode.op1;
        }
    }

    void executeJumpNotEqual() {
        boolean equalOrNot = (double) memory[sp] != 0;
        if(!equalOrNot) {
            pc = (int)currentCode.op1;
        }
    }

    private void init() {
        sp = 127;
        frameBottomAddr = 2048;
        pc = 0;
    }
}
