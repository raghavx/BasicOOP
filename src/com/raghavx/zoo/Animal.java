package com.raghavx.zoo;

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

	public void eat() {
		System.out.println("Animal eats ");
	}

	// identity 
	@Override
	public boolean equals(Object obj) {
		Animal a = (Animal)obj;
		return a.id == this.id;
	}
}
