package com.ldeepak.play;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public void solve(int nums[]) {
		List<List<Integer>> res = new ArrayList<>(); // resultant powerset
	    res.add(new ArrayList<>());
	    
	    List<Integer> currentSet = res.get(0);
	    
//	    for (int n : nums) {
//	        int currentSize = res.size();
//
//	        // For each set in res, add the current number. This creates a new set. Add this new set to the res
//	        for (int i=0; i<currentSize; i++) {
//	            List<Integer> currentSet = res.get(i);
//	            currentSet.add(n);
//	            res.add(currentSet);
//	        }
//	    }
	    
	    System.out.println(res.toString());
	    System.out.println(currentSet.toString());
	    currentSet.add(1);
	    System.out.println(currentSet.toString());
	    System.out.println(res.toString());
//	    res.add(currentSet);
//	    System.out.println(res.toString());
	}
}

public class TestCode2 {
	
	public static void main(String[] args) {
		int nums[] = {1,2,3};
			
		Solution sol = new Solution();
		sol.solve(nums);
	}
}