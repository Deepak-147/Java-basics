package com.ldeepak.abstraction.abstract_classes;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal animal1 = new Dog();
		animal1.move();
		animal1.sound();
		
		Animal animal2 = new Cat();
		animal2.move();
		animal2.sound();
	}

}
