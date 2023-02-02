package com.ldeepak.abstraction.abstract_classes;

public class RecipeRunner {

	public static void main(String[] args) {
		
//		Recipe1 recipe = new Recipe1();
//		Recipe2 recipe = new Recipe2();
		
		AbstractRecipe recipe = new Recipe1();
//		AbstractRecipe recipe = new Recipe2();
		recipe.execute();

	}

}
