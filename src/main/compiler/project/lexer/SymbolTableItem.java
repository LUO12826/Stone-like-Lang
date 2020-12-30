/**
 * @Author 范承祥
 * @CreateTime 2020/10/31
 * @UpdateTime 2020/10/31
 */
package compiler.project.lexer;

import java.util.Objects;

/**
 * 符号表项
 */
public class SymbolTableItem {
    /**
     * 标识符名
     */
    private String name;

    /**
     * 行号
     */
    private int line;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SymbolTableItem item = (SymbolTableItem) o;
        return name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
