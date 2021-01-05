package compiler.project.codegen;


public class FunctionSymbol extends Symbol {

    public int parameterNum;
    public int codeAddress;

    public FunctionSymbol(String name, Scope scope, int parameterNum, int codeAddress) {
        this.name = name;
        this.scope = scope;
        this.parameterNum = parameterNum;
        this.codeAddress = codeAddress;
    }
}
