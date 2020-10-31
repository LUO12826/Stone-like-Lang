package compiler.project.io;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * @author: 骆荟州
 * @createTime: 2020/10/31 5:07 下午
 * @updateTime:
 */
public class CodeReader {

    private String codeString;

    private int currentIndex = -1;

    private int codeLength = 0;

    public CodeReader(File file) throws Exception {
        this.codeString = FileUtils.readFileToString(file, "UTF-8");
        this.codeLength = codeString.length();
    }

    public CodeReader(String code) {
        this.codeString = code;
        this.codeLength = codeString.length();
    }

    public char nextChar() {
        if(currentIndex >= codeLength - 1) {
            currentIndex++;
            return '\0';
        }
        return codeString.charAt(++currentIndex);
    }

    public char retract() {
        if(currentIndex <= 0) {
            currentIndex = -1;
            return codeString.charAt(0);
        }
        currentIndex--;
        return codeString.charAt(currentIndex);
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
}