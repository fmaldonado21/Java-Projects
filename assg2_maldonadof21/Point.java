package assg2_maldonadof21;

public class Point {
	
	private int x = 0;
	private int y = 0;
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	public Point (int a, int b) {
		x = a;
		y = b;	
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int a) {
		x = a;
	}
	
	public void setY(int b) {
		y = b;
	}
	
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	public double distance(Point newPoint) {
		return Math.sqrt((x - newPoint.x) * (x - newPoint.x)) + ((y - newPoint.y) * (y - newPoint.y));

	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj instanceof Point){
			Point temp = (Point)obj;
			if(temp.x == this.x && temp.y == this.y) {
			return true;
			}
		}
		else {
			return false;
		}
		return false;
	}

}

