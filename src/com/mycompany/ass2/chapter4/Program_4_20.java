/**
 * 
 */
package com.mycompany.ass2.chapter4;

import java.util.Scanner;

/**
 * @author Kathleen Falcon
 *
 */
public class Program_4_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name;
		double hours, rate, pay;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.print("Enter your hours worked: ");
		hours = input.nextDouble();
		
		System.out.print("Enter your hourly rate: ");
		rate = input.nextDouble();
		
		input.close();
		
		Employee emp1 = new Employee(name, hours, rate);
		
		emp1.calculatePay();
		
		System.out.printf("%s's gross pay is: $%.2f", emp1.getName(), emp1.getPay());

	}

}
