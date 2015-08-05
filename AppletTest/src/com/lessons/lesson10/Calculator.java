package com.lessons.lesson10;

import javax.swing.*;
import java.awt.*;
import com.lessons.lesson10.CalculatorEngine;

/**
 * Created by pdudenkov on 31.07.15.
 */
public class Calculator {

    private JPanel p;
    private GridBagLayout gb;
    private JTextField displayField;
    private JButton[] buttons;
    private GridBagConstraints constr;
    //private JFrame frame;
    private JApplet applet;

    public Calculator(JApplet applet) {
        this.applet = applet;
        p = new JPanel();
        gb = new GridBagLayout();
        p.setLayout(gb);

        displayField = new JTextField();
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

        buttons = new JButton[16];
        for (JButton b : bNumber) {
            int i = Integer.valueOf(b.getText());
            buttons[i] = b;
        }
        buttons[10] = bEqual;
        buttons[11] = bPlus;
        buttons[12] = bMinus;
        buttons[13] = bDivide;
        buttons[14] = bMultiply;
        buttons[15] = bPoint;

        CalculatorEngine engine = new CalculatorEngine(this);
        for (JButton b : buttons) {
            b.addActionListener(engine);
        }

        constr = new GridBagConstraints();

        constr.insets = new Insets(2,5,2,5);
        constr.fill= constr.BOTH;
        constr.weightx = 1.0;
        constr.weighty = 1.0;
        constr.anchor=constr.CENTER;
        constr.gridx=0;
        constr.gridy=0;
        constr.gridheight = 1;
        constr.gridwidth = 4;
        constr.ipady = 20;
        gb.setConstraints(displayField,constr);
        p.add(displayField);
        constr.ipady = 0;
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


//        frame = new JFrame();
//        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
//        frame.setTitle("Calculator");
//        frame.setContentPane(p);
//        //frame.pack();
//        frame.add(applet);
//        frame.setSize(370,200);
//        frame.setResizable(false);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
        applet.setContentPane(p);
        applet.setSize(370,200);
        applet.setVisible(true);
    }

    public String getResult() {
        return displayField.getText();
    }

    public void setResult(String value) {
        displayField.setText(value);
    }
}
