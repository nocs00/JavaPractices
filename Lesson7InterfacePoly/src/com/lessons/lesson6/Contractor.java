package com.lessons.lesson6;

/**
 * Created by pdudenkov on 27.07.15.
 */
public class Contractor implements Payable {
    private String name;

    public String getName() {
        return "Person's name is "+name;
    }

    public Contractor (String name) {
        this.name = name;
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
