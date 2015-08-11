package com.lessons.lesson11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pdudenkov on 06.08.15.
 */
public class GameEngine implements ActionListener{
    private GameGui gameGui;
//    Object[] options = { "Play again", "Exit" };
//    //optionPane.setToolTipText("Congratulations!");
//    JOptionPane optionPane = new JOptionPane(gameGui,
//     JOptionPane.QUESTION_MESSAGE,JOptionPane.DEFAULT_OPTION,
//            null, options, options[0]);


    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        if (isGameOver() == true) {
//            optionPane.setVisible(true);
//            Object selectedValue = (Object)optionPane.getValue();
//            if (selectedValue != null && selectedValue.equals(options[0])) {
//                reset();
//            } else {
//                System.exit(0);
//            }
            reset();
        }
        if (!b.getText().equals("X")) {
            b.setText("X");
        }
    }



    private void reset() {
        JButton[] buttons = gameGui.getButtons();
        for (JButton b : buttons) {
            b.setText("");
        }
    }

    public boolean isGameOver() {
        JButton[] buttons = gameGui.getButtons();
        final int dimension = 3;
        final int winCnt = 3;

        //find first X and O
        int X = -1, O = -1, numX = 0, numO = 0;
        for (int i = 0; i < dimension*dimension; i++) {
            if (buttons[i].getText().equals("") || buttons[i].getText() == null) {
                continue;
            } else if (buttons[i].getText().equals("X")) {
                if (numX == 0) X = i;
                numX++;
            } else if (buttons[i].getText().equals("O")) {
                if (numO == 0) O = i;
                numO++;
            }
        }

        if (winCnt-(X % dimension) > 1 || X < 0 || numX < winCnt) {
            if (winCnt-(O % dimension) > 1 || O < 0 || numO < winCnt) {
                return false;
            }
        } else { //there might be win streak
            //checking X
            int positionX = X;
            int rowX = 1, columnX = 1, diagonalLeftX = 1, diagonalRightX = 1;
            while (positionX < dimension*dimension) {
                positionX++;
                //something
            }

        }


        return false;
    }

    public GameEngine(GameGui gameGui) {
        this.gameGui = gameGui;
    }
}
