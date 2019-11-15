package com.raghavx.hr;

public class Activity {
	private int hoursToday;

	public void doWork() {
		System.out.println("I am working ");
		hoursToday = hoursToday + 1;
	}

	public void howMuchWork() {
		System.out.println(hoursToday);
	}

	public int getHoursToday() {
		return hoursToday;
	}

	public void setHoursToday(int hoursToday) {
		this.hoursToday = hoursToday;
	}
}
