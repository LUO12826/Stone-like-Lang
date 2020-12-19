package compiler.project.codegen;

import compiler.project.vm.IntermediateCode;
import compiler.project.vm.MemorySegment;
import compiler.project.vm.VMInstructionType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/19 10:39 上午
 * @updateTime:
 *
 * StoneLike库函数
 */
public class StoneLikeLibraryFunction {
    public String name;
    public int parameterNum;
    //public int frameDepth;
    public List<IntermediateCode> codes;
}
