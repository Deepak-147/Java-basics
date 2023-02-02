package com.ldeepak.abstraction.interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("Goes into hole");
	}

	@Override
	public void left() {
		System.out.println("Go backwards");
	}

	@Override
	public void right() {
		System.out.println("Go forwards");
	}

}
