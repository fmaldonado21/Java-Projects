package activity6;

import java.util.*;

public class RecursionPractice {
	
	private static int index = 0;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String string;
		char letter;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		string = sc.nextLine();
		System.out.println("Enter a character: ");
		letter = sc.nextLine().charAt(0);
		
		System.out.println("Index of First Occurance: " + SearchFirst(letter, string));
		System.out.println("Index of Last Occurance: " + SearchLast(letter, string));
		
		
	}
	
	public static int SearchFirst(char letter, String string) {
		if(string.charAt(0) == letter){
			index++;
			return index;
		}
		else if (string.isEmpty()) {
			return -1;
		}
		else {
			index++;
			return SearchFirst(letter, string.substring(letter));
		}
	}
	
	public static int SearchLast(char letter, String string) {
		if(string.charAt(string.length() - 1) == letter) {
			index--;
			return index;
		}
		else if(string.isEmpty()) {
			return -1;
		}
		else {
			index--;
			return SearchLast(letter, string.substring(0, string.length() - 1));
		}
	}

}
