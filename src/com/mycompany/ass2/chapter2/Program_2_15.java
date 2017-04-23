/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

/**
 * @author Kathleen Falcon
 * 
 */
public class Program_2_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//variables
		int num1, num2;
		int sum, diff, product;
		double quotient;
		
		//read inputs
		System.out.print("Enter the first integer: ");
		num1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		num2 = input.nextInt();
		
		input.close();
		
		//arithmetic
		sum = num1 + num2;
		diff = num1 - num2;
		product = num1 * num2;
		quotient = num1 / num2;
		
		//output
		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Difference is %d%n", diff);
		System.out.printf("Product is %d%n", product);
		System.out.printf("Quotient is %.2f%n", quotient);	//%.2f for 2 decimal places

	}

}
