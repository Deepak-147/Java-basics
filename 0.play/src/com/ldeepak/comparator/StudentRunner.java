package com.ldeepak.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(34, "Ram"));
		students.add(new Student(14, "Shyam"));
		students.add(new Student(92, "Mohan"));
		students.add(new Student(28, "Raju"));
		students.add(new Student(55, "Mohit"));
		
		System.out.println(students);
	
//		Collections.sort(students, new MarksComparator());
		
		Collections.sort(students, new NameComparator());
		
		System.out.println(students);
		
	}

}
