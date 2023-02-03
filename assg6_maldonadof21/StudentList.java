package assg6_maldonadof21;

import java.util.*;
import java.io.*;

public class StudentList implements StudentListInterface{

	private ArrayList<Student> studentList;
	public static final String filename = "assg6_data.txt";
	
	
	public StudentList() {
		studentList = new ArrayList<Student>();
	}
	
	/*
	 * loads the data
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
			StringTokenizer st = new StringTokenizer(input.nextLine(), ",");
			Student stu = new Student(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
			studentList.add(stu);
		}
		
	}
	/*
	 * This method displays the roster
	 */
	public void displayRoster() {
		
		for(int i = 0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
	}
		}
	/*
	 * This method searches for student
	 */
	public Student searchForStudent(String id) {
		
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getId().equals(id)) {
				return studentList.get(i);
			}
		}
		
		System.out.println("That student doesn't exist: ");
		return null;
	}
	
	/*
	 * This method add a student
	 */
	@Override
	public boolean addStudent(String id, String name, String standing, String major) {
		Student stu = new Student(id, name, standing, major);
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getId().equals(id)){
				System.out.println("Student Already Exist!!");
				return false;
			}
				
		}
		studentList.add(stu);
		return true;
	}
	/*
	 * This method removes a student
	 */
	@Override
	public boolean removeStudent(String id) {
		
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getId().equals(id)) {
				studentList.remove(i);
				return true;
			}
			
		}
		System.out.println("ID Not Found");
		return false;
	}
	/*
	 * This method gets the students by major
	 */
	@Override
	public ArrayList<Student> getStudentsbyMajor(String major) {
		
		ArrayList<Student> stud = new ArrayList<Student>();
		
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getMajor().equals(major)) {
				stud.add(studentList.get(i));
			}
			
			
		}
		
		return stud;
		
	}
	/*
	 * This method sorts
	 */
	@Override
	public void sort() {
		Collections.sort(studentList);
		
	}
	/*
	 * This method saves 
	 */
	@Override
	public void Save() {
		PrintWriter outfile = null;
		
		try {
			outfile = new PrintWriter("assg6_data.txt");
		}
		catch (FileNotFoundException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		for (Student students: this.studentList) {
			outfile.println(students);
		}
		
		outfile.close();
		
				
		
	}


}


