package com.ldeepak.learnspringframework.game.iterationFour;

import org.springframework.stereotype.Component;

@Component
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
