/**
 * 
 */
package com.mycompany.ass2.chapter4;

/**
 * @author Kathleen Falcon
 *
 */
public class Fig_4_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int c = 5;
		System.out.printf("c before postincrement: %d%n", c);
		System.out.printf("postincrementing c: %d%n", c++);
		System.out.printf("c after postincrement: %d%n", c);
		
		System.out.println();
		
		c = 5;
		System.out.printf("c before postincrement: %d%n", c);
		System.out.printf("postincrementing c: %d%n", ++c);
		System.out.printf("c after postincrement: %d%n", c);
	}

}
