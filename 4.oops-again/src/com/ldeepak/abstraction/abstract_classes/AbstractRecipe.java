package com.ldeepak.abstraction.abstract_classes;

public abstract class AbstractRecipe {
	
	// Non abstract methods
	public void execute() {
		getReady();
		doTheDish();
		cleanUp();
	}
	
	// Abstract methods
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanUp();
	
}
