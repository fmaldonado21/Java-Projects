package assg7_maldonadof21;

import java.util.Stack;
import java.util.*;

public class CalculatorDemo {
	
	Scanner sc = new Scanner(System.in);
	String infix;
	
	static boolean bool = false;
	
	public static void main(String[] args) {
		
		/*
		 * user enters the infix expression then calls the methods to get the postfix expression
		 */
		do {
		Scanner sc = new Scanner(System.in);
		String infx;
		
		System.out.println("Enter infix expression: ");
		infx = sc.nextLine();
		
		Calculator infixExpression = new Calculator(infx);
		
		System.out.println(infixExpression.getPostFix());
		System.out.println(infixExpression.evaluate());
		
		System.out.println("Do You want to continue? ");
		System.out.println("If not press 1: ");
		
		infx = sc.nextLine();
		
		if(infx.equals("1")) {
			System.exit(1);
		
		}
	}
		while(bool != true);
}
}
