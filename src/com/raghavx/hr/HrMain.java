package com.raghavx.hr;

public class HrMain {

	public static void main(String[] args) {
		
		Employee a = new Employee(1);
		a.doWork();
		
		Employee b = new Employee(2);
		b.doWork();
		b.doWork();
		
		a.howMuchWork();
		b.howMuchWork();
		System.out.println(a.equals(b));
		
	}

}
