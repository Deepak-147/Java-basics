package com.ldeepak.abstraction.abstract_classes;

public class Recipe1 extends AbstractRecipe {

	// Recipe1 class extends Abstract class and provides implementation for abstract methods present in the abstract class.
	
	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
	}

	@Override
	void doTheDish() {
		System.out.println("Do the dish");
	}

	@Override
	void cleanUp() {
		System.out.println("Clean the utensils");
	}

}
