package assg5_maldonadof21;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPoint {
	
	Point p1, p2;
	static double max = .00001;

	@Before
	public void setUp() throws Exception {
		try {
			p1 = new Point();
			p2 = new Point(3, 6);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}

	public void testDefaultConstruct() {
		assertEquals("x: ", 0, p1.getX());
		assertEquals("y: ", 0, p1.getY());
	}
	
	public void testTwoParamConstructor() {
		assertEquals("x: ", 3, p1.getX());
		assertEquals("y: ", 6, p1.getY());
	}
	
	public void testSetX() {
		p1.setX(5);
		assertEquals("New point of x: ", 5, p1.getX());
		p2.setX(8);
		assertEquals("New point of x: ", 8, p2.getX());
	}
	
	public void testSetY() {
		p1.setY(2);
		assertEquals("New point of Y: ", 2, p1.getY());
		p2.setY(4);
		assertEquals("New point of Y: ", 4, p2.getY());
	}
	
	public void testToString(){
		String p1format = p1.toString();
		String p2format = p2.toString();
		assertEquals("p1: ", p1format, p1.toString());
		assertEquals("p2: ", p2format, p2.toString());
		
		}
	
	public void testDistance() {
		assertEquals("Distance: ", 9.13474534, p1.distance(p2), max);
	}
	
	public void testEquals() {
		assertFalse("p1 equals p3: ", p1.equals(p2));
		assertTrue("p1 equqls p1: ", p1.equals(p1));
	}


}
