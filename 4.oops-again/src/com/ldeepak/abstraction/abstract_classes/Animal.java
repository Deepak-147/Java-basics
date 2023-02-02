package com.ldeepak.abstraction.abstract_classes;

public abstract class Animal {
	
	//Concrete method
	void move() {
		System.out.println("Animal is moving");
	}
	
	//Abstract method
	abstract void sound();
}
