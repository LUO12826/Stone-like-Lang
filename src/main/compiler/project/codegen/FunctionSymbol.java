package compiler.project.codegen;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/16 12:24 下午
 * @updateTime:
 */
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
