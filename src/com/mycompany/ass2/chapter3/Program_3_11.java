/**
 * 
 */
package com.mycompany.ass2.chapter3;

import java.util.Scanner;

/**
 * @author Kathleen Falcon
 * 
 */
public class Program_3_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create two new instances of account class
		Account act1 = new Account("Chris", 1500.00);
		Account act2 = new Account("Kathleen", 6000.00);
		
		//output names and balance of both accounts
		System.out.printf("%s's balance: $%.2f%n", act1.getName(), act1.getBalance());
		System.out.printf("%s's balance: $%.2f%n", act2.getName(), act2.getBalance());

		Scanner input = new Scanner(System.in);
		
		//request deposit for act1
		System.out.printf("Enter deposit amount for %s's account: ", act1.getName());
		double deposit = input.nextDouble();
		System.out.printf("%nAdding %.2f to %s's account balance.%n%n", deposit, act1.getName());
		act1.deposit(deposit);
		
		//show balances
		System.out.printf("%s's balance: $%.2f%n", act1.getName(), act1.getBalance());
		System.out.printf("%s's balance: $%.2f%n", act2.getName(), act2.getBalance());
		
		//request deposit for act2
		System.out.printf("Enter deposit amount for %s's account: ", act2.getName());
		deposit = input.nextDouble();
		System.out.printf("%nAdding %.2f to %s's account balance.%n%n", deposit, act2.getName());
		act2.deposit(deposit);
		
		input.close();
		
		//show balances
		System.out.printf("%s's balance: $%.2f%n", act1.getName(), act1.getBalance());
		System.out.printf("%s's balance: $%.2f%n", act2.getName(), act2.getBalance());
		
		
	}

}
