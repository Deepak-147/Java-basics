package com.ldeepak.oops_basics;

public class Address {

	private String line1;
	private String city;
	private String zip;
	
	// Constructor
	public Address(String line1, String city, String zip) {
		/***
		 * super keyword:
		 * We can use the super keyword to access the parent class
		 * We can use super() to call the parent default constructor
		 * We can use super to access the parent class variables and methods
		 * 
		 * super() should be the first statement in the constructor
		 * 
		 */
		super(); // this is not required as it will be automatically called by the compiler
		
		/**
		 * this keyword:
		 * The this keyword is a reference variable that refers to the current object.
		 * this is a final variable. Therefore, this cannot be assigned to any new value.
		 * this = null; won't work
		 * 
		 * this() can be used to invoke the current class constructor.
		 */
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + ", zip=" + zip + "]";
	}
	
}
