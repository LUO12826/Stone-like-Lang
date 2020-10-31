package compiler.project.lexer;

import java.util.*;

/**
 * @author: 骆荟州
 * @createTime: 2020/10/31 3:02 下午
 * @updateTime:
 */
public class Language {
    public static Set<String> Keywords = new HashSet<String>() {{
        add("func");
        add("if");
        add("else");
        add("while");
        add("var");
        add("const");
        add("return");
    }};

    public static Map<String, TokenType> keywordMap = new HashMap() {{
        put("func", TokenType.TokenFunc);
        put("if", TokenType.TokenIf);
        put("else", TokenType.TokenElse);
        put("while", TokenType.TokenWhile);
        put("var", TokenType.TokenVar);
        put("const", TokenType.TokenConst);
        put("return", TokenType.TokenReturn);
    }};

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
        put("{", TokenType.TokenLeftBarce);
        put("}", TokenType.TokenRightBrace);
        put("[", TokenType.TokenLeftBracket);
        put("]", TokenType.TokenRightBracket);
        put(";", TokenType.TokenSemicolon);
        put(",", TokenType.TokenComma);

        put("\n", TokenType.TokenNewline);
        put("\r\n", TokenType.TokenNewline);

    }};


    public static List<String> stringLiteralTable = new ArrayList<>();

    public static List<Double> numberLiteralTable = new ArrayList<>();

    public static List<SymbolTableItem> symbolTable = new ArrayList<>();

    public static void print(List list) {
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }

    public static void printStringLiteralTable() {
        int size = stringLiteralTable.size();
        System.out.println("---------String Literal Table-----------");
        System.out.println("index\tvalue");
        for (int i = 0; i < size; i++) {
            System.out.println(i + "\t" + stringLiteralTable.get(i));
        }
    }

    public static void printNumberLiteralTable() {
        int size = numberLiteralTable.size();
        System.out.println("---------Number Literal Table-----------");
        System.out.println("index\tvalue");
        for (int i = 0; i < size; i++) {
            System.out.println(i + "\t" + numberLiteralTable.get(i));
        }
    }

    public static void printSymbolTable() {
        int size = symbolTable.size();
        System.out.println("---------Symbol Table-----------");
        System.out.println("index\tname\tline");
        for (int i = 0; i < size; i++) {
            System.out.println(i + "\t" + symbolTable.get(i).getName() + "\t" + symbolTable.get(i).getLine());
        }
    }
}
