package com.lessons.lesson7;

/**
 * Created by pdudenkov on 28.07.15.
 */
public class ForeignContractor extends Person {
    public ForeignContractor(String name) {
        super(name);
    }

    public boolean increasePay(int percent) {
        return false;
    }
}
