package com.lessons.lesson6;

/**
 * Created by pdudenkov on 27.07.15.
 */
public class Contractor extends Person implements Payable {

    public Contractor (String name) {
        super(name);
    }

    public boolean increasePay(int percent) {
        if (percent < INCREASE_CAP) {
            System.out.println("Increasing salary by " + percent + "%. "+ getName());
            return true;
        } else {
            System.out.println("Sorry, cant increase salary by " + percent + "%. "+ getName());
            return false;
        }
    }
}
