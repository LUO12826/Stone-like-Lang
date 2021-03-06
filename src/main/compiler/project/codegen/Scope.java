package compiler.project.codegen;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/16 11:53 上午
 * @updateTime:
 */
public class Scope {

    /** 作用域类型 */
    public enum Type {
        GLOBAL("GLOBAL"),
        LOCAL("LOCAL");

        private final String name;

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

    /** 本作用域函数符号表 */
    private Map<FunctionSignature, FunctionSymbol> functionSymbols = new HashMap<>();

    /** 值符号序号，对应了其在内存中的相对地址。
     *  由于0、1、2号内存位置分别用于保存pc返回位置、旧栈帧栈底位置、旧运算栈栈顶位置，这里
     *  从2开始。
     */
    private int valueSymbolIndex = 2;

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
        if(valueSymbols.containsKey(symbol.name)) {
            return null;
        }
        valueSymbols.put(symbol.name, symbol);
        valueSymbolIndex++;
        symbol.scope = this;
        symbol.relativeMemoryAddress = valueSymbolIndex;
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
        return valueSymbolIndex + 1;
    }

    public boolean valueSymbolRedundant(String name) {
        return valueSymbols.containsKey(name);
    }

    public boolean functionSymbolRedundant(FunctionSignature fs) {
        return functionSymbols.containsKey(fs);
    }

    public void removeValueSymbol(String name) {
        valueSymbols.remove(name);
        valueSymbolIndex--;
    }

    public void removeFunctionSymbol(FunctionSignature fs) {
        functionSymbols.remove(fs);
    }

    public ValueSymbol resolveValueSymbol(String name) {
        ValueSymbol s = valueSymbols.get(name);
        if(s == null && superScope != null) {
            s = superScope.resolveValueSymbol(name);
        }
        return s;
    }

    public FunctionSymbol resolveFunctionSymbol(FunctionSignature signature) {
        if(type == Type.LOCAL) {
            return null;
        }
        return functionSymbols.get(signature);
    }

}
