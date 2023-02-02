package com.ldeepak.collections_basic.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		
		List<Character> myList = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		
		// Do not care about sorted order and order of insertion
		Set<Character> myHashSet = new HashSet<Character> (myList);
		System.out.println(myHashSet); // [A, B, F, Z]
		
		// Order of insertion
		Set<Character> myLinkedHashSet = new LinkedHashSet<Character> (myList);
		System.out.println(myLinkedHashSet); // [A, Z, B, F]
		
		// Sorted order
		Set<Character> myTreeSet = new TreeSet<Character> (myList);
		System.out.println(myTreeSet); // [A, B, F, Z]
		
	}

}
