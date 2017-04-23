/**
 * 
 */
package com.mycompany.ass2.chapter4;

import java.util.Scanner;

/**
 * @author Kathleen Falcon
 *
 */
public class Fig_4_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 1;
		
		while (gradeCounter <= 10)
		{
			System.out.print("Enter grade: ");
			int grade = input.nextInt();
			total += grade;
			gradeCounter++;
		}
		input.close();
		
		int average = total / 10;	//intentional integer division
		
		System.out.printf("%nTotal of all 10 grades is %d%n", total);
		System.out.printf("Class average is %d%n", average);

	}

}
