package compiler.project.lexer;

import java.util.*;

/**
 * @author: 骆荟州
 * @createTime: 2020/10/31 3:02 下午
 * @updateTime:
 */

/**
 * 语言类
 */
public class Language {
    /**
     * 关键字表
     */
    public static Set<String> Keywords = new HashSet<String>() {{
        add("func");
        add("if");
        add("else");
        add("while");
        add("var");
        add("const");
        add("return");
    }};

    /**
     * 关键字与Token类型映射表
     */
    public static Map<String, TokenType> keywordMap = new HashMap() {{
        put("func", TokenType.TokenFunc);
        put("if", TokenType.TokenIf);
        put("else", TokenType.TokenElse);
        put("while", TokenType.TokenWhile);
        put("var", TokenType.TokenVar);
        put("const", TokenType.TokenConst);
        put("return", TokenType.TokenReturn);
    }};

    /**
     * 符号与Token类型映射表
     */
    public static Map<String, TokenType> symbolMap = new HashMap<String, TokenType>() {{

        put("+", TokenType.TokenAdd);
        put("-", TokenType.TokenSub);
        put("*", TokenType.TokenMul);
        put("/", TokenType.TokenDiv);
        put("=", TokenType.TokenAssign);
        put("==", TokenType.TokenEqual);
        put("!=", TokenType.TokenNotEqual);
        put("<", TokenType.TokenLess);
        put("<=", TokenType.TokenLessEqual);
        put(">", TokenType.TokenGreater);
        put(">=", TokenType.TokenGreaterEqual);
        put("!", TokenType.TokenNot);
        put("&&", TokenType.TokenAnd);
        put("||", TokenType.TokenOr);

        put("(", TokenType.TokenLeftParen);
        put(")", TokenType.TokenRightParen);
        put("{", TokenType.TokenLeftBrace);
        put("}", TokenType.TokenRightBrace);
        put("[", TokenType.TokenLeftBracket);
        put("]", TokenType.TokenRightBracket);
        put(";", TokenType.TokenSemicolon);
        put(",", TokenType.TokenComma);

        put("\n", TokenType.TokenNewline);
        put("\r\n", TokenType.TokenNewline);

    }};


    /**
     * 字符串表
     */
    public static List<String> stringLiteralTable = new ArrayList<>();

    /**
     * 常数表
     */
    public static List<Double> numberLiteralTable = new ArrayList<>();

    /**
     * 标识符表
     */
    public static List<SymbolTableItem> symbolTable = new ArrayList<>();

    /**
     * 填充字符串到字符串表中
     * @param str 字符串
     * @return 索引
     */
    public static int addStringLiteral(String str){
        int index = stringLiteralTable.indexOf(str);
        if(index!=-1){
            return index;
        }
        stringLiteralTable.add(str);
        index = stringLiteralTable.size()-1;
        return index;
    }

    /**
     * 填充常数到常数表
     * @param num 常数
     * @return 索引
     */
    public static int addNumberLiteral(double num){
        int index = numberLiteralTable.indexOf(num);
        if(index!=-1){
            return index;
        }
        numberLiteralTable.add(num);
        index = numberLiteralTable.size()-1;
        return index;
    }

    /**
     * 填充标识符到标识符表
     * @param item 标识符
     * @return 索引
     */
    public static int addSymbolTableItem(SymbolTableItem item){
        int index=symbolTable.indexOf(item);
        if(index!=-1){
            return index;
        }
        symbolTable.add(item);
        index = Language.symbolTable.size() - 1;
        return index;
    }

    /**
     * 打印字符串表
     */
    public static void printStringLiteralTable() {
        int size = stringLiteralTable.size();
        System.out.println("---------String Literal Table-----------");
        System.out.println("index\tvalue");
        for (int i = 0; i < size; i++) {
            System.out.printf("%-5d\t%s\n",i, stringLiteralTable.get(i));
        }
    }

    /**
     * 打印常数表
     */
    public static void printNumberLiteralTable() {
        int size = numberLiteralTable.size();
        System.out.println("---------Number Literal Table-----------");
        System.out.println("index\tvalue");
        for (int i = 0; i < size; i++) {
            System.out.printf("%-5d\t%s\n",i, numberLiteralTable.get(i));
        }
    }

    /**
     * 打印标识符表
     */
    public static void printSymbolTable() {
        int size = symbolTable.size();
        System.out.println("---------Symbol Table-----------");
        System.out.println("index\tname\tline");
        for (int i = 0; i < size; i++) {
            System.out.printf("%-5d\t%-5s\t%d\n",i,symbolTable.get(i).getName(),symbolTable.get(i).getLine());
        }
    }
}
