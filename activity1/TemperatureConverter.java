package activity1;

import java.util.Scanner;

public class TemperatureConverter {
	
	public static void main(String[] arg) {
		int fahrenheit;
		double celsius;
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Please enter a temperature in Fahrenheit: ");
		fahrenheit = kbd.nextInt();
		
		celsius = (double) (fahrenheit - 32) * 5 / 9;
		
		System.out.println("The temperature in celsius is: " + celsius);
		
	}

}
