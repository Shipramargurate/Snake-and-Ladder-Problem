package com.bridgelabz.snakeladder;

import java.util.Random;

public class SnakeLadder {
//Report the number of times the dice was played to win the game and also the position after every die role
	static final int winningPosition = 100;

	public static void main(String[] args) {
		System.out.println("welcome to snake and ladder game program");

		int position = 0;
		int rollingCount= 0;
		System.out.println("position of player 1 is : " + position);

		Random random = new Random(); // creating random object

		while (position < winningPosition) { // repeating till user win
			int options = random.nextInt(3); // 0 , 1 and 2
			System.out.println("option : " + options);

			switch (options) { // switch case to check the position
			case 0:
				int roll = 1 + random.nextInt(6); // 1 to 6
				System.out.println("after rolling dice : " + roll);
				System.out.println("ladder i.e. move ahead...!!");
				if (position + roll <= 100) // taking roll position equal to and smaller than 100 so that it will not go
											// above
					position += roll; // add position in roll
				break;
			case 1:
				int roll1 = 1 + random.nextInt(6); // 1 to 6
				System.out.println("after rolling dice : " + roll1);
				System.out.println("snake i.e please move back...!!");
				if (position <= 0) // position of player should always greater than or equal to 0
					position -= roll1; // Subtract position from roll
				break;
			default:
				System.out.println("safer side...!!");
			}
			rollingCount++; // number of time dice rolled to win the game

			System.out.println("position of single player is = " + position);
		}
		System.out.println(" Number of roles to win: " + rollingCount);
	}

}