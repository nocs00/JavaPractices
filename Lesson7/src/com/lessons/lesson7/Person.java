package com.lessons.lesson7;

/**
 * Created by pdudenkov on 27.07.15.
 */
public abstract class Person {
    private String name;
    private String address;
    static final int INCREASE_CAP = 20;

    public Person(String name) {
        this.name=name;
    }

    public String getName() {
        return "Person's name is "+name;
    }

    public void changeAddress(String address) {
        System.out.println("New address is " + address);
        this.address = address;
    }

    private void giveDayOff() {
        System.out.println("Giving a day off to "+name);
    }

    public void promote(int percent) {
        System.out.println(" Promoting a worker...");
        giveDayOff();
        increasePay(percent);
    }

    public abstract boolean increasePay(int percent);
}
