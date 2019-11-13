package com.raghavx.fin;

public class Loan {

	//1. state 
	private int amount = 100;
	private int id;
	
	//2. Behavior 
	public void giveLoan() {
		System.out.println("Give loan");
	}
	
	//3. identity 
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
