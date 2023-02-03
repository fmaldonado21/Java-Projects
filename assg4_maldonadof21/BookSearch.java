package assg4_maldonadof21;

import java.io.*;
import java.util.*;

public class BookSearch {

	public static void main(String[] args) throws BookIdAlreadyExistException{
		
		Scanner inputStream = null;
		String filename1 = "assg4_catalog.txt";
		Book Books[];
		String Line;
		String inquiry = " ";
		Books = new Book[6];
		int sum = 0;
		int bookSum = 0;
		
		try {
			inputStream = new Scanner(new File(filename1));
		}
		
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		while(inputStream.hasNextLine()) {
			Line = inputStream.next();	
			try {
				for(int i = 0; i < sum; i++) {
					if(Line.equals(Books[i].getbookId())) {
						throw new BookIdAlreadyExistException();
					}
					
				}
			
			}
			
			catch(BookIdAlreadyExistException e) {
				System.out.println("Book already Exists");
				inputStream.nextLine();
				continue;
			
			}
			
			Books[sum] = new Book(Line, inputStream.next(), inputStream.next(), inputStream.next(), inputStream.next().charAt(0));
			System.out.println(Books[sum].toString());
			sum++;
			
		}
		System.out.println("total books: " + sum);
		
		inputStream.close();
		
		Scanner kbd = new Scanner(System.in);
		
		while(inquiry.equals("STOP") == false) {
			System.out.println("Enter a Book ID: ");
			inquiry = kbd.nextLine();
			
			try {
				bookSum = Book.bookSearch(Books, sum, inquiry);
				System.out.println(Books[bookSum].toString());
			}
			catch(BookNotFoundException e) {
				if(inquiry.equals("STOP")) {
					continue;
				}
				System.out.println(e.getMessage());
				continue;
			}
		}
		kbd.close();
	}
}
