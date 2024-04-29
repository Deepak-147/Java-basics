package com.ldeepak.tips.nonaccess;

final class FinalClass {
	
}

// A Final class cannot be extended
//class SomeClass extends FinalClass {
//	
//}


class SomeClass {
	
	final public void doSomething() {
		
	}
}

class AnotherClass extends SomeClass {
	
	// A Final method cannot be overridden.
//	public void doSomething() {
//		
//	}
}


public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int i = 5;
		
		// A Final variable cannot be modified
//		i = 7;
	}

}
