package compiler.project.codegen;

import compiler.project.vm.IntermediateCode;
import compiler.project.vm.MemorySegment;
import compiler.project.vm.VMInstructionType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/19 10:25 上午
 * @updateTime:
 */
public class StoneLikeStandardLibrary {


    public static StoneLikeLibraryFunction print;

    static {
        print = new StoneLikeLibraryFunction();
        print.name = "print";
        print.parameterNum = 1;
        //print.frameDepth = 3;
        print.codes = new ArrayList<IntermediateCode>() {{
            add(new IntermediateCode(VMInstructionType.pop, MemorySegment.LOCAL, 2));
            add(new IntermediateCode(VMInstructionType.push, MemorySegment.LOCAL, 2));
            add(new IntermediateCode(VMInstructionType.print));
            add(new IntermediateCode(VMInstructionType.ret));
        }};
    }
}
