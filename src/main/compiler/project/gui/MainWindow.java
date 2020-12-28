package compiler.project.gui;
import javax.swing.*;
/**
 * @author: 骆荟州
 * @createTime: 2020/12/20 12:44 下午
 * @updateTime:
 */
public class MainWindow {

    public static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        //frame.getContentPane().add(label);
        JTextField codeField = new JTextField();

        frame.getContentPane().add(codeField);
        // 显示窗口
        frame.pack();
        frame.setVisible(true);
    }
}
