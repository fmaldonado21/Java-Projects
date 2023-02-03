package assg1_maldonadof21;

import java.util.*;

public class NumbersGame {

	public static void main(String[] args) {
		
		int secret;
		int guess = 0;
		int numofTries = 0;
		
		Random generator = new Random();
		secret = generator.nextInt(100);
		Scanner kbd = new Scanner (System.in);
		
		System.out.println("Guess a number: ");
		
		while (guess != secret)
		{
			guess = kbd.nextInt();
			if (guess < secret) {
				System.out.println("The number is higher than " + guess + " guess again");
			}
			else if (guess > secret) {
				System.out.println("The number is lower than " + guess + " guess again");
			}
			numofTries++;
		}

	
	

	System.out.println("Correct!");
	System.out.println("It took you " + numofTries + " guesses to guess the number!");

	}
}
