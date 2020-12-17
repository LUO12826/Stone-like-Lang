package compiler.project.helper;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/17 9:52 上午
 * @updateTime:
 */
public class Helper {
    public static String[] blanks = new String[]{"", " ", "  ", "   ", "    ", "     "};

    public static String fillWithBlank(String s, int targetLength) {
        int l = targetLength - s.length();
        return s + blanks[l];
    }
}
