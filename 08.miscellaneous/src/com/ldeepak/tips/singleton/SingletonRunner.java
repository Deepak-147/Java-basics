package com.ldeepak.tips.singleton;

/**
 * Singleton class:
 * A Singleton class in Java is a design pattern that restricts the instantiation of a class to only one object. 
 * This means that no matter how many times you try to instantiate the class, you will always get the same instance. 
 * Singleton classes are commonly used for scenarios where there's a need for exactly one instance of a class to coordinate actions across the system, such as logging, database operations, thread pools, and more.
 *
 */

class SingletonClass {
	private static SingletonClass instance;
	
	// Private constructor to prevent instantiation from outside
	private SingletonClass() {}
	
	public static SingletonClass getInstance() {
		// create the instance only if it's null
		if (instance == null) {
			instance = new SingletonClass();
		}
		return instance;
	}
}

/**
 * 
 * The Singleton pattern we discussed above is not thread-safe. 
 * If multiple threads try to access getInstance() simultaneously, it may create multiple instances. 
 * To make it thread-safe, you can use synchronized blocks
 *
 */
class ThreadSafeSingletonClass {
	private static ThreadSafeSingletonClass instance;
	
	// Private constructor to prevent instantiation from outside
	private ThreadSafeSingletonClass() {}
	
	public static ThreadSafeSingletonClass getInstance() {
		
		if (instance == null) {
			synchronized (ThreadSafeSingletonClass.class) {
				// create the instance only if it's null
				if (instance == null) {
					instance = new ThreadSafeSingletonClass();
				}
			}
		}
		
		return instance;
	}
}

public class SingletonRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass myObj1 = SingletonClass.getInstance();
		SingletonClass myObj2 = SingletonClass.getInstance();
		
		System.out.println(myObj1 == myObj2); // true
		
		ThreadSafeSingletonClass myObj3 = ThreadSafeSingletonClass.getInstance();
		ThreadSafeSingletonClass myObj4 = ThreadSafeSingletonClass.getInstance();
		
		System.out.println(myObj3 == myObj4); // true
	}

}
