package com.raghavx.zoo;

public class Cat extends Animal{

	public Cat(int id) {
		super(id);
	}

	@Override
	public void talk() {
		System.out.println("meow ... ");
	}
}
