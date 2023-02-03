package assg5_maldonadof21;

import java.util.*;

public class StringReplaceRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String opt;
		int option = 0;
		String str;
		char oldChar, newChar;
		
		while(option != 3) {
			System.out.println("1: Test Replace Method");
			System.out.println("2. Test replaceAll Method");
			System.out.println("3. Exit");
			opt = sc.nextLine();
			option = Integer.parseInt(opt);
			
			if(option == 3) {
				return;
			}
			
			System.out.println("Enter a word: ");
			str = sc.nextLine();
			System.out.println("Enter a character you want to replace:");
			oldChar = sc.nextLine().charAt(0);
			System.out.println("Enter a character you want to replace it with: ");
			newChar = sc.nextLine().charAt(0);
			
			if (option == 1) {
				System.out.println(replace(str, newChar, oldChar));
			} 
			else if (option == 2) {
				System.out.println(replaceAll(str, newChar, oldChar));
			}
			
		}
		
		sc.close();
	
	}
	
	/**
	 * 
	 * @param str
	 * @param newChar
	 * @param oldChar
	 * @return
	 */
	private static String replace(String str, char newChar, char oldChar) {
		if(str.length() == 0) {
		return str;
		}
		if(str.charAt(0) == oldChar) {
			return newChar + str.substring(1);
		}
		
		else {
			return str.charAt(0) + replace(str.substring(1), oldChar, newChar);
		}
		
		

	}
	
	/**
	 * 
	 * @param str
	 * @param newChar
	 * @param oldChar
	 * @return
	 */
	private static String replaceAll(String str, char newChar, char oldChar) {
		if(str.length() == 0) {
			return str;
		}
		char start = str.charAt(0);
		if(start == oldChar) {
			start = newChar;
			
			return start + replaceAll(str.substring(1), oldChar, newChar);
		}
		return start + replaceAll(str.substring(1), oldChar, newChar);
	}
}
