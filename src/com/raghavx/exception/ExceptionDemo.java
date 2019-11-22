package com.raghavx.exception;

/**
 * try catch finally
 * 
 * throw throws
 * 
 * checked exception unchecked exception runtime exception
 * 
 * error
 * 
 * @author raghav
 *
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		try {
			int result = a / b;
			System.out.println(result);
		} catch (Exception ex) {
			System.out.println("Infinity");
		}
	}

}
