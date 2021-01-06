package compiler.project.io;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: 骆荟州
 * @createTime: 2020/10/31 5:07 下午
 * @updateTime:
 */

/**
 * 代码读取器，通过其nextChar()方法可以遍历源码字符串。
 * 主要被词法分析器使用。
 * 在初始阶段，currentIndex指向-1，即第一个字符之前。
 */
public class CodeReader {

    private String codeString;

    private int currentIndex = -1;

    private int codeLength = 0;

    private int line = 1;

    private int col = 0;

    private Map<Integer, Integer> colNumMap = new HashMap<>();

    //当currentIndex指向一行的末端时，此值为true
    private boolean lineEnd = false;

    public CodeReader(File file) throws Exception {
        this.codeString = FileUtils.readFileToString(file, "UTF-8");
        this.codeString = removeComment(codeString);
        this.codeLength = codeString.length();
    }

    public CodeReader(String code) {
        this.codeString = code;
        this.codeString = removeComment(codeString);
        this.codeLength = codeString.length();
    }

    /**
     * 获取源码中的下一个字符。
     * currentIndex在代码字符串末端时，调用此方法会使currentIndex == codeLength，
     * 即指向最后一个字符之后，但返回'\0'。此后调用此方法会返回'\0'，但currentIndex不再增加。
     * @return 下一个字符。
     */
    public char nextChar() {
        if(currentIndex < codeLength - 1) {
            char c = codeString.charAt(++currentIndex);
            if(c == '\n') {
                lineEnd = true;
                col++;
            }
            if(lineEnd) {
                lineEnd = false;
                colNumMap.put(line, col);
                line++;
                col = 1;
            }
            else {
                col++;
            }
            return c;
        }
        else if(currentIndex == codeLength - 1) {
            currentIndex++;
            return '\0';
        }
        else {
            return '\0';
        }
    }

    /**
     * 获取源码中的上一个字符。
     * 当currentIndex指向第一个字符时，调用retract()方法会使currentIndex指向-1，但返回第一个字符。
     * 此后调用retract()不会使currentIndex减少，但始终返回第一个字符。
     * @return 上一个字符。
     */
    public char retract() {
        if(currentIndex >= 0) {
            currentIndex--;
            char c = currentIndex == -1? codeString.charAt(0) : codeString.charAt(currentIndex);
            if(c == '\n' && currentIndex + 1 != codeLength) {
                lineEnd = true;
                line--;
                col = colNumMap.get(line);
            }
            else {
                col--;
            }
            return c;
        }
        else {
            currentIndex = -1;
            col = -1;
            return codeString.charAt(0);
        }
    }

    /**
     * 获取源码中的下一个非空白字符。
     * 此处换行符不算空字符。
     * @return 下一个非空白字符。
     */
    public char nextNotSpaceChar() {
        char c = nextChar();
        while (c == ' ' || c == '\t') {
            c = nextChar();
        }
        return c;
    }

    /**
     * 将指针定位到下一个非空白符前。
     * 此处换行符不算空字符。
     */
    public char nextBeforeNotSpaceChar() {
        nextNotSpaceChar();
        return retract();
    }

    /**
     * 获取源码中的下一个字符，但指针不前进。
     * @return 下一个字符。
     */
    public char peek() {
        return currentIndex >= codeLength - 1? '\0' : codeString.charAt(currentIndex + 1);
    }

    /**
     * 获取currentIndex所指字符的行号。
     */
    public int getLine() {
        return line;
    }

    /**
     * 获取currentIndex所指字符的列号。
     */
    public int getCol() {
        return col;
    }

    /**
     * 重置CodeReader的状态。
     */
    public void reset() {
        currentIndex = -1;
        line = 1;
        col = 0;
        colNumMap.clear();
    }

    /**
     * 移除源代码中的注释
     * @param origin 源代码
     * @return 移除注释后的源代码
     */
    public String removeComment(String origin){
        String str=origin.replaceAll("/\\*(.|[\\r\\n])*?\\*/","");
        return str;
    }
}