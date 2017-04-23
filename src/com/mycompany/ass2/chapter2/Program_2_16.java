/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

/**
 * @author Kathleen Falcon
 * 
 */
public class Program_2_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//variables
		int num1, num2;
		
		//read inputs
		System.out.print("Enter the first integer: ");
		num1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		num2 = input.nextInt();
		
		input.close();
		
		if (num1 > num2)
			System.out.printf("%d is larger", num1);
		else if (num2 > num1)
			System.out.printf("%d is larger", num2);
		else
			System.out.printf("These numbers are equal");


	}

}
