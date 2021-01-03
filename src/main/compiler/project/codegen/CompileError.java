package compiler.project.codegen;

/**
 * @author: 骆荟州
 * @createTime: 2021/1/3 12:53 下午
 * @updateTime:
 */
public class CompileError {

    public int line;

    public int col;

    public int length;

    public String message;

    public CompileError(int line, int col, int length, String message) {
        this.line = line;
        this.col = col;
        this.length = length;
        this.message = message;
    }

    public CompileError(int line, int col, String message) {
        this.line = line;
        this.col = col;
        this.message = message;
    }

    @Override
    public String toString() {
        return "CompileError{" +
                "line=" + line +
                ", col=" + col +
                ", length=" + length +
                ", message='" + message + '\'' +
                '}';
    }
}
