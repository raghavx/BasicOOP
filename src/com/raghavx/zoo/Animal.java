package com.raghavx.zoo;

/**
 * supe class 
 * @author raghav
 *
 */
public abstract class Animal {
	
	// state 
	private final int id;
	
	public Animal(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	
	// behaviour 
	public abstract void walk() ;

	public abstract void talk();

	// make this method abstract 
	public abstract void eat() ;

	// identity 
	@Override
	public boolean equals(Object obj) {
		Animal a = (Animal)obj;
		return a.id == this.id;
	}
}
