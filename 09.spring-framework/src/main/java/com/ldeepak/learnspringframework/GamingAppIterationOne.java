package com.ldeepak.learnspringframework;

import com.ldeepak.learnspringframework.game.iterationOne.GameRunner;
import com.ldeepak.learnspringframework.game.iterationOne.MarioGame;
import com.ldeepak.learnspringframework.game.iterationOne.SuperContraGame;

// Tight coupling
public class GamingAppIterationOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		var marioGame = new MarioGame(); // Simply changing the game here won't work. We have to make changes to GameRunner class as well
		
		var superContraGame = new SuperContraGame();
		
		// Game is a dependency of GameRunner. GameRunner depends on Game
		var gameRunner = new GameRunner(superContraGame); // Wiring of dependency
		
		gameRunner.run();

	}

}
