package com.raghavx.fin;

import java.awt.Color;

public class Car {

		// state 
		private int wheels;
		private Color color;
		private int gears;
		private int doors;
		private String engineVariant;
		private float speed, average;
		private boolean start;
		
		private final String carNumber;
		
		public Car(String carNumber) {
			this.carNumber = carNumber;
		}
		
		// behavior 
		public void drive() {
			
		}
		
		public void towing() {
			
		}
		
		// identity 
		@Override
		public boolean equals(Object obj) {
			Car c = (Car)obj;
			if(c.carNumber.equals(carNumber)) {
				return true;
			}
			return false;
		}
	
}
