package activity3;

public class CourseTest {

	public static void main(String[] args) {
		
		Course c1 = new Course("CSCI 2540", "Advanced Data Structures");
		Course c2 = new Course("CSCI 2410", "Digital Logic Design", 4);
		
		System.out.println("Testing toString method:");
		System.out.println(c1.toString());
		System.out.println(c2.toString() + "\n");
		
		c1.setTitle("Changed title using set method");
		c1.setCredit(10);
		
		System.out.println("Testing setters and getters: ");
		System.out.println("Testing setTitle and setCredit on course 1\n");
		System.out.println(c1.getCourseNo());
		System.out.println(c1.getTitle());
		System.out.println(c1.getCredit() + "\n");
		
		System.out.println("Testing printInfo method");
		c1.printInfo();
		c2.printInfo();

	}

}
