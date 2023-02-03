package assg6_maldonadof21;

public class Student implements Comparable<Student>{
	
	String name, major, standing, id;
	
	
	public Student(String id, String name, String major, String standing) {
		this.id = id;
		this.name = name;
		this.major = major;
		this.standing = standing;
	}
	
	public String toString() {
		return id + "," + name + "," + major + "," + standing;
		
	}
	
	public String getId() {
		return id;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String getStanding() {
		return standing;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public int compareTo(Student obj) {	
		return id.compareTo(obj.id);
	}
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj instanceof Student) {
			Student temp = (Student)obj;
			if(getMajor().equals(temp.getMajor())) {
				return true;
			}
		}
		else {
			return false;
		}
		
		return false;
	}
	
	
	
	
}
