/**
 * 
 */
package com.mycompany.ass2.chapter4;

/**
 * @author Kathleen Falcon
 *
 */
public class Employee {			//Program_4_20
	
	private String name;
	private double hoursWorked;
	private double rate;
	private double pay = 0.0;
	
	public Employee(String n, double hW, double r) {
		setName(n);
		setHoursWorked(hW);
		setRate(r);
	}
	public void calculatePay()
	{
		double grossPay = 0.0, overTime = 0.0;
		
		if (hoursWorked <= 40) {
			if (hoursWorked >= 0) {
				grossPay = hoursWorked * rate;
			}
		}
		else {
			grossPay = 40 * rate;
			overTime = (hoursWorked - 40) * (rate * 1.5);
		}
		
		pay = grossPay + overTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
}
