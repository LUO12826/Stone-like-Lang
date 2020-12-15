package compiler.project;

import compiler.project.antlrtest.CodeGenVisitor;
import compiler.project.antlrtest.TinyScriptLexer;
import compiler.project.antlrtest.TinyScriptParser;
import compiler.project.exception.LexerException;
import compiler.project.io.CodeReader;
import compiler.project.lexer.Language;
import compiler.project.lexer.Lexer;
import compiler.project.lexer.Token;
import compiler.project.lexer.TokenType;
import compiler.project.vm.IntermediateCode;
import compiler.project.vm.MemorySegment;
import compiler.project.vm.VMInstructionType;
import compiler.project.vm.VirtualMachine;
import javafx.beans.binding.ObjectExpression;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static PrintStream ps = System.out;

    public static void main(String[] args) throws Exception {
        test3();
    }

    static void test3() throws Exception {

        CharStream s = CharStreams.fromFileName("/Users/luohuizhou/Desktop/tiny.txt");
        TinyScriptLexer lexer = new TinyScriptLexer(s);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TinyScriptParser parser = new TinyScriptParser(tokens);
        parser.setBuildParseTree(true);
        TinyScriptParser.ProgramContext tree = parser.program();
        CodeGenVisitor visitor = new CodeGenVisitor();
        visitor.visit(tree);

        List<IntermediateCode> codes = visitor.codes;
        ps.println("----------------------中间代码-----------------------");
        codes.forEach(code -> {
            if(code == null) {
                System.out.println("null");
                return;
            }
            System.out.println(code.toString());
        });

        VirtualMachine vm = new VirtualMachine(codes);
        ps.println("----------------------执行结果-----------------------");
        vm.execute();
    }

    static void test2() {
        List<IntermediateCode> codes = new ArrayList<IntermediateCode>() {{
            //似乎我们设计的时候数字全都用double类型来作为内部实现，所以这里数字要写成double形式。
            add(new IntermediateCode(VMInstructionType.push, MemorySegment.CONSTANT, 1.0));
            add(new IntermediateCode(VMInstructionType.push, MemorySegment.CONSTANT, 2.0));
            add(new IntermediateCode(VMInstructionType.push, MemorySegment.CONSTANT, 3.0));
            add(new IntermediateCode(VMInstructionType.mul));
            add(new IntermediateCode(VMInstructionType.add));
            add(new IntermediateCode(VMInstructionType.print));
            add(new IntermediateCode(VMInstructionType.halt));
        }};

        VirtualMachine vm = new VirtualMachine(codes);
        vm.execute();
    }

    static void test1() throws Exception {
        //        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
//        engine.eval("print('Hello World!');var a = 1 + 1;");


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

//        System.out.println(fileContent);
//        char c = fileContent.toCharArray()[5];
//        System.out.println((int)c);
//        System.out.println(c);
    }
}
