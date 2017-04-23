/**
 * 
 */
package com.mycompany.ass2.chapter5;

/**
 * @author Kathleen Falcon
 *
 */
public class AutoPolicy {	//Program_5_30
	private int accountNumber;
	private String makeAndModel;
	private String state;
	
	public AutoPolicy(int actN, String mM)
	{
		setAccountNumber(actN);
		setMakeAndModel(mM);
	}
	public String isNoFaultState()
	{
		String noFaultState; 
	      
	      switch (getState())
	      {
	         case "MA": case "NJ": case "NY": case "PA":
	            noFaultState = "is";
	            break;
	         case "N/A":
	        	noFaultState= "Error";
	        	break;
	         default:
	            noFaultState = "is not";
	            break;
	      }

	      return noFaultState;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getMakeAndModel() {
		return makeAndModel;
	}

	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

	public String getState() {
		return state;
	}

	public String setState(String state) {
		  String result = ""; 
		  
	      if(state.equals("CT") || state.equals("MA") || state.equals("ME") || 
	    	 state.equals("NH") || state.equals("NJ") || state.equals("NY") || 
	    	 state.equals("PA") || state.equals("VT"))
	      {
	    	  this.state = state;
	    	  result="Success";
		   }
	      else {
	    	 System.out.println("Error");
	    	 this.state="N/A";
	      }
	      	
	      return result;
	}

}
