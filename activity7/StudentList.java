package activity7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList implements StudentListInterface{

	public static final String filename = "assg6_data.txt";
	
	
	public void loadData(String filename) {
		Scanner input = null;
	
		try {
		input = new Scanner(new File(filename));
	}
	catch(FileNotFoundException e) {
		System.out.println(e.getMessage());
		System.exit(1);
	}
	}
	public void displayRoster() {
		ArrayList <String> studentList = new ArrayList <String>();
		
		System.out.println("Get the list using the get method");
		
		for(int i = 0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
	}
	}
}


