package com.lessons.lesson6;

/**
 * Created by pdudenkov on 27.07.15.
 */
public class Employee implements Payable {
    private String name;

    public String getName() {
        return "Person's name is "+name;
    }

    public Employee (String name) {
        this.name = name;
    }

    public boolean increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + "%. "+ getName());
        return true;
    }
}
