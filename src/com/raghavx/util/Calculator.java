package com.raghavx.util;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	// method overloading 
	// compile time polymorphism 
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	
	public void multiply(int a, int b) {
		int sum = 0;
		for(int i = 0; i < a; i++) {
			sum += b;
		}
		System.out.println(sum);
	}
}
