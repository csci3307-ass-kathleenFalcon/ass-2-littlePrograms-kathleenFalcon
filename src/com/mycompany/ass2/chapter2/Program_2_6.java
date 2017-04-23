/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

/**
 * @author Kathleen Falcon
 * 
 */
public class Program_2_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//variables
		int x, y, z, result;
		
		//read input
		System.out.print("Enter the first integer: ");
		x = input.nextInt();
		System.out.print("Enter the second integer: ");
		y = input.nextInt();
		System.out.print("Enter the third integer: ");
		z = input.nextInt();

		input.close();
		
		//arithmetic
		result = x * y * z;

		//output
		System.out.printf("Product is: %d%n", result);
		
	}

}
