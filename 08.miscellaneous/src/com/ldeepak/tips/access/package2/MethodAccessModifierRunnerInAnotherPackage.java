package com.ldeepak.tips.access.package2;

import com.ldeepak.tips.access.package1.MethodAccessModifiers;

public class MethodAccessModifierRunnerInAnotherPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodAccessModifiers mam = new MethodAccessModifiers();
		
		// Outside the class and also outside the package only public is allowed.
		mam.publicMethod();
		
//		mam.protectedMethod(); // NOT ALLOWED
//		mam.privateMethod(); // NOT ALLOWED
//		mam.defaultMethod(); // NOT ALLOWED
	}

}
