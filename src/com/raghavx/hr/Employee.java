package com.raghavx.hr;

public class Employee {
	// state
	private final int id;
	private int age =0;
	private String name;
	private Education[] education = new Education[5];
	
	private Address address;

	private Activity activity;
	// behaviour

	public Employee(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.activity = new Activity();
	}

	public Activity getActivity() {
		return activity;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Education[] getEducation() {
		return education;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	// identity
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return emp.id == this.id;
	}

}
