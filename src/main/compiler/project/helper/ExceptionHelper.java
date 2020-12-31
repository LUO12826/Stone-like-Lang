package compiler.project.helper;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class ExceptionHelper {
    public static void underLineError(Recognizer recognizer, Token offendingToken, int line, int charPositionInLine){
        CommonTokenStream tokens=(CommonTokenStream)recognizer.getInputStream();
        String input=tokens.getTokenSource().getInputStream().toString();
        String[] lines=input.split("\n");
        String errorLine = lines[line-1];
        System.err.println(errorLine);
        for(int i=0;i<charPositionInLine;i++){
            System.err.print(" ");
        }
        int start=offendingToken.getStartIndex();
        int stop=offendingToken.getStopIndex();
        if(start>=0&&stop>=0){
            for(int i=start;i<=stop;i++){
                System.err.print("^");
            }
        }
        System.err.println();

    }
}
