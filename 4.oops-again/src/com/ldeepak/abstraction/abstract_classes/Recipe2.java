package com.ldeepak.abstraction.abstract_classes;

public class Recipe2 extends AbstractRecipe {

	// Recipe2 class extends Abstract class and provides implementation for abstract methods present in the abstract class.
	
	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
		System.out.println("Turn on the microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("Do the dish");
		System.out.println("Put the dish in microwave");
	}

	@Override
	void cleanUp() {
		System.out.println("Clean the utensils");
		System.out.println("Turn off the microwave");
	}

}
