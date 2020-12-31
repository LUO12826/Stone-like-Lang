package compiler.project;

import compiler.project.antlr.StoneLikeLexer;
import compiler.project.antlr.StoneLikeParser;
import compiler.project.codegen.CodeGenVisitor;
import compiler.project.exception.LexerException;
import compiler.project.exception.StoneLikeSyntaxErrorListener;
import compiler.project.io.CodeReader;
import compiler.project.lexer.Language;
import compiler.project.lexer.Lexer;
import compiler.project.lexer.Token;
import compiler.project.lexer.TokenType;
import compiler.project.vm.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import sun.reflect.generics.tree.VoidDescriptor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Main {

    static PrintStream ps = System.out;

    public static void main(String[] args) throws Exception {
        //lexerNormal();
        //lexerError();
        //syntaxNormal();
        //syntaxError();
        simpleProgram();
        //quickSort();
    }

    /**
     * 正常词法分析
     * @throws Exception
     */
    public static void lexerNormal() throws Exception {
        String filePath = "E:\\Francis\\Documents\\JavaWorkplace\\Stone-like-Lang\\src\\main\\compiler\\project\\test\\ArrayOperation.sto";
        String resultPath = "E:\\Francis\\Documents\\JavaWorkplace\\Stone-like-Lang\\src\\main\\compiler\\project\\result\\ArrayOperation.out";
        lexer(filePath,resultPath);
    }

    /**
     * 出错词法分析
     * @throws Exception
     */
    public static void lexerError() throws Exception {
        String filePath = "E:\\Francis\\Documents\\JavaWorkplace\\Stone-like-Lang\\src\\main\\compiler\\project\\test\\LexicalError2.sto";
        String resultPath = "E:\\Francis\\Documents\\JavaWorkplace\\Stone-like-Lang\\src\\main\\compiler\\project\\result\\LexicalError2.out";
        lexer(filePath,resultPath);
    }

    /**
     * 词法分析
     * @param filePath 输入文件名
     * @param resultPath 输出文件名
     * @throws Exception
     */
    private static void lexer(String filePath,String resultPath) throws Exception {
        // 读取源代码文件
        File file=new File(filePath);
        CodeReader reader=new CodeReader(file);
        Lexer lexer=new Lexer(reader);

        // 创建输出文件
        File result = new File(resultPath);

        // 保存输出流
        PrintStream out = System.out;

        // 重定向输出流
        PrintStream fi = null;
        try {
            fi = new PrintStream(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(fi);

        // 解析token
        Token token= null;
        try {
            token = lexer.nextToken();
            while(token.tokenType!= TokenType.TokenEOF){
                System.out.printf("%-20s\t%s\n",token.tokenType,token.value);
                try{
                    token=lexer.nextToken();
                }catch (LexerException e){
                    System.out.println(e.toString());
                }
            }
        } catch (LexerException e) {
            System.out.println(e.toString());
        }

        // 打印常量表
        Language.printNumberLiteralTable();
        System.out.println();

        // 打印字符常量表
        Language.printStringLiteralTable();
        System.out.println();

        // 打印符号表
        Language.printSymbolTable();
        System.out.println();

        // 恢复输出流
        System.setOut(out);

        System.out.println("词法分析完毕");
    }

    /**
     * 正常语法分析
     * @throws Exception
     */
    public static void syntaxNormal() throws Exception {
        String filePath = "E:\\Francis\\Documents\\JavaWorkplace\\Stone-like-Lang\\src\\main\\compiler\\project\\test\\Function.sto";
        parser(filePath);
    }

    /**
     * 出错语法分析
     * @throws Exception
     */
    public static void syntaxError() throws Exception {
        String filePath = "E:\\Francis\\Documents\\JavaWorkplace\\Stone-like-Lang\\src\\main\\compiler\\project\\test\\SyntaxError.sto";
        parser(filePath);
    }

    /**
     * 语法分析
     * @param filePath 输入文件名
     * @throws IOException
     */
    public static void parser(String filePath) throws IOException {

        // 读取源代码
        CharStream s = CharStreams.fromFileName(filePath);
        // 词法分析
        StoneLikeLexer lexer = new StoneLikeLexer(s);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // 语法分析
        StoneLikeParser parser = new StoneLikeParser(tokens);

        // 打印tokens
        int size=tokens.getNumberOfOnChannelTokens();
        for(int i=0;i<size;i++){
            org.antlr.v4.runtime.Token token = tokens.get(i);
            System.out.printf("%d\t%s\n",token.getType(),token.getText());
        }


        // 添加自定义错误监听器
        parser.removeErrorListeners();
        parser.addErrorListener(new StoneLikeSyntaxErrorListener());

        parser.setBuildParseTree(true);
        StoneLikeParser.ProgramContext tree = parser.program();

        if(parser.getNumberOfSyntaxErrors()==0){
            System.out.println("语法正确。");
        }
    }

    /**
     * 运行快速排序
     */
    static void quickSort() throws Exception {
        runProgram("/Users/luohuizhou/Documents/javaProject/Stone-like-Lang/src/main/compiler/project/test/QuickSort.sto");
    }

    /**
     * 运行简单程序
     */
    static void simpleProgram() throws Exception {
        runProgram("/Users/luohuizhou/Desktop/StoneLikeTest/stone.sto");
    }

    static void runProgram(String path) throws Exception {

        String osName = System.getProperty("os.name");
//        String path;
//        if (osName.startsWith("Mac OS")) {
//            path = "/Users/luohuizhou/Desktop/StoneLikeTest/stone.txt";
//        } else if (osName.startsWith("Windows")) {
//            path = "E:\\Francis\\Documents\\JavaWorkplace\\Stone-like-Lang\\src\\main\\compiler\\project\\test\\ArrayOperation.sto";
//        } else {
//            path = null;
//        }

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

        exe.writeToFile(path.concat(".out"));

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

        String filePath = "E:\\Francis\\Documents\\JavaWorkplace\\Stone-like-Lang\\src\\main\\compiler\\project\\test\\ArrayOperation.sto";

        String code = "if 123abc == 123 else a >= 0 else b <= 0 func while return \"123dvd\" \"123abc ";
        File file=new File(filePath);
        CodeReader reader=new CodeReader(code);
        Lexer lexer=new Lexer(reader);
        Token token=lexer.nextToken();

        File result = new File("E:\\Francis\\Documents\\JavaWorkplace\\Stone-like-Lang\\src\\main\\compiler\\project\\result\\ArrayOperation.out");
        PrintStream fi = null;
        try {
            fi = new PrintStream(result);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.setOut(fi);

        while(token.tokenType!= TokenType.TokenEOF){
            System.out.printf("%-20s\t%s\n",token.tokenType,token.value);

            try{
                token=lexer.nextToken();
            }catch (LexerException e){
                System.out.println(e.toString());
            }
        }

        Language.printNumberLiteralTable();

        Language.printStringLiteralTable();

        Language.printSymbolTable();

    }
}
