package assg6_maldonadof21;

import java.util.ArrayList;

public interface StudentListInterface {
	
	/**
	 * @param filename
	 */
	public void loadData(String filename);
	
	public void displayRoster();
	/**
	 * @param id
	 */
	public Student searchForStudent(String id);
	/**
	 * @param id
	 * @param name
	 * @param standing
	 * @param major
	 * @return
	 */
	public boolean addStudent(String id, String name, String standing, String major);
	/**
	 * @param id
	 * @return
	 */
	public boolean removeStudent(String id);
	/**
	 * @param major
	 * @return
	 */
	public ArrayList<Student> getStudentsbyMajor(String major);
	public void sort();
	public void Save();
	
		
	
	
}

