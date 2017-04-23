/**
 * 
 */
package com.mycompany.ass2.chapter4;

/**
 * @author Kathleen Falcon
 *
 */
public class Fig_4_4_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Student s1 = new Student("Kathleen", 100.0);
		Student s2 = new Student("John Blue", 72.75);
		
		System.out.printf("%s's letter grade is: %s%n", s1.getName(), s1.getLetterGrade());
		System.out.printf("%s's letter grade is: %s%n", s2.getName(), s2.getLetterGrade());
	}

}
