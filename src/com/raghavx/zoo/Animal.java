package com.raghavx.zoo;

public class Animal {
	
	// state 
	private final int id;
	
	public Animal(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	
	
	
	// behaviour 
	public void walk() {
		System.out.println("Animal walks ");
	}

	public void talk() {
		System.out.println("Animal talks ");
	}

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
