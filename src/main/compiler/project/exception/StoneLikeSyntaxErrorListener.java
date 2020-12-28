/**
 * @Author 范承祥
 * @CreateTime 2020/12/20
 * @UpdateTime 2020/12/20
 */
package compiler.project.exception;

import compiler.project.helper.ExceptionHelper;
import org.antlr.v4.runtime.*;

import java.util.Collections;
import java.util.List;

public class StoneLikeSyntaxErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        ExceptionHelper.underLineError(recognizer, (Token) offendingSymbol, line, charPositionInLine);
        System.err.println("line " + line + ": " + charPositionInLine + " " + msg);
        if (msg.contains("missing '{'")) {
            System.err.println(new SyntaxException(SyntaxExceptionType.MISS_BRACE, line));
        } else if (msg.contains("missing ')'")) {
            System.err.println(new SyntaxException(SyntaxExceptionType.MISS_PARENTHESE, line));
        }
    }
}
