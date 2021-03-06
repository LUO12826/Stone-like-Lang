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
        SegmentFault("指令目标段错误"),
        InternalError("解释器系统内部错误");

        private final String message;

        public String getMessage() { return message; }

        StoneLikeRuntimeException(String message) { this.message = message; }
    }

    private boolean printDebugInfo = false;

    private int maxSP = 0;

    private final static int MEM_SIZE = 65536;

    /**运算栈指针*/
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
    private final List<Object> dataSegment;

    /**中间代码序列*/
    private final List<IntermediateCode> codes;

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
            if(sp > maxSP) {
                maxSP = sp;
            }
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
                    beforeHalt();
                    return;
            }

        }
    }

    private void beforeHalt() {
        if(!printDebugInfo) {
            return;
        }
        System.out.println();
        System.out.println("**VM信息：最大sp：" + maxSP);
        System.out.println("**VM信息：最终sp：" + sp);
    }

    void executePrint() {
        if(memory[sp] instanceof Object[]) {
            printArr((Object[])memory[sp]);
        }
        else {
            System.out.print(memory[sp]);
        }
        sp--;
    }

    private void printArr(Object[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            if(i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
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
        catch(NullPointerException pte) {
            handleRuntimeException(StoneLikeRuntimeException.InternalError);
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
                case DATA:
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
                case CONSTANT:
                    memory[sp] = op1;
                    break;
                case LOCAL_HEAP:
                    //在数组寻址时，把push指令的操作数认为是数组在栈帧中的地址，把操作数栈顶部元素认为是数组下标。
                    sp--;
                    int offset = (int)(double)memory[sp];
                    Object[] arr = (Object[])memory[frameBottomAddr + op1];
                    memory[sp] = arr[offset];
                    break;
                case GLOBAL_HEAP:
                    //在数组寻址时，把push指令的操作数认为是数组在栈帧中的地址，把操作数栈顶部元素认为是数组下标。
                    sp--;
                    int offsetGlobal = (int)(double)memory[sp];
                    Object[] arrGlobal = (Object[])memory[globalAddr + op1];
                    memory[sp] = arrGlobal[offsetGlobal];
                    break;
            }
        }
        catch(ClassCastException e) {
            handleRuntimeException(StoneLikeRuntimeException.TypeError);
        }
        catch(ArrayIndexOutOfBoundsException idxe) {
            handleRuntimeException(StoneLikeRuntimeException.ArrayOutOfBounds);
        }
        catch(NullPointerException pte) {
            handleRuntimeException(StoneLikeRuntimeException.InternalError);
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

    /**
     * 执行call指令。当前call指令实际上有3个操作数，
     * 跳转地址，需要的栈空间以及参数个数。参数个数通过栈顶传递。
     */
    void executeCall() throws StoneLikeVMException {
        try{
            int paraNum = (int)memory[sp];

            int temp = frameBottomAddr;
            // 分配空间
            frameBottomAddr += currentCode.op2;
            // 保存返回地址
            memory[frameBottomAddr] = pc;
            // 保存当前函数帧的指针
            memory[frameBottomAddr+1] = temp;
            //保存sp
            memory[frameBottomAddr+2] = sp - paraNum;
            //由于栈顶元素被用于表示数组个数，这里需要弹出这个元素，避免影响函数传参
            sp--;
            // 跳转函数
            pc = currentCode.op1;
        }catch(ClassCastException e) {
            handleRuntimeException(StoneLikeRuntimeException.TypeError);
        }
    }

    void executeReturn() throws StoneLikeVMException{
        try{
            // 恢复pc为返回地址
            pc = (int)memory[frameBottomAddr];
            //暂存sp
            int returnSp = (int)memory[frameBottomAddr + 2];
            // 释放栈帧
            frameBottomAddr = (int)memory[frameBottomAddr + 1];
            //转移sp处的数据
            memory[returnSp] = memory[sp];
            //恢复sp
            sp = returnSp;
        }catch(ClassCastException e) {
            handleRuntimeException(StoneLikeRuntimeException.TypeError);
        }
    }

    void executeJump() { pc = currentCode.op1; }

    void executeJumpEqual() {
        boolean equalOrNot = (double) memory[sp] != 0;
        sp--;
        if(equalOrNot) {
            pc = currentCode.op1;
        }
    }

    void executeJumpNotEqual() {
        boolean equalOrNot = (double) memory[sp] != 0;
        sp--;
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
            case InternalError:
                throw new StoneLikeVMException(e.getMessage());
        }
    }

}

