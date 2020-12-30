package compiler.project.vm;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/16 8:49 上午
 * @updateTime:
 *
 * StoneLike虚拟机的可执行文件
 * 包括代码段和数据段
 */
public class Executable {

    private static final String DATA_SEG_HEAD = "###DATA###";

    private static final String CODE_SEG_HEAD = "###CODE###";

    public List<Object> dataSegment;

    public List<IntermediateCode> codeSegment;

    public Executable(List<Object> dataSegment, List<IntermediateCode> codeSegment) {
        this.dataSegment = dataSegment;
        this.codeSegment = codeSegment;
    }

    public void writeToFile(String path) throws Exception {


        List<String> lines = new ArrayList<>();
        lines.add(Executable.DATA_SEG_HEAD);
        for(Object data : dataSegment) {
            if(data instanceof String) {
                String s = (String)data;
                lines.add("STR " + s);
            }
            else if(data instanceof Double) {
                Double d = (Double)data;
                lines.add("NUM " + d.toString());
            }
            else if(data instanceof Object[]) {
                Object[] arr = (Object[])data;
                lines.add("ARR " + arr.length);
            }
            else {
                throw new RuntimeException("出现了未知的数据类型");
            }
        }

        lines.add("");
        lines.add(Executable.CODE_SEG_HEAD);
        for(IntermediateCode c : codeSegment) {
            lines.add(c.toString());
        }

        File file = new File(path);
        FileUtils.writeLines(file, lines);
    }
}
