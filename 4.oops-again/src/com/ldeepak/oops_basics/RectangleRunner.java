package com.ldeepak.oops_basics;

public class RectangleRunner {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(12, 20);
		System.out.println(rectangle);
		
		rectangle.setWidth(34);
		System.out.println(rectangle);
		
		System.out.println("Area: "+ rectangle.area());
		System.out.println("Perimeter: "+ rectangle.perimeter());
	}

}
