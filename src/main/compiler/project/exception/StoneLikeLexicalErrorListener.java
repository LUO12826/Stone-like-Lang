/**
 * @Author 范承祥
 * @CreateTime 2020/12/20
 * @UpdateTime 2020/12/20
 */
package compiler.project.exception;

import compiler.project.helper.ExceptionHelper;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;

public class StoneLikeLexicalErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Lexer lexer=(Lexer)recognizer;
        String text=lexer._input.getText(Interval.of(lexer._tokenStartCharIndex, lexer._input.index()));
        String error = lexer.getErrorDisplay(text);
        System.err.println(new LexerException(LexerExceptionType.IllegalCharacter,line,error));
    }
}
