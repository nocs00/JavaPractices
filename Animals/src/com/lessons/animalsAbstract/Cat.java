package com.lessons.animalsAbstract;


/**
 * Created by pdudenkov on 28.07.15.
 */
public class Cat extends Animal {

    public Cat(Integer age, String name, Integer countLegs, AnimalType type) {
        super(age,name,countLegs,type);
    }

    public String makeNoise() {
        return "Cat: Meow!\r\nPersonal agent data:\r\n"+this.getData();
    }
}
