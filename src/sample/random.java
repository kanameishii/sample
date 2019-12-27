package sample;

import java.util.Random;
import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("----Random NUmber game----");
		int randomNumber = rand.nextInt(100) + 1;
		int guess;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter guess number " + i + ":");
			guess = input.nextInt();
			if (guess == randomNumber) {
				System.out.println("Bingo");
				System.out.println("the random number was " + randomNumber);
			} else if (guess > randomNumber) {
				System.out.println("too high");
				if (i == 10) {
					System.out.println("game over");
					System.out.println("the random number was " + randomNumber);
				}
			} else if (guess < randomNumber) {
				System.out.println("too low");
				if (i == 10) {
					System.out.println("game over");
					System.out.println("the random number was" + randomNumber);
				}

			}
		}

	}
}
