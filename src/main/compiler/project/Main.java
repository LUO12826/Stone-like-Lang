package compiler.project;

<<<<<<< HEAD
import compiler.project.exception.LexerException;
import compiler.project.io.CodeReader;
import compiler.project.lexer.Language;
import compiler.project.lexer.Lexer;
import compiler.project.lexer.Token;
import compiler.project.lexer.TokenType;

import java.io.File;
=======
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import compiler.project.lexer.Token;
import org.apache.commons.io.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
>>>>>>> lhz

public class Main {

    public static void main(String[] args) throws Exception {
//        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
//        engine.eval("print('Hello World!');var a = 1 + 1;");


<<<<<<< HEAD
        String filePath = "C:\\Users\\Francis\\Desktop\\testLinux.txt";
//        String fileContent = FileUtils.readFileToString(new File(filePath), "UTF-8");

        String code = "if abc == 123 else a >= 0 else b <= 0 func while return \"123dvd\" \"123abc ";
        File file=new File(filePath);
        CodeReader reader=new CodeReader(file);
        Lexer lexer=new Lexer(reader);
        Token token=lexer.nextToken();
        while(token.tokenType!= TokenType.TokenEOF){
            System.out.println(token.tokenType+", "+token.value);
            try{
                token=lexer.nextToken();
            }catch (LexerException e){
                e.printStackTrace();
            }
        }

        Language.printNumberLiteralTable();

        Language.printStringLiteralTable();

        Language.printSymbolTable();

=======
//        String filePath = "/Users/luohuizhou/Desktop/compile.java";
//        String fileContent = FileUtils.readFileToString(new File(filePath), "UTF-8");

>>>>>>> lhz
//        System.out.println(fileContent);
//        char c = fileContent.toCharArray()[5];
//        System.out.println((int)c);
//        System.out.println(c);

    }
}