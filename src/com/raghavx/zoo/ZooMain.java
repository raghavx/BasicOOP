package com.raghavx.zoo;

public class ZooMain {

	// 			Animal
	// Cat  				Dog
	// Tiger 
	
	public static void main(String[] args) {
		Animal a = new Cat(1);
		a.talk();
		a.walk();
		a.eat();
		
		Tiger t = new Tiger(1);
		System.out.println(t.equals(a));

	}

}
