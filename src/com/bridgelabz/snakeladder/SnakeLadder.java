package com.bridgelabz.snakeladder;

import java.util.Random;

public class SnakeLadder {
//The Player rolls the die to get a number between 1 to 6.
	public static void main(String[] args) {
		System.out.println("welcome to snake and ladder game program");
		int position = 0; 
		System.out.println("position of player 1 is : " + position);
		Random random = new Random(); //creating random object
		int roll = 1 + random.nextInt(6); // 1 to 6
		System.out.println("after rolling dice : " + roll);
	}

}
