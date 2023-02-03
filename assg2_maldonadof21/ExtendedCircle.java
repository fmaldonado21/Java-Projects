package assg2_maldonadof21;

public class ExtendedCircle {
	
	Point center = new Point();
	private double radius;
	private final static double PI = 3.14;
	
	public ExtendedCircle() {
		this.radius = -1;
		center.setX(0);
		center.setY(0);
	}
	
	public ExtendedCircle(double radius) {
		this.radius = radius;
		center.setX(0);
		center.setY(0);
	}
	
	public ExtendedCircle(double radius, Point center) {
		this.radius = radius;
		center.setX(center.getX());
		center.setY(center.getY());
	}
	
	public double getRadius() {
		return radius;
	}
	
	public Point getCenter() {
		return center;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setCenter(int x, int y) {
		center.setX(x);
		center.setY(y);
	}
	
	public double compArea(){
		return PI * radius * radius;
	}
	
	public double compCircumference() {
		return 2 * PI * radius;
	}
	
	public String toString() {
		return "Radius: " + radius + "\nCenter: (" + center.getX() + "," + center.getY() + ")";
		
	}
	
	public int positionToCircle(Point position) {
		if (center.distance(position) ==  radius) {
			return 0;
		}
		else if(center.distance(position) > radius) {
			return 1;
		}
		else {
			return -1;
		}
		
		
	}
	
	
	public ExtendedCircle shift(int xCommand, int yCommand) {
		ExtendedCircle exCircle = new ExtendedCircle(radius);
		exCircle.setCenter(xCommand + this.center.getX(), yCommand + this.center.getY());
		return exCircle;
		
	}
	
	public ExtendedCircle scale(double factor) {
		ExtendedCircle exCircle = new ExtendedCircle(radius * factor, center);
		return exCircle;
	}
	
	public boolean overlap(ExtendedCircle overCircle) {
		if (center.distance(overCircle.getCenter()) == radius + overCircle.getRadius() ) {
			return true;
		}

		return false;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj instanceof ExtendedCircle){
			ExtendedCircle temp = (ExtendedCircle)obj;
			if(temp.center == this.center && temp.radius == this.radius) {
			return true;
			}
		}
		else {
			return false;
		}
		return false;
	}
			
	}
	
	