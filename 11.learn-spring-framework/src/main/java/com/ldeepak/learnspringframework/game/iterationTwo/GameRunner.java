package com.ldeepak.learnspringframework.game.iterationTwo;

// GameRunner class is now loosely coupled.
public class GameRunner {
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
