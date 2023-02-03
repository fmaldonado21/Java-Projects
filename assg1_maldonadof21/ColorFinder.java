package assg1_maldonadof21;

import java.util.*;

public class ColorFinder {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		
		boolean trigger = false;
		boolean trigger2 = false;
		String sentence;
		String[] addPrime = {"red", "green", "blue"};
		String[] subPrime = {"magenta", "cyan", "yellow"};
		
		System.out.println("Enter a sentence: ");
		sentence = kbd.nextLine();
		sentence = sentence.toLowerCase();
		
		kbd.close();
		
		for(int i = 0; i < addPrime.length; i++) {
			if(sentence.contains(addPrime[i])) {
				trigger = true;
			}
			else if(sentence.contains(subPrime[i])) {
				trigger2 = true;
			}
			else if(sentence.contains(subPrime[i]) && sentence.contains(addPrime[i])) {
				trigger = true;
			}
		}
		
		if(trigger) {
			System.out.println("Additive primary color found");
		}
		else if(trigger2) {
			System.out.println("Subtractive primary color found");
		}
		else {
			System.out.println("No Primary colors found");
		}
	}

}
