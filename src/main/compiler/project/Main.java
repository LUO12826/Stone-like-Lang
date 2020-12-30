package compiler.project;

import compiler.project.antlr.*;
import compiler.project.codegen.CodeGenVisitor;
import compiler.project.exception.LexerException;
import compiler.project.gui.MainWindow;
import compiler.project.io.CodeReader;
import compiler.project.lexer.Language;
import compiler.project.lexer.Lexer;
import compiler.project.lexer.Token;
import compiler.project.lexer.TokenType;
import compiler.project.vm.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.PrintStream;

public class Main {

    static PrintStream ps = System.out;

    public static void main(String[] args) throws Exception {
        test4();
    }

    static void test4() throws Exception {

        String osName = System.getProperty("os.name");
        String path;
        if (osName.startsWith("Mac OS")) {
            path = "/Users/luohuizhou/Desktop/stone.txt";
        } else if (osName.startsWith("Windows")) {
            path = "E:\\Francis\\Documents\\JavaWorkplace\\Stone-like-Lang\\src\\main\\compiler\\project\\test\\ArrayOperation.sto";
        } else {
            path = null;
        }

        CharStream s = CharStreams.fromFileName(path);
        StoneLikeLexer lexer = new StoneLikeLexer(s);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        StoneLikeParser parser = new StoneLikeParser(tokens);
        parser.setBuildParseTree(true);
        StoneLikeParser.ProgramContext tree = parser.program();
        CodeGenVisitor visitor = new CodeGenVisitor();
        visitor.visit(tree);

        Executable exe = visitor.getExecutable();
        if(exe == null) {
            return;
        }
        exe.writeToFile("/Users/luohuizhou/Desktop/stone111.txt");
        ps.println("----------------------中间代码-----------------------");
        final int[] i = {0};
        exe.codeSegment.forEach(code -> {
            if(code == null) {
                System.out.println("null");
                return;
            }
            System.out.println(i[0] + "   " + code.toString());
            i[0]++;
        });

        StoneLikeVM vm = new StoneLikeVM(exe);
        ps.println("----------------------执行结果-----------------------");
        vm.execute();
    }

    static void test1() throws Exception {

        String filePath = "C:\\Users\\Francis\\Desktop\\testLinux.txt";

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

    }
}
