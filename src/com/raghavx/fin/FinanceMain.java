package com.raghavx.fin;

public class FinanceMain {

	public static void main(String[] args) {

		Car car = new Car("MH03Ad1496");
		Car car2 = new Car("MH03Ad1496");
		System.out.println(car.equals(car2));
		
		System.out.println(car.getWheels());
		
	}

}
