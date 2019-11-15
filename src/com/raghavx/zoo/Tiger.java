package com.raghavx.zoo;
/**
 * subclass of Cat superclass 
 * @author raghav
 *
 */
public class Tiger extends Cat {
	
	
	public Tiger(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.println("roars...");
	}
}
