package com.ldeepak.oops_basics;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", 0.34567, "GREEN");
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte)5); 
		fan.switchOff();
		System.out.println(fan);
	}

}
