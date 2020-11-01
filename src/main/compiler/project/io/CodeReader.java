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
public class CodeReader {

    private String codeString;

    private int currentIndex = -1;

    private int codeLength = 0;

    private int line = 1;

    private int col = 0;

    private Map<Integer, Integer> colNumMap = new HashMap<>();


    private boolean lineEnd = false;

    public CodeReader(File file) throws Exception {
        this.codeString = FileUtils.readFileToString(file, "UTF-8");
        this.codeLength = codeString.length();
    }

    public CodeReader(String code) {
        this.codeString = code;
        this.codeLength = codeString.length();
    }

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

    public char nextNotSpaceChar() {
        char c = nextChar();
        while (c == ' ') {
            c = nextChar();
        }
        return c;
    }

    public char nextBeforeNotSpaceChar() {
        nextNotSpaceChar();
        return retract();
    }

    public char peek() {
        return currentIndex >= codeLength - 1? '\0' : codeString.charAt(currentIndex + 1);
    }

    public int getLine() {
        return line;
    }

    public int getCol() {
        return col;
    }

    public void reset() {
        currentIndex = -1;
        line = 1;
        col = 0;
    }
}