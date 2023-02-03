package assg9_maldonadof21;

import java.util.*;
import java.io.*;

public class CustomerRoster {
	
	private BinarySearchTree<Customer, String> CustomerList;
	public static final String filename = "assg9_CustomerRoster.txt";
	
	public CustomerRoster() {
		CustomerList = new BinarySearchTree<Customer, String>();
	}
	
	/**
	 * Displays the customer list
	 */
	public void DisplayRoster () {
		TreeIterator<Customer> treeit = new TreeIterator<Customer>(CustomerList);
		treeit.setInorder();
		
		while(treeit.hasNext()) {
			System.out.println(treeit.next().toString());
		}

	}
	
	/**
	 * loads the data of the filename
	 * @param filename
	 */
	public void loadData(String filename) {
		Scanner input = null;
		
		try {
			input = new Scanner(new File(filename));
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
			while(input.hasNextLine()) {
				StringTokenizer st = new StringTokenizer(input.nextLine(), "\t");
				Customer cus = new Customer(st.nextToken(), st.nextToken(), st.nextToken());
				CustomerList.insert(cus);
			}
	}
	
	/**
	 * searches for the customer using the id
	 * @param id
	 * @return
	 */
	public Customer searchForCustomer(String id) {
		return CustomerList.retrieve(id);
	}
	
	/**
	 * saves the file
	 */
	public void Save() {
		TreeIterator<Customer> cus = new TreeIterator<Customer>(CustomerList);
		
		PrintWriter outfile = null;
		
		try {
			outfile = new PrintWriter("assg9_CustomerRoster.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		while(cus.hasNext()) {
			outfile.println(cus.next());
		}
		
		outfile.close();
	}
	
	/**
	 * adds a Customer using the id, name and phone number of the new customer
	 * @param id
	 * @param name
	 * @param pNumber
	 * @return
	 */
	public boolean addCustomer(String id, String name, String pNumber) {
		Customer newCus = new Customer(id, name, pNumber);
		TreeIterator<Customer> ti = new TreeIterator<>(CustomerList);
		
		while(ti.hasNext()) {
			Customer cus = ti.next();
			if(cus.getKey().equals(newCus.getKey())) {
				System.out.println("Customer ID Already Exist!");
				return false;
			}
		}
		
		CustomerList.insert(newCus);
		return true;
	}
	
	/**
	 * deletes a customer using the id
	 * @param id
	 * @return
	 */
	public boolean deleteCustomer(String id) {
		try {
			CustomerList.delete(id);
			return true;
		}
		catch(TreeException e) {
			System.out.println(e.getMessage());
			return false;
		}
		
	}
	
	/**
	 * updates the customer information
	 * @param id
	 * @return
	 */
	public boolean updateCustomer(String id) {
		Customer Cus = CustomerList.retrieve(id);
		if(Cus.equals(null)) {
			System.out.println("Customer not found!");
		}
		
		Scanner kbd = new Scanner(System.in);
		System.out.println("Do you want to update name or number?");
		int choice = Integer.parseInt(kbd.next());
		
		switch(choice) {
		case 1:
			System.out.println("Enter a new name: ");
			String name = kbd.next();
			Cus.setName(name);
			kbd.close();
			return true;
		case 2:
			System.out.println("Enter a new number:");
			String number = kbd.next();
			Cus.setpNumber(number);
			kbd.close();
			return true;
		}
		
		kbd.close();
		return false;
			
	}
	
	
}
