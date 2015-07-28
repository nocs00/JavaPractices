package com.lessons.lesson6;

/**
 * Created by pdudenkov on 28.07.15.
 */
public class ForeignContractor implements Payable{
    private String name;

    public String getName() {
        return "Person's name is "+name;
    }

    public ForeignContractor (String name) {
        this.name = name;
    }

    public boolean increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + "%. "+ getName());
        return true;
    }
}
