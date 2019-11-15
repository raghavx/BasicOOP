package com.raghavx.hr;

public class HrMain {

	public static void main(String[] args) {

		Employee a = new Employee(1);
		a.getActivity().doWork();

		Employee b = new Employee(2);
		Activity activity = b.getActivity();
		activity.doWork();
		activity.doWork();

		activity = a.getActivity();
		activity.howMuchWork();
		activity.howMuchWork();
		System.out.println(a.equals(b));

	}

}
