/**
 * 
 */
package com.mycompany.ass2.chapter5;

/**
 * @author Kathleen Falcon
 *
 */
public class Program_5_30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry");
		AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion");
		
		policy1.setState("NJ");
		policy2.setState("MB");
		  
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
	}
	public static void policyInNoFaultState(AutoPolicy p)
	{
		if (p.isNoFaultState() != "Error")
		{
			System.out.println("The auto policy:");
			System.out.printf("Account #: %d; Car: %s; %nState %s %s a no-fault state%n%n",
						p.getAccountNumber(), p.getMakeAndModel(),
						p.getState(), p.isNoFaultState());
		}
		else
			System.out.printf("Error: Could not retrieve policy for State \"%s\"", p.getState());
	}

}
