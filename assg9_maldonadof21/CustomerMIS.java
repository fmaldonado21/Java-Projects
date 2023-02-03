package assg9_maldonadof21;

import java.util.*;
import java.io.*;

public class CustomerMIS {
	
	/*
	 * 
	 * This is the main method that runs the program
	 */
	public static void main(String[] args) {
		String filename = "assg9_CustomerRoster.txt", id, name, pNumber;
		CustomerRoster custom = new CustomerRoster();
		int choice = 0;
		Scanner kbd = new Scanner(System.in);
		
		custom.loadData(filename);
		
		while(choice != 6) {
			System.out.println("1. Display the roster");
			System.out.println("2. Add a customer");
			System.out.println("3. Delete a customer");
			System.out.println("4. Search for customer");
			System.out.println("5. Update the info of a customer");
			System.out.println("6. Save and exit");
			
			System.out.println("Please select an option: ");
			choice = Integer.parseInt(kbd.next());
			
			switch(choice) {
			case 1:
				custom.DisplayRoster();
				System.out.println("Hit Enter to continue: ");
				try {
					System.in.read();
				}
				catch(IOException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Enter the id of the Customer: ");
				id = kbd.next();
				System.out.println("Enter the name of the customer: ");
				name = kbd.next();
				System.out.println("Enter the phone number of the customer: ");
				pNumber = kbd.next();
				custom.addCustomer(id, name, pNumber);
				System.out.println("Hit Enter to Continue: ");
				try {
					System.in.read();
				}
				catch(IOException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Enter the id of the customer you want to delete: ");
				id = kbd.next();
				custom.deleteCustomer(id);
				System.out.println("Hit Enter to continue: ");
				try {
					System.in.read();
				}
				catch(IOException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Enter the id of the customer you want to search for: ");
				id = kbd.next();
				Customer foundCustomer = custom.searchForCustomer(id);
				if(foundCustomer == null) {
					System.out.println("Customer Not Found!");
				}
				else {
					System.out.println(foundCustomer.getName() + "\t" + foundCustomer.getpNumber());
				}
				System.out.println("Hit Enter to continue: ");
				try {
					System.in.read();
				}
				catch(IOException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				System.out.println("Enter the id of the customer you want to update: ");
				id = kbd.next();
				custom.updateCustomer(id);
				System.out.println("Hit Enter to continue: ");
				try {
					System.in.read();
				}
				catch(IOException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				System.out.println("Saving your file and exiting");
				custom.Save();
				return;
			}
		}
		kbd.close();
	}
	
	
}
