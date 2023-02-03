package assg5_maldonadof21;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestExtendedCircle {
	
	private ExtendedCircle c1, c2, c3;
	private Point p1;
	static double max = .00001;

	@Before
	public void setUp() throws Exception {
		try {
			c1 = new ExtendedCircle();
			c2 = new ExtendedCircle(4.5);
			c3 = new ExtendedCircle(2.1, p1);
			p1 = new Point();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}
		
	public void testDefaultConstruct() {
		assertEquals("Radius: ", 0.0, c1.getRadius(), max);
		assertEquals("Center: ", p1, c1.getCenter());
	}
	
	public void testparameterConstruct() {
		assertEquals("Radius: ", 4.5, c2.getRadius(), max);
		assertEquals("Center: ", p1, c2.getCenter());
	}
	
	public void testTwoParamConstruct() {
		assertEquals("Radius: ", 2.1, c3.getRadius(), max);
		assertEquals("Center: ", p1, c3.getCenter());
	}
	
	public void testGetRadius() {
		assertEquals(1, c1.getRadius(), max);
	}
	
	public void testSetRadius() {
		c1.setRadius(5);
		assertEquals(5, c1.getRadius(), max);
	}
	
	public void testGetcenX() {
		assertEquals(0, c1.getCenter());
	}
	
	public void testSetcenX() {
		c1.setCenter(9, 0);
		assertEquals(9, c1.getCenter());
	}
	
	public void testGetcenY() {
		assertEquals(0, c1.getCenter());
	}
	
	public void testSetcenY() {
		c1.setCenter(3, 0);
		assertEquals(3, c1.getCenter());
	}
	
	public void testEquals() {
		ExtendedCircle leav = c1;
		
		assertTrue(c1.equals(leav));
		assertFalse(c2.equals(c1));
	}
	
	public void testcompCircum() {
		assertEquals(8.12, c1.compCircumference(), max);
	}
	
	public void testpositionToCircle() {
		assertEquals(-1, c1.positionToCircle(p1));
		assertEquals(0, c1.positionToCircle(p1));
		assertEquals(1, c1.positionToCircle(p1));
	}
	
	public void testToString() {
		String p1format = p1.toString();
		assertEquals("p1: ", p1format, p1.toString());
	}
	
	

	
	

}
