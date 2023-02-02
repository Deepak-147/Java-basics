package com.ldeepak.play;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class TestCode {
    
	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<>();
		
		stack.push("hello");
		
		System.out.println(stack.size());
	}

}
