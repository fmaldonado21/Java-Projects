package assg6_maldonadof21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMIS {

	
	public static void main(String[] args) {
		ArrayList <Student> stu = new ArrayList<Student>();
		
		Scanner kbd = new Scanner(System.in);
		
		Scanner inputStream = null;
		String fileName = "assg6_data.txt";
		StudentList s1 = new StudentList();
		int choice = 0;
		String id;
		String major;
		String standing;
		String name;
		
		try {
			inputStream = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		s1.loadData(fileName);
		
		while(choice != 8) {
		System.out.println("----Menu Options----");
		System.out.println("1. Display the roster");
		System.out.println("2. Search for a student by id");
		System.out.println("3. Add a new student");
		System.out.println("4. Remove a student");
		System.out.println("5. Search for students by major");
		System.out.println("6. Sort and save to file");
		System.out.println("7. Save to file");
		System.out.println("8. Exit");
		
		System.out.println("Please select an option: ");
		choice = Integer.parseInt(kbd.nextLine());
		
		
		switch(choice) {
		case 1: 
			s1.displayRoster();
			try {
				System.in.read();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			System.out.println("Enter the ID of the Student: ");
			id = kbd.nextLine();
			System.out.println(s1.searchForStudent(id)); 
			System.out.println("Hit Enter to continue: ");
			try {
				System.in.read();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.out.println("Enter id, name, standing, major you want to add: ");
			id = kbd.nextLine();
			name = kbd.nextLine();
			standing = kbd.nextLine();
			major = kbd.nextLine();
			s1.addStudent(id, name, standing, major);
			System.out.println("Hit Enter to continue: ");
			try {
				System.in.read();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 4:
			System.out.println("Enter the Id of the student you want to remove: ");
			id = kbd.nextLine();
			s1.removeStudent(id);
			System.out.println("Hit Enter to continue: ");
			try {
				System.in.read();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 5:
			System.out.println("Enter the major: ");
			major = kbd.nextLine();
			System.out.println(s1.getStudentsbyMajor(major));
			System.out.println("Hit Enter to continue: ");
			break;
		case 6:
			s1.sort();
			s1.Save();
			System.out.println("Hit Enter to continue: ");
			try {
				System.in.read();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 7:
			s1.Save();
			System.out.println("Hit Enter to continue: ");
			try {
				System.in.read();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 8:
			break;
		}
			
	}
	}
}
