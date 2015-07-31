import javax.swing.*;
import java.awt.*;

/**
 * Created by pdudenkov on 29.07.15.
 */
public class Test extends JFrame{

    public Test(JPanel input, String title) {
        setContentPane(input);
        setSize(300,300);
        setTitle(title);
        setVisible(true);
    }

    public static void main(String[] args) {
        //
        JPanel myPanel = new JPanel();
        //
        FlowLayout fl = new FlowLayout();
        myPanel.setLayout(fl);
        //
        JButton myButton = new JButton("Test button");
        myPanel.add(myButton);
        //
        Test myJFrame = new Test(myPanel, "Hello world");
    }
}
