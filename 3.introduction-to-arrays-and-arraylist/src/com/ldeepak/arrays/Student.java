package com.ldeepak.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	//Variable argument marks
	public Student(String name, int... marks) {
		// TODO Auto-generated constructor stub
		this.name=name;
		
		for (int mark:marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int mark:marks) {
			sum+=mark;
		}
		return sum;
	}

	public int getMaximumMarks() {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		for (int mark:marks) {
			if (mark>max) max=mark;
		}
		return max;
	}

	public int getMinimumMarks() {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		for (int mark:marks) {
			if (mark<min) min=mark;
		}
		return min;
	}

	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}
	
}
