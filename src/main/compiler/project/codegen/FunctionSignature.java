package compiler.project.codegen;
import java.util.Objects;


public class FunctionSignature {

    public String name;

    public int parameterNum;

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        FunctionSignature that = (FunctionSignature) o;
        return parameterNum == that.parameterNum &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parameterNum);
    }

    public FunctionSignature(String name, int parameterNum) {
        this.name = name;
        this.parameterNum = parameterNum;
    }
}
