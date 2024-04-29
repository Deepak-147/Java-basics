package com.ldeepak.learnspringframework;

import com.ldeepak.learnspringframework.game.iterationTwo.GameRunner;
import com.ldeepak.learnspringframework.game.iterationTwo.MarioGame;
import com.ldeepak.learnspringframework.game.iterationTwo.SuperContraGame;

// Loose coupling + Interfaces
public class GamingAppIterationTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		var game = new MarioGame(); // Simply change the game here. No changes required in GameRunner.
		
		var game = new SuperContraGame();
		
		// Game is a dependency of GameRunner. GameRunner depends on Game
		var gameRunner = new GameRunner(game); // Wiring of dependency
		
		gameRunner.run();

	}

}
