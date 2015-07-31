import javax.swing.*;
import java.awt.*;

/**
 * Created by pdudenkov on 30.07.15.
 */
public class Calculator {
    // Set the GridBagLayout for the window’s content pane
    public static void main (String args[]) {
        JPanel p = new JPanel();
        GridBagLayout gb = new GridBagLayout();
        p.setLayout(gb);

        JTextField displayField = new JTextField();
        JButton bEqual = new JButton("=");
        JButton bPlus = new JButton("+");
        JButton bMinus = new JButton("-");
        JButton bDivide = new JButton("\\");
        JButton bMultiply = new JButton("*");
        JButton bPoint = new JButton(".");
        JButton[] bNumber = new JButton[10];
        for (int i = 0; i < 10; i++) {
            bNumber[i] = new JButton(String.valueOf(i));
        }

        GridBagConstraints constr = new GridBagConstraints();

        constr.insets = new Insets(2,5,2,5);
        constr.fill= constr.BOTH;
        constr.weightx = 1.0;
        constr.weighty = 1.0;
        constr.anchor=constr.CENTER;
        constr.gridx=0;
        constr.gridy=0;
        constr.gridheight = 1;
        constr.gridwidth = 4;
        gb.setConstraints(displayField,constr);
        p.add(displayField);
        constr.gridwidth = 1;
        //first row
        constr.gridy=1;
        constr.gridx=0;
        gb.setConstraints(bNumber[9],constr);
        p.add(bNumber[9]);
        constr.gridx=1;
        gb.setConstraints(bNumber[8],constr);
        p.add(bNumber[8]);
        constr.gridx=2;
        gb.setConstraints(bNumber[7],constr);
        p.add(bNumber[7]);
        constr.gridx=3;
        gb.setConstraints(bMultiply,constr);
        p.add(bMultiply);
        //second row
        constr.gridy=2;
        constr.gridx=0;
        gb.setConstraints(bNumber[6],constr);
        p.add(bNumber[6]);
        constr.gridx=1;
        gb.setConstraints(bNumber[5],constr);
        p.add(bNumber[5]);
        constr.gridx=2;
        gb.setConstraints(bNumber[4],constr);
        p.add(bNumber[4]);
        constr.gridx=3;
        gb.setConstraints(bDivide,constr);
        p.add(bDivide);
        //third row
        constr.gridy=3;
        constr.gridx=0;
        gb.setConstraints(bNumber[3],constr);
        p.add(bNumber[3]);
        constr.gridx=1;
        gb.setConstraints(bNumber[2],constr);
        p.add(bNumber[2]);
        constr.gridx=2;
        gb.setConstraints(bNumber[1],constr);
        p.add(bNumber[1]);
        constr.gridx=3;
        gb.setConstraints(bPlus,constr);
        p.add(bPlus);
        //fourth row
        constr.gridy=4;
        constr.gridx=0;
        gb.setConstraints(bNumber[0],constr);
        p.add(bNumber[0]);
        constr.gridx=1;
        gb.setConstraints(bPoint,constr);
        p.add(bPoint);
        constr.gridx=2;
        gb.setConstraints(bEqual,constr);
        p.add(bEqual);
        constr.gridx=3;
        gb.setConstraints(bMinus,constr);
        p.add(bMinus);


        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setContentPane(p);
        //frame.pack();
        frame.setSize(370,200);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
