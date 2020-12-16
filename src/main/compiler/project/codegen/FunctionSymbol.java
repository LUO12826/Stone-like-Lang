package compiler.project.codegen;

import org.w3c.dom.NameList;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/16 12:24 下午
 * @updateTime:
 */
public class FunctionSymbol extends Symbol {

    public int argumentNum;
    public int codeAddress;

    public FunctionSymbol(String name, Scope scope, int argumentNum, int codeAddress) {
        this.name = name;
        this.scope = scope;
        this.argumentNum = argumentNum;
        this.codeAddress = codeAddress;
    }
}
