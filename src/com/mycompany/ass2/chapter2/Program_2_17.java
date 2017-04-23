/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

/**
 * @author Kathleen Falcon
 * 
 */
public class Program_2_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//variables
		int num1, num2, num3;
		int sum, product, average;
		int smallest, largest;
		
		//read inputs
		System.out.print("Enter the first integer: ");
		num1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		num2 = input.nextInt();
		System.out.print("Enter the third integer: ");
		num3 = input.nextInt();
		
		input.close();
		
		//get sum
		sum = num1 + num2 + num3;
		
		//get product
		product = num1 * num2 * num3;

		//get smallest
		smallest = num1;
		if (smallest > num2)
			smallest = num2;
		if (smallest > num3) 
			smallest = num3;
		
	 	//get largest
		largest = num1;
		if (largest < num2)
			largest = num2;
		if (largest < num3) 
			largest = num3;
		
		//get average
		average = (num1 + num2 + num3) / 3;
		
		//output
		System.out.printf("Smallest is %d%n", smallest);
		System.out.printf("Largest is %d%n", largest);
		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Product is %d%n", product);
		System.out.printf("Average is %d%n", average);
		
	}

}
