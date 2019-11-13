package com.raghavx.hr;

public class Employee {
	// state
	private final int id;
	private int age, hoursToday = 0;
	private String name, education;

	// behaviour

	public Employee(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	public void doWork() {
		System.out.println("I am working ");
		hoursToday = hoursToday + 1;
	}

	public void howMuchWork() {
		System.out.println(hoursToday);
	}

	// identity
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return emp.id == this.id;
	}

}
