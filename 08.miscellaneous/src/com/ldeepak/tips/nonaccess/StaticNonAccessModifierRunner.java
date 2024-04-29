package com.ldeepak.tips.nonaccess;

class Player {
	private String name;
	// Static variable
	private static int count = 0; // This variable is shared between multiple instances of the player objects
	
	public Player(String name) {
		super();
		setName(name);
		System.out.println("A new player is created");
		setCount(getCount() + 1); // After creating a new player increment the count of players
	}
	
	// Static method
	static public void someStaticMethod() {
//		System.out.println(name); // Inside static method, we cannot access non static variables
		System.out.println("Calling static method");
	}
		
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}
	
}

public class StaticNonAccessModifierRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player player1 = new Player("ronaldo");
		Player player2 = new Player("Federer");
		System.out.println(player1.getCount());
		System.out.println(player2.getCount());
		
		Player.someStaticMethod();
	}

}
