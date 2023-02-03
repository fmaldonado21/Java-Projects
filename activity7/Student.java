package activity7;

public class Student {
	
	int id;
	String name, major, standing;
	
	
	public void construct(int id, String name, String major, String standing) {
		this.id = id;
		this.name = name;
		this.major = major;
		this.standing = standing;
	}
	
	public String toString() {
		return id + "," + name + "," + major + "," + standing;
		
	}
}
