package com.lessons.lesson6;

public class Contractor extends Person implements Payable {
	public Contractor (String name) {
		super(name);
	}
	
	public boolean increasePay(int percent) {
		if (percent < Payable.INCREASE_CAP) {
			System.out.println("Increasing salary by " + percent + "%. "+ getName()); 
			return true; 
		} else {
			System.out.println("Sorry, cant increase salary by " + percent + "% (max "+ Payable.INCREASE_CAP + ". "+ getName()); 
			return false; 
		}
		//return false;
	}
}
