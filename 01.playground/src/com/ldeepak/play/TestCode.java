package com.ldeepak.play;

import java.util.HashSet;
import java.util.Set;

public class TestCode {
    
	public static boolean isLowerCase(char ch) {
		return (ch >= 'a' && ch <= 'z');	
	}
	
	public static char toUpperCase(char ch) {
		return (char)(ch - 32);
	}
	
	// Using string builder
	public static String capitalizeEachWord(String input) {
		StringBuilder res = new StringBuilder(input);
		boolean found = false;
		
		for (int i=0; i<input.length(); i++) {
			char currCh = input.charAt(i);
			
			// Corner case. First character in the input should also be capitalized.
			if (i==0 && isLowerCase(currCh)) {
				res.setCharAt(i, toUpperCase(currCh));
			}
			else if (!found && currCh == '.') {
				found = true;
			}
			else if (found && currCh != ' ') {
				if (isLowerCase(currCh)) {
					res.setCharAt(i, toUpperCase(currCh));
				}
				found = false;
			}	
		}
		return res.toString();
	}
	
	// Using char array
//	public static String capitalizeEachWord(String input) {
//		
//		char[] characters = input.toCharArray();
//		boolean found = false;
//		
//		for (int i=0; i<characters.length; i++) {
//			char currCh = characters[i];
//			
//			// Corner case. First character in the input should also be capitalized.
//			if (i==0 && isLowerCase(currCh)) {
//				characters[i] = toUpperCase(characters[i]);
//			}
//			else if (!found && currCh == '.') {
//				found = true;
//			}
//			else if (found && currCh != ' ') {
//				if (isLowerCase(currCh)) {
//					characters[i] = toUpperCase(characters[i]);
//				}
//				found = false;
//			}
//		}
//		return new String(characters);
//	}
	
	// Using new string
//	public static String capitalizeEachWord(String input) {
//		String res = "";
//		boolean found = false;
//		
//		for (int i=0; i<input.length(); i++) {
//			char currCh = input.charAt(i);
//			
//			// Corner case. First character in the input should also be capitalized.
//			if (i==0 && isLowerCase(currCh)) {
//				currCh = toUpperCase(currCh);
//			}
//			else if (!found && currCh == '.') {
//				found = true;
//			}
//			else if (found && currCh != ' ') {
//				if (isLowerCase(currCh)) {
//					currCh = toUpperCase(currCh);
//				}
//				found = false;
//			}
//			
//			res += currCh;
//		}
//		return res;
//	}
	
	// Using same string
//	public static String capitalizeEachWord(String input) {
//		boolean found = false;
//		
//		for (int i=0; i<input.length(); i++) {
//			char currCh = input.charAt(i);
//			
//			// Corner case. First character in the input should also be capitalized.
//			if (i==0 && isLowerCase(currCh)) {
//				currCh = toUpperCase(currCh);
//			}
//			else if (!found && currCh == '.') {
//				found = true;
//			}
//			else if (found && currCh != ' ') {
//				if (isLowerCase(currCh)) {
//					currCh = toUpperCase(currCh);
//				}
//				found = false;
//			}
//			
//			input = input.substring(0, i) + currCh + input.substring(i + 1);
//		}
//		return input;
//	}

    
	public static void main(String[] args) {
//		String input = "this is the first. this is the second.this is the third. This is fourth";
//		System.out.println(reorganizeString("vvvol"));
//		System.out.println(capitalizeEachWord(input));
		
		int[] arr1 = new int[] {554569, 254312, 554, 5945};
		int[] arr2 = new int[] {5545};
		int res = 0;
		Set<String> hs = new HashSet<>();

        for (int i=0; i<arr1.length; i++) {
            String num = Integer.toString(arr1[i]);
            for (int j=0; j<num.length(); j++) {
                String prefix = num.substring(0, j+1);
                hs.add(prefix);
            }
        }
        
        for (int i=0; i<arr2.length; i++) {
            String num = Integer.toString(arr2[i]);
            for (int j=0; j<num.length(); j++) {
                String prefix = num.substring(0, j+1);
                if (hs.contains(prefix)) {
                	res = Math.max(res, prefix.length());
                }
            }
        }
        
        for (String i : hs) {
            System.out.print(i + " ");
        }
		
        System.out.println("RES: "+res);
        
        // Int to string
        String x = Integer.toString(12345);
        System.out.println(x);
        
        // String to int
        int xx = Integer.parseInt(x);
        System.out.println(xx);
	}
	
}
