import javax.swing.*;
import java.awt.*;

/**
 * Created by pdudenkov on 29.07.15.
 */
public class Test3{
    public static void main(String[] args) {
        JPanel windowContent= new JPanel();

        //FlowLayout fl = new FlowLayout();
        //GridLayout fl = new GridLayout(4,2,5,5);
        //BoxLayout fl = new BoxLayout(windowContent, BoxLayout.Y_AXIS);
        BorderLayout fl = new BorderLayout();
        //CardLayout fl = new CardLayout();
        //GridBagLayout fl = new GridBagLayout();
        windowContent.setLayout(fl);

        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");

        windowContent.add(BorderLayout.NORTH,result);

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5,4));
        JButton[] p1buttons = new JButton[20];
        for (int i = 0; i < 20; i++) {
            p1buttons[i] = new JButton(String.valueOf(i));
            p1.add(p1buttons[i]);
        }
        windowContent.add(BorderLayout.CENTER,p1);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4,1));
        JButton[] p2buttons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            p2buttons[i] = new JButton("p2:"+String.valueOf(i));
            p2.add(p2buttons[i]);
        }
        windowContent.add(BorderLayout.WEST,p2);
        /*
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);

        windowContent.add(go);
        */

        JFrame frame = new JFrame("My First Calculator");

        frame.setContentPane(windowContent);

        //frame.setSize(400,100);
        frame.pack();
        frame.setVisible(true);
        //frame.setResizable(false);
    }
}