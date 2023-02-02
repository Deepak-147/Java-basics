package com.ldeepak.generics;

import java.util.ArrayList;

public class MyCustomList<T> {

	ArrayList<T> al = new ArrayList<>();
	
	public void addElement(T value) {
		al.add(value);	
	}
	
	public void removeElement(T value) {
		al.remove(value);
	}

	public T get(int index) {
		return al.get(index);
	}
	
	@Override
	public String toString() {
		return "MyCustomList [al=" + al + "]";
	}
	
}
