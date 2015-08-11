package com.lessons.lesson11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pdudenkov on 06.08.15.
 */
public class GameGui extends JApplet {
    private JPanel p, mainp;
    private GridLayout gl, maingl;
    private JButton[] buttons;

    public void init() {
        GameEngine gameEngine = new GameEngine(this);
        mainp = new JPanel();
        p = new JPanel();
        gl = new GridLayout(3,3);
        maingl = new GridLayout(2,1);

        buttons = new JButton[9];
        p.setLayout(gl);
        mainp.setLayout(maingl);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(gameEngine);
            p.add(buttons[i]);
        }
        mainp.add(p);

        JTextField tf = new JTextField();
        tf.setText("Player X");
        tf.setEnabled(false);
        mainp.add(tf);

        //p.add(tf);
        add(mainp);
        setVisible(true);
    }

    public JButton[] getButtons() {
        return buttons;
    }
}
