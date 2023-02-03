package activity13;

import java.util.*;
import java.io.*;

public class Airport {

	public static void main(String[] args) {
		
		Scanner in = null, kbd = new Scanner(System.in);
		String file = "activity13_input.txt";
		String code, city;
		HashMap<String, String> allAirports = new HashMap<String, String>();
		int choice = 0;
		
		try {
			in = new Scanner(new File(file));
		}
		catch(FileNotFoundException e){
			System.out.println("File not found!");
		}
		
		while(choice != 4) {
			System.out.println("1. Display all the airports/cities");
			System.out.println("2. Add a new airport");
			System.out.println("3. Search for an airport");
			System.out.println("4. Exit");
			
			switch(choice) {
			case 1:
				System.out.println(allAirports);
				break;
			case 2:
				System.out.println("Enter an airport code you want to add: ");
				code = kbd.nextLine();
				System.out.println("Please enter the city the airport is in: ");
				city = kbd.nextLine();
				allAirports.put(code, city);
			case 3:
				System.out.println("Enter the airport code: ");
				code = kbd.nextLine();
				System.out.println(allAirports.get(code));
				break;
			case 4:
				return;
			
			}
		}

	}

}
