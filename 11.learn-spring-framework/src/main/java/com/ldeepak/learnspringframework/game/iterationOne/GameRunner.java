package com.ldeepak.learnspringframework.game.iterationOne;

// GameRunner class is tightly coupled to a specific game. If we want to change the game, we have to change it here also.
public class GameRunner {
//	private MarioGame game;
	
//	public GameRunner(MarioGame game) {
//		this.game = game;
//	}
	
	private SuperContraGame game;
	
	public GameRunner(SuperContraGame game) {
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
