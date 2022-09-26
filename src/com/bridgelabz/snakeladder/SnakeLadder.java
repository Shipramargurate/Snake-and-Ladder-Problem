package com.bridgelabz.snakeladder;

import java.util.Random;

public class SnakeLadder {
//The Player then checks for a Option. They are No Play,Ladder or Snake.
	public static void main(String[] args) {
		System.out.println("welcome to snake and ladder game program");

		int position = 0;
		System.out.println("position of player 1 is : " + position);

		Random random = new Random(); // creating random object

		int roll = 1 + random.nextInt(6); // 1 to 6
		System.out.println("after rolling dice : " + roll);

		int options = random.nextInt(3); // 0 , 1 and 2
        System.out.println("option : " + options);
		switch (options) { // switch case to chcek the position
		case 0:
			System.out.println("ladder i.e. move ahead...!!");
			position += roll; // add position in roll
			break;
		case 1:
			System.out.println("snake i.e please move back...!!");
			position -= roll; // Subtract positin from roll
			if (position < 0) // position of player should always greater than or equal to 0
				position = 0;
			break;
		default:
			System.out.println("safer side...!!");

		}
		System.out.println("position of single player is = " + position);
	}
}
