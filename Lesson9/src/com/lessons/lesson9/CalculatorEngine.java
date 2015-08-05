package com.lessons.lesson9;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * Created by pdudenkov on 31.07.15.
 */
public class CalculatorEngine implements ActionListener {

    private Calculator parent;

    private Float operand1 = null, operand2 = null;
    private Character operation = null;
    private enum State {ONGOING, INITIAL, WAITING_SECOND_OPERAND};
    private State state = State.INITIAL;

    public CalculatorEngine(Calculator parent) {
        this.parent = parent;
    }

    private Float calc () {
        Float r = 0f;

        switch (operation) {
            case '+':
                r = operand1 + operand2;
                break;
            case '-':
                r = operand1 - operand2;
                break;
            case '*':
                r = operand1 * operand2;
                break;
            case '\\':
                r = operand1 / operand2;
                break;
        }

        return r;
    }

    public void actionPerformed(ActionEvent e){

        JTextField field = null;
        JButton button = null;
        String textFromButton = "";

//        Character
//                    plus        = '+',
//                    minus       = '-',
//                    divide      = '\\',
//                    multiply    = '*',
//                    equal       = '=';

        if (e.getSource() instanceof JButton) {
            button = (JButton)e.getSource();
            textFromButton = button.getText();
            Float result;

            if (textFromButton == "+" || textFromButton == "-" || textFromButton == "*" || textFromButton == "\\") {
                if (state == State.ONGOING){
                    if (operand1 == null) {
                        operand1 = Float.valueOf(parent.getResult());
                        state = State.WAITING_SECOND_OPERAND;
                    } else if (operand2 == null) {
                        operand2 = Float.valueOf(parent.getResult());
                        if (operand2 == 0f && operation == '\\') {
                            parent.setResult("Please do no divide on zero.");
                            state = State.INITIAL;
                        } else {
                            operand1 = calc();
                            parent.setResult(String.valueOf(operand1));
                            state = State.WAITING_SECOND_OPERAND;
                        }
                    }
                    operand2 = null;
                    operation = textFromButton.charAt(0);
                } else if (state == State.INITIAL) {
                    if (parent.getResult().length() > 0) {
                        try {
                            operand1 = Float.valueOf(parent.getResult());
                        } catch (Exception ex) {
                            operand1 = 0f;
                        }
                    } else {
                        operand1 = 0f;
                    }
                    parent.setResult(String.valueOf(operand1));
                    operand2 = null;
                    operation = textFromButton.charAt(0);
                    state = State.WAITING_SECOND_OPERAND;
                } else if (state == State.WAITING_SECOND_OPERAND){
                    operation = textFromButton.charAt(0);
                }
//                result = Float.valueOf(parent.getResult());
//                parent.setResult("");
//                if (operand1 == null) {
//                    operand1 = result;
//                    operation = textFromButton.charAt(0);
//                } else if (operand2 == null) {
//                    operand2 = result;
//                    result = calc();
//                    operand1 = null;
//                    operand2 = null;
//                    operation = textFromButton.charAt(0);
//                    parent.setResult(String.valueOf(result));
//                }
            } else if (textFromButton == "=") {
                if (state == State.ONGOING){
                    if (operand1 == null) {
                        operand1 = Float.valueOf(parent.getResult());
                        state = State.ONGOING;
                    } else if (operand2 == null) {
                        operand2 = Float.valueOf(parent.getResult());
                        if (operand2 == 0f && operation == '\\') {
                            parent.setResult("Please do no divide on zero.");
                        } else {
                            operand1 = calc();
                            parent.setResult(String.valueOf(operand1));
                        }
                        operand2 = null;
                        operation = null;
                        state = State.INITIAL;
                    }
                } else if (state == State.INITIAL) {
                    operation = null;
                    state = State.INITIAL;
                } else if (state == State.WAITING_SECOND_OPERAND){
                    operation = null;
                    state = State.INITIAL;
                }
//                result = Float.valueOf(parent.getResult());
//                parent.setResult("");
//                if (operand1 == null) {
//                    ;
//                } else if (operand2 == null && operation != null) {
//                    operand2 = result;
//                    result = calc();
//                    operand1 = null;
//                    operand2 = null;
//                    operation = null;
//                    parent.setResult(String.valueOf(result));
//                }
            } else {
                if (state == State.ONGOING){
                    parent.setResult(parent.getResult()+textFromButton);
                } else if (state == State.INITIAL) {
                    state = State.ONGOING;
                    parent.setResult("");
                    parent.setResult(parent.getResult()+textFromButton);
                    operand1 = null;
                    operand2 = null;
                } else if (state == State.WAITING_SECOND_OPERAND){
                    state = State.ONGOING;
                    parent.setResult("");
                    parent.setResult(parent.getResult()+textFromButton);
                }
                //parent.setResult(parent.getResult()+textFromButton);
            }
        } else if (e.getSource() instanceof JTextField) {
            field = (JTextField)e.getSource();
        }

        //JOptionPane.showConfirmDialog(null,textFromButton,"Button pressed",JOptionPane.PLAIN_MESSAGE);
    }
}