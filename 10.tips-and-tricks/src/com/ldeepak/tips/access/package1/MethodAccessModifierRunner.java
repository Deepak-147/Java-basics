package com.ldeepak.tips.access.package1;

public class MethodAccessModifierRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodAccessModifiers mam = new MethodAccessModifiers();
		
		// Outside the class but within the package only private is not allowed.
		
		mam.publicMethod();
		mam.protectedMethod();
		
//		mam.privateMethod(); // NOT ALLOWED
		
		mam.defaultMethod();
	}

}
