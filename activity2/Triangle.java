package activity2;

import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		int size;
		Scanner kbd  = new Scanner(System.in);
		
		System.out.println("Enter the size of the triangle: ");
		size = kbd.nextInt();
		
		kbd.close();
		
		printTriangle(size);
	}
	
	public static void printLine(int length) {
		for(int i = 0; i < length; i++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}
	
	public static void printTriangle(int size) {
		for(int i = 0; i < size; i++) {
			printLine(i);
		}
		
		for(int j = size; j > 0; j--) {
			printLine(j);
		}
	}



	}

