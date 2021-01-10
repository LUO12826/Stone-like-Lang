/**
 * @Author 范承祥
 * @CreateTime 2020/12/20
 * @UpdateTime 2020/12/20
 */
package compiler.project.exception;

import compiler.project.helper.ExceptionHelper;
import org.antlr.v4.runtime.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类Stone语言错误监听器
 */
public class StoneLikeSyntaxErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        ExceptionHelper.underLineError(recognizer, (Token) offendingSymbol, line, charPositionInLine);

        // 重新包装错误
        if (msg.contains("缺失 '{'")||msg.contains("缺失 '}'")) {
            System.err.println(new SyntaxException(SyntaxExceptionType.MISS_BRACE, line));
        } else if (msg.contains("缺失 '('")||msg.contains("缺失 ')'")) {
            System.err.println(new SyntaxException(SyntaxExceptionType.MISS_PARENTHESIS, line));
        } else if (msg.contains("缺失 '['")||msg.contains("缺失 ']'")) {
            System.err.println(new SyntaxException(SyntaxExceptionType.MISS_BRACKET, line));
        }

        // 重新包装默认错误
        if(e instanceof NoViableAltException){
            // 获取错误信息进行填充
            Pattern p=Pattern.compile("'(.*?)'");
            Matcher m=p.matcher(msg);
            String error="";
            while(m.find())
            {
                error=m.group();
            }

            System.err.println(new SyntaxException(SyntaxExceptionType.NO_VIABLE_ALTERNATIVE, line, error ));
        }
    }
}
