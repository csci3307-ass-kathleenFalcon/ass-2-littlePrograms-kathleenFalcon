/**
 * 
 */
package com.mycompany.ass2.chapter5;

/**
 * @author Kathleen Falcon
 *
 */
public class Program_5_18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double amount;
		double principal = 1000.0;
		double rate = 0.05;
		double pennies; 
		int dollars, cents;
		
		System.out.printf("%s%20s%n",  "Year", "Amount on deposit");
		
		for (int year = 1; year <= 10; ++year)
		{
			amount = principal * Math.pow(1.0 + rate, year);
			
			pennies = amount * 100;
			dollars = (int)pennies / 100;
		    cents = (int)pennies % 100;
		    
		    if (cents < 10)
		    	System.out.printf("%4d%18d.0%d%n", year, dollars, cents);
		    else
		    	System.out.printf("%4d%18d.%d%n", year, dollars, cents);		
		}
	}

}
