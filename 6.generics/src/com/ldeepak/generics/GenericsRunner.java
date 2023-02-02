package com.ldeepak.generics;

public class GenericsRunner {

	public static void main(String[] args) {
		
		MyCustomList<String> list1 = new MyCustomList<String> ();
		list1.addElement("Element 1");
		list1.addElement("Element 2");
		
		System.out.println(list1);
		System.out.println(list1.get(0));
		
		MyCustomList<Integer> list2 = new MyCustomList<Integer> ();
		list2.addElement(1);
		list2.addElement(2);
		
		System.out.println(list2);
		System.out.println(list2.get(0));
	}

}
