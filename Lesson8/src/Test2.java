import javax.swing.*;
import java.awt.*;

/**
 * Created by pdudenkov on 29.07.15.
 */
public class Test2 extends JFrame{

    public Test2(JPanel input, String title) {
        setContentPane(input);
        setSize(600,300);
        setTitle(title);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        //
        JPanel myPanel = new JPanel();
        //myPanel.setSize(100,300);
        //

        GridLayout gl = new GridLayout(2,2);
        myPanel.setLayout(gl);
        //
        JButton button1 = new JButton("Test button");
        JLabel label1 = new JLabel("Label1: ");
        //JTextPane textpane1 = new JTextPane();
        JTextField textField = new JTextField();
        myPanel.add(label1);
        myPanel.add(textField);
        myPanel.add(button1);
        //
        Test myJFrame = new Test(myPanel, "Hello world");
    }
}