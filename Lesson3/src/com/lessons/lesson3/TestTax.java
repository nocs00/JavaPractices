package com.lessons.lesson3;

class TestTax{
	public static void main(String[] args) {
		Tax t = new Tax(); // creating an instance
		t.grossIncome= 50000; // assigning the values
		t.dependents= 2;
		t.state= "NJ";
		double yourTax = t.calcTax(); //calculating tax 
		// Printing the result 
		System.out.println("Your tax is " + yourTax);
	} 
}
