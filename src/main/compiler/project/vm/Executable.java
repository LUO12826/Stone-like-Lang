package compiler.project.vm;
import java.util.List;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/16 8:49 上午
 * @updateTime:
 */
public class Executable {

    public List<Object> dataSegment;

    public List<IntermediateCode> codeSegment;

    public Executable(List<Object> dataSegment, List<IntermediateCode> codeSegment) {
        this.dataSegment = dataSegment;
        this.codeSegment = codeSegment;
    }
}
