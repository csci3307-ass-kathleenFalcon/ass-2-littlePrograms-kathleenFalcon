/**
 * 
 */
package com.mycompany.ass2.chapter3;

/**
 * @author Kathleen Falcon
 * 
 */
public class Account {	//Program_3_11
	
	private String name;
	private double balance;

	public Account(String name, double balance)
	{
		this.name = name;
		
		if (balance > 0.0)
			this.setBalance(balance);
	}
	public void deposit(double depositAmt)
	{
		if (depositAmt > 0.0)
			setBalance(getBalance() + depositAmt);
	}
	public void withdraw(double withdrawAmt)
	{
		if (withdrawAmt > 0.0)
		{
			if (withdrawAmt < balance)
				setBalance(getBalance() - withdrawAmt);
			else
				System.out.println("Withdrawal amount exceeded account balance.");
		}

	}
	public void setName(String name)
	{
		this.name = name;
	}
	// method that returns the name
	public String getName()
	{
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
