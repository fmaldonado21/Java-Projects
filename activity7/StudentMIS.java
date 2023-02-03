package activity7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMIS {

	public static void main(String[] args) {
		Scanner inputStream = null;
		String fileName = "assg6_data.txt";
		StudentList s1 = new StudentList();
		
		try {
			inputStream = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		s1.loadData(fileName);
		s1.displayRoster();
	}

}
