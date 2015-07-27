package com.lessons.lesson6;

/**
 * Created by pdudenkov on 27.07.15.
 */
public interface Payable {
    boolean increasePay(int percent);
    int INCREASE_CAP = 20;
}