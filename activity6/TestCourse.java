package activity6;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCourse {
	
	private Course c1;
	private Course c2;
	
	public void setUp() throws Exception{
		try {
			c1 = new Course("CSCI 1010", "Algorithmic Problem Solving");
			c2 = new Course("CSCI 2405", "Discrete Structures", 4);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(1);
		}
	}
	
	public void testTwoParameConstructor() {
		assertEquals("Course Credit: ", 3, c1.getCredit());
		assertEquals("Course Number: ", "CSCI 1010", c1.getCourseNo());
		assertEquals("Course Title: ", "Algorithmic Problem Solving", c1.getTitle());
	}
	
	public void testThreeParamConstructor() {
		assertEquals("Course Credit: ", 3, c2.getCredit());
		assertEquals("Course Number: ", "CSCI 2530", c2.getCourseNo());
		assertEquals("Course Title: ", "Abstract Data Structures", c2.getTitle());
	}
	
	public void testSetCredit() {
		c1.setCredit(3);
		assertEquals("Course Credit: ", 3, c1.getCredit());
		c2.setCredit(3);
		assertEquals("Course Credit: ", 3, c2.getCredit());
	}
	
	public void testToString() {
		String c1Expected = c1.getCourseNo() + " - " + c1.getTitle() + "(" + c1.getCredit() + ")";
		String c2Expected = c2.getCourseNo() + " - " + c2.getTitle() + "(" + c2.getCredit() + ")";
		assertEquals("course1:", c1Expected, c1.toString());
		assertEquals("course2:", c2Expected, c2.toString());
	}

	
}