package com.lessons.lesson6;

/**
 * Created by pdudenkov on 27.07.15.
 */
public abstract class Person implements Payable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return "Person's name is "+name;
    }

    public abstract boolean increasePay(int percent) ;
}
