package com.ldeepak.exceptionhandling;

public class CheckedExceptionsRunner {

	public static void main(String[] args) {
		// This will throw a Checked exception. How to handle? 
		// (Two ways)
		// 1. Surround with try/catch block (Used this in the example) OR
		// 2. Add throws keyword (throw the exception)
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
