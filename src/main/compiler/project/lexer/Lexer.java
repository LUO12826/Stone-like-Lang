package compiler.project.lexer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: 骆荟州
 * @createTime: 2020/10/31 2:58 下午
 * @updateTime:
 */
public class Lexer {

    enum State {
        START_STATE, // 开始状态
        ID_STATE,    // 标识符状态
        NUMBER_STATE,   // 整型数状态
        CHAR_STATE,  // 字符状态
        CHAR_STATE_A,
        CHAR_STATE_B,
        CHAR_STATE_C,
        STRING_STATE,   // 字符串状态
        SYMBOL_STATE,
        COMMENT_STATE,   // 注释状态
        DONE_STATE,        // 结束状态
        ERROR_STATE        // 错误状态
    }

    private String codeString;

    private long currentIndex = 0;

    private long codeLength = 0;

    private int line = 1;

    private State state = State.START_STATE;

    public Lexer(String code) {
        this.codeString = code;
        this.codeLength = codeString.length();
    }

    public Token nextToken() {

        while (true) {
            switch (state) {

            }
        }
    }
}
