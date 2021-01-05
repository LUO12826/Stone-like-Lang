package compiler.project.codegen;


public class ValueSymbol extends Symbol {

    public Object value;
    public int relativeMemoryAddress;
    public boolean isConstant;

    public ValueSymbol(String name, Scope scope, int address, boolean isConstant) {
        this.name = name;
        this.scope = scope;
        this.relativeMemoryAddress = address;
        this.isConstant = isConstant;
    }

    public ValueSymbol(String name, boolean isConstant) {
        this.name = name;
        this.isConstant = isConstant;
    }
}
