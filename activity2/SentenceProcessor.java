package activity2;

import java.util.*;

public class SentenceProcessor {

	public static void main(String[] args) {
		
		String Sentence;
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Enter a sentence or a question. ");
		Sentence = kbd.nextLine().trim();
		
		switch(Sentence.charAt(Sentence.length()-1)) {
				case '?':
					if(Sentence.length() % 2 !=0) {
						System.out.println("That's an odd question.");
					}
					else {
						System.out.println("That's an even question.");
					}
					break;
				
				case '!':
					System.out.println("Wow!");
					break;
				case ',':
					System.out.println("More to come!");
					break;
				default:
					System.out.println("You always say \"" + Sentence + "\"");
					break;
					
		
		}

	}

}
