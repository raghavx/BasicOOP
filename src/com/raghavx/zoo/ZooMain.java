package com.raghavx.zoo;

import com.raghavx.util.Calculator;

/**
 * Core OOPS concepts are:

	Abstraction
		Concept of hiding the internal details and describing things in simple form.
		
	*Encapsulation
		Is a technique used to implement abstraction in OOP.
		It is used for access restriction of class members and methods.
		Access modifiers - public, private and protected 
	*Polymorphism
		is the concept where an objet behaves diff in diff situations.
		1 - Compile time ( Method Overloading) 
		2 - Runtime ( Method overriding) 
	*Inheritance
		1 - is a mechanism of code reuse
		2 - is a concept where an object is based on another object 
		3 - object that is getting inherited is called superclass
		4 - object that inherits the superclass is called subclass 
	Association
		It defines relationship between two objects     
	Aggregation
		Has-A relationship 
	*Composition
		Has-A relationship with ownership 
	
 * @author raghav
 *
 */
public class ZooMain {

	// 			Animal
	// Cat  				Dog
	// Tiger 
	
	public static void main(String[] args) {
		Animal a = new Animal(1) {
			@Override
			public void walk() {
				System.out.println("Strange ");
			}
			
			@Override
			public void talk() {
				System.out.println("Strange ");				
			}
			
			@Override
			public EatingType eatingBehaviour() {
				
				return EatingType.Carnivourous;
			}
			
			@Override
			public void eat() {
				System.out.println("Strange ");	
				
			}
		};
	}

}
