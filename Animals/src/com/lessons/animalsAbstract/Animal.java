package com.lessons.animalsAbstract;

/**
 * Created by pdudenkov on 28.07.15.
 */
public abstract class Animal {
    private Integer age;
    private String name;
    private Integer countLegs;
    private AnimalType type;

    public static enum AnimalType {FURRY, SLICKY, FEATHERED};

    public Animal(Integer age, String name, Integer countLegs, AnimalType type) {
        this.age = age;
        this.name = name;
        this.countLegs = countLegs;
        this.type = type;
    }

    public abstract String makeNoise();

    public String getData() {
        return "Age:\t"+this.age+"\r\n"+"Name:\t"+this.name+"\r\nLegs:\t"+this.countLegs;
    }
}
