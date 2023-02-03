package activity9;

import java.util.Stack;

public class StackPractice {
	

	public static String strRevStack(String str1) {
		
		Stack<Character> revStack = new Stack<>();
		
		for(int i = 0; i < str1.length(); i++) {
			revStack.push(str1.charAt(i));
		}
		
		String newStr = " ";
		for(int i = 0; i < str1.length(); i++) {
			char popValue = revStack.pop();
			newStr = newStr + popValue;
		}
		
		return newStr;
		
	}
	
	public static String strRevIterative(String str1) {
		String newStr = " ";
		for(int i = 0; i < str1.length(); i++) {
			newStr = str1.charAt(i) + newStr;
		}
		return newStr;
	}
	
	public static String strRevRecursive(String str1) {
		if(str1.isEmpty());{
		return str1;
		}
		
		return strRevRecursive(str1.substring(1)) + str1.charAt(0);
		}
	
	public static void main(String[] args) {
		String revString = "Hello";
		
		
		System.out.println("Reverse using stack: " +strRevStack(revString));
		System.out.println("Reverse using loop: " + strRevIterative(revString));
		System.out.println("Reverse using recursion: " + strRevRecursive(revString));
	}
	
	
}
	


