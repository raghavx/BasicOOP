package com.raghavx.zoo;

public class Cat extends Animal {

	public Cat(int id) {
		super(id);
	}

	@Override
	public void talk() {
		System.out.println("meow ... ");
	}

	@Override
	public void walk() {

		System.out.println(" cat walks ");
	}

	@Override
	public void eat() {
		System.out.println("Drinks milk");
		
	}

}
