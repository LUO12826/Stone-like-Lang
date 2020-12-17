package compiler.project.codegen;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/16 11:53 上午
 * @updateTime:
 */
public class Scope {

    public enum Type {
        GLOBAL("GLOBAL"),
        LOCAL("LOCAL");

        private String name;
        public String getName() {
            return name;
        }

        Type(String name) {
            this.name = name;
        }
    }

    /** 父作用域 */
    public Scope superScope;

    /** 作用域类型 */
    private Type type;

    /** 本作用域值符号表 */
    private Map<String, ValueSymbol> valueSymbols = new HashMap<>();

    private Map<FunctionSignature, FunctionSymbol> functionSymbols = new HashMap<>();

    /** 值符号 序号 */
    private int valueSymbolNum = 1;

    public Scope(Scope superScope) {
        this.superScope = superScope;
        if(superScope == null) {
            type = Type.GLOBAL;
        }
        else {
            type = Type.LOCAL;
        }
    }

    public ValueSymbol defineValueSymbol(ValueSymbol symbol) {
        valueSymbols.put(symbol.name, symbol);
        valueSymbolNum++;
        symbol.scope = this;
        symbol.relativeMemoryAddress = valueSymbolNum;
        return symbol;
    }

    public boolean defineFunctionSymbol(FunctionSymbol symbol) {
        if(type == Type.GLOBAL) {
            functionSymbols.put(new FunctionSignature(symbol.name, symbol.parameterNum), symbol);
            return true;
        }
        return false;
    }

    public Type getScopeType() {
        return type;
    }

    public int getValueSymbolNum() {
        return valueSymbolNum + 1;
    }

    public boolean valueSymbolRedundant(String name) {
        ValueSymbol symbol = valueSymbols.get(name);
        return symbol != null;
    }

    public boolean functionSymbolRedundant(FunctionSignature fs) {
        FunctionSymbol symbol = functionSymbols.get(fs);
        return symbol != null;
    }

    public void removeValueSymbol(String name) {
        valueSymbols.remove(name);
        valueSymbolNum--;
    }

    public void removeFunctionSymbol(String name) {
        functionSymbols.remove(name);
    }

    public ValueSymbol resolveValueSymbol(String name) {
        ValueSymbol s = valueSymbols.get(name);
        if(s == null && superScope != null) {
            s = superScope.resolveValueSymbol(name);
        }
        return s;
    }

    public FunctionSymbol resolveFunctionSymbol(String name) {
        if(type == Type.LOCAL) {
            return null;
        }
        return functionSymbols.get(name);
    }

}
