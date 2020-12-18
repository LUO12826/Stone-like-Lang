package compiler.project.vm;

import java.util.List;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/16 11:24 上午
 * @updateTime:
 */
public class StoneLikeVM {

    public enum StoneLikeRuntimeException {
        TypeError("运行时类型不匹配"),
        ArrayOutOfBounds("数组下标越界"),
        SegmentFault("指令目标段错误");

        private String message;

        public String getMessage() { return message; }

        StoneLikeRuntimeException(String message) { this.message = message; }
    }

    private final static int MEM_SIZE = 65536;

    /**栈指针*/
    private int sp;

    /**程序计数器，指向下一条要执行的代码*/
    private int pc;

    /**当前函数栈帧底地址*/
    private int frameBottomAddr;

    /**全局段起始地址*/
    private int globalAddr;

    /**临时段起始地址*/
    private int tempSegmentAddr;

    /**数据段*/
    private List<Object> dataSegment;

    /**中间代码序列*/
    private List<IntermediateCode> codes;

    /**当前pc指向的代码*/
    private IntermediateCode currentCode;

    /** 内存 */
    private final Object[] memory = new Object[MEM_SIZE];

    public StoneLikeVM(Executable e) {
        this.dataSegment = e.dataSegment;
        this.codes = e.codeSegment;
        init();
    }

    //初始化虚拟机的各个寄存器。
    private void init() {
        sp = 127;
        frameBottomAddr = 2048;
        tempSegmentAddr = 0;
        globalAddr = 2048;
        pc = 0;
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
            handleRuntimeException(StoneLikeRuntimeException.TypeError);
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
            handleRuntimeException(StoneLikeRuntimeException.TypeError);
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
            handleRuntimeException(StoneLikeRuntimeException.TypeError);
        }

    }

    void executePush() throws StoneLikeVMException {
        sp++;
        try {
            int op1 = currentCode.op1;
            switch(currentCode.segment) {
                case CONSTANT:
                    memory[sp] = dataSegment.get(currentCode.op1);
                    break;
                case LOCAL:
                    memory[sp] = memory[frameBottomAddr + op1];
                    break;
                case GLOBAL:
                    memory[sp] = memory[globalAddr + op1];
                    break;
                case TEMP:
                    memory[sp] = memory[tempSegmentAddr + op1];
                    break;
                case LOCAL_HEAP:
                    //在数组寻址时，把push指令的操作数认为是数组在栈帧中的地址，把操作数栈顶部元素认为是数组下标。
                    sp--;
                    int offset = (int)(double)memory[sp];
                    Object[] arr = (Object[])memory[frameBottomAddr + op1];
                    memory[sp] = arr[offset];
                    break;
            }
        }
        catch(ClassCastException e) {
            handleRuntimeException(StoneLikeRuntimeException.TypeError);
        }
        catch(ArrayIndexOutOfBoundsException idxe) {
            handleRuntimeException(StoneLikeRuntimeException.ArrayOutOfBounds);
        }
    }

    void executePop() throws StoneLikeVMException {
        try {
            Object val = memory[sp];
            int offset;
            switch(currentCode.segment) {
                case LOCAL:
                    memory[frameBottomAddr + currentCode.op1] = val;
                    break;
                case GLOBAL:
                    memory[globalAddr + currentCode.op1] = val;
                    break;
                case TEMP:
                    int addr = tempSegmentAddr + currentCode.op1;
                    offset = currentCode.op2;
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
                case LOCAL_HEAP:
                    //在数组寻址时，把pop指令的操作数认为是数组在栈帧中的地址，把操作数栈顶部元素认为是数组下标，第二个元素认为是要弹出的值。
                    offset = (int)(double)memory[sp];
                    Object[] arr = (Object[])memory[frameBottomAddr + currentCode.op1];
                    arr[offset] = memory[sp - 1];
                    sp--;
                    break;
                case GLOBAL_HEAP:
                    //在数组寻址时，把pop指令的操作数认为是数组在栈帧中的地址，把操作数栈顶部元素认为是数组下标，第二个元素认为是要弹出的值。
                    offset = (int)(double)memory[sp];
                    Object[] arrGlobal = (Object[])memory[globalAddr + currentCode.op1];
                    arrGlobal[offset] = memory[sp - 1];
                    sp--;
                    break;
                default:
                    handleRuntimeException(StoneLikeRuntimeException.SegmentFault);
            }
            sp--;
        }
        catch(ArrayIndexOutOfBoundsException idxe) {
            handleRuntimeException(StoneLikeRuntimeException.ArrayOutOfBounds);
        }
        catch(ClassCastException e) {
            handleRuntimeException(StoneLikeRuntimeException.TypeError);
        }

    }

    void executeCall() {

    }

    void executeReturn() {

    }

    void executeJump() {
        pc = currentCode.op1;
    }

    void executeJumpEqual() {
        boolean equalOrNot = (double) memory[sp] != 0;
        if(equalOrNot) {
            pc = currentCode.op1;
        }
    }

    void executeJumpNotEqual() {
        boolean equalOrNot = (double) memory[sp] != 0;
        if(!equalOrNot) {
            pc = currentCode.op1;
        }
    }

    void handleRuntimeException(StoneLikeRuntimeException e) throws StoneLikeVMException {
        System.out.println("程序计数器(下一条要执行的代码):" + pc);
        System.out.println("当前执行的代码:" + currentCode.toString());
        switch(e) {
            case TypeError:
            case SegmentFault:
            case ArrayOutOfBounds:
                throw new StoneLikeVMException(e.getMessage());
        }
    }

}

