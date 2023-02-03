package assg2_maldonadof21;

import java.util.zip.CRC32;

public class ExtendedCircleTest {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point(1,7);
		Point p3 = new Point(5,9);
		Point p4 = new Point(5,9);
		Point p5= new Point(400, 400);
		Point p6 = new Point();
		Point p7 = new Point(1,0);
		Point p8 = new Point();
		
		System.out.println("Testing get x and y for point 1 (1,7): "+p1.getX() + p1.getY());
		p1.setX(2);
		p1.setY(9);
		System.out.println("Testing set methods and toString : "+ p1.toString());
		System.out.println("Testing distance: "+ p1.distance(p4));
		System.out.println("Testing equals false: "+ p1.equals(p4));
		System.out.println("Testing equals true: " +p3.equals(p4));
		
		
		ExtendedCircle c1 = new ExtendedCircle();
		ExtendedCircle c2 = new ExtendedCircle(4.0);
		ExtendedCircle c3 = new ExtendedCircle(5.0, p3);
		ExtendedCircle c6 = new ExtendedCircle(100);
		ExtendedCircle c7 = new ExtendedCircle (1, p5);
		ExtendedCircle c8 = new ExtendedCircle();
		ExtendedCircle c9=  new ExtendedCircle();
		
		System.out.println("Testing get radius and point: " + c2.getRadius()+" "+ c2.getCenter());
		c2.setCenter(0, 0);
		c2.setRadius(13);
		System.out.println("Testing set center and radius and toString\n"+ c2.toString());
		System.out.println("Testing comp area: " +c2.compArea());
		System.out.println("Testing comp circumference: " +c2.compCircumference());
		ExtendedCircle c4 = c3.shift(12, 12);
		System.out.println("testing shift: "+ c4.toString());
		ExtendedCircle c5 = c3.scale(12);
		System.out.println("testing scale: "+ c4.toString());
		System.out.println("testing overlap false: " + c6.overlap(c1));
		System.out.println("testing overlap true: " + c1.overlap(c7));
		System.out.println("Testing equals true: " + c8.equals(c9));
		System.out.println("Testing equals false: " + c1.equals(c7));
		System.out.println("Testing position to circle -1: " + c1.positionToCircle(p6));
		System.out.println("Testing position to circle 0: " + c1.positionToCircle(p7));
		System.out.println("Testing position to circle 1: " + c8.positionToCircle(p5));
		
		
		
		
		

		
		
		

	}

}
