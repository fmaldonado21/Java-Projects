package activity5;

import java.util.*;
import java.io.*;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number;
		double sqrt;
		
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		sqrt = compSqrt(number);
		
		System.out.println("The square root is: " + sqrt);
		sc.close();
		
	}
		public static double compSqrt(int number) {
			try {
				if (number <= -1) {
					throw new NegativeNumberException("ERROR: Number must be positive");
				}
		} catch(NegativeNumberException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
			return Math.sqrt(number);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}	
		
		
		
		

