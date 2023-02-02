package com.ldeepak.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		Student student = new Student("Ranga", 99, 98, 100);
		
		int number = student.getNumberOfMarks();
		System.out.println("Number of marks: "+number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of marks: "+sum);
		
		int maxMarks = student.getMaximumMarks();
		System.out.println("Max marks: "+maxMarks);
		
		int minMarks = student.getMinimumMarks();
		System.out.println("Min marks: "+minMarks);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average marks: "+average);
	
		System.out.println(student);
		
		student.addNewMark(35);
		
		student.removeMarkAtIndex(1);
	}

}
