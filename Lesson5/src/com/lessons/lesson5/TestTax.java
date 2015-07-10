package com.lessons.lesson5;

import com.lessons.lesson5.Tax;

class TestTax{
    public static void main(String[] args){
           //double grossIncome; // local variables
           //String state;
           //int dependents;
           
           if (args.length != 3) {
        	   System.out.println("Sample usage of the program:" + 
        	   " java TestTax 50000 NJ 2");
        	   System.exit(0);
           }
           
           double grossIncome = Double.parseDouble(args[0]); 
           String state = args[1];
           int dependents = Integer.parseInt(args[2]);
        
           //grossIncome= 50000; 
           //dependents= 2;
           //state= "NJ";

           Tax   t = new Tax(grossIncome, state, dependents); 
           Tax   t2 = new Tax(65000, "TX", 4 ); 

           double yourTax = t.calcTax(); //calculating tax 
           double hisTax = t2.calcTax();
           
           System.out.println(yourTax);
           System.out.println(hisTax);
           //t.convertToEuros(yourTax);
           //t.convertToEuros(hisTax);            
    } 
}
