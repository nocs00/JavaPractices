package com.lessons.lesson7;

/**
 * Created by pdudenkov on 27.07.15.
 */
public class Employee extends Person {

    public Employee(String name) {
        super(name);
    }

    public boolean increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + "%. "+ getName());
        return true;
    }
}
