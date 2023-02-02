package com.ldeepak.tips.access.package1;

/**
 * Method Access modifiers:
 * public: Accessible everywhere, within the class, within the package, outside the package
 * private: Accessible within the class
 * protected: Accessible within the class, within the package
 * Default: no keyword required. Accessible within the class, within the package
 * */
public class MethodAccessModifiers {
	
	public void publicMethod() {
		
	}
	
	protected void protectedMethod() {
		
	}
	
	private void privateMethod() {
		
	}
	
	// when no access modifier is mentioned, then it is default
	void defaultMethod() {
		
	}
	
	public static void main(String[] args) {
		
		MethodAccessModifiers mam = new MethodAccessModifiers();
		
		// Within the class everything is allowed.
		mam.publicMethod();
		mam.protectedMethod();
		mam.privateMethod();
		mam.defaultMethod();
	}
}
