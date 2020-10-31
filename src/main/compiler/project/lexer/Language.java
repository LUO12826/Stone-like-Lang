package compiler.project.lexer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: 骆荟州
 * @createTime: 2020/10/31 3:02 下午
 * @updateTime:
 */
public class Language {
    public static Set<String> Keywords = new HashSet<String>() {{
        add("func");
        add("if");
        add("else");
        add("while");
        add("var");
        add("const");
        add("return");
    }};

}
