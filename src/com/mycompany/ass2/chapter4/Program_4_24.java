/**
 * 
 */
package com.mycompany.ass2.chapter4;

import java.util.Scanner;

/**
 * @author Kathleen Falcon
 *
 */
public class Program_4_24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int passes = 0, failures = 0;
		int studentCounter = 1;
		int result = 0;
		
		while (studentCounter <= 10)
		{
			do
			{
				System.out.print("Enter result (1 = pass, 2 = fail): ");
				result = input.nextInt();
	
			} while (result != 1 && result != 2);
			
			if (result == 1)
				passes++;
			else
				failures++;
			
			studentCounter++;
		}
		
		input.close();
		
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		
		if (passes > 8)
			System.out.print("Bonus to instructor!");

	}

}
