package com.ldeepak.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicsRunner {

	public static void main(String[] args) {
		
		String s = "hello";
		System.out.println(s.length()); // length() is a method
		
		int[] a = new int[25];
		System.out.println(a.length); // length is property
		
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		mp.put('A', 1);
		mp.put('B', 2);
		System.out.println(mp.get('A')); 
		System.out.println(mp.getOrDefault('Z', 0));
		System.out.println(mp.get('A') == mp.get('B')); // This might not give accurate results always. DO NOT USE this direct comparison.
		System.out.println(mp.get('A').intValue() == mp.get('B').intValue()); // Use this way
		
		// Sort string
		char[] ca = s.toCharArray();
        Arrays.sort(ca);
        String key = String.valueOf(ca);
        System.out.println(key);
        
        // Reversing collections
        List<Integer> myList = new ArrayList<>();
        
        myList.add(10);
        myList.add(20);
        myList.add(30);
        
        Collections.reverse(myList);
        System.out.println(myList.toString());
       
        // Char to int
        char ch = '5';
//        int x = ch; // ASCII value of '5' i.e 53
        int x = Character.getNumericValue(ch);
        System.out.println(x);
        
	}

}
