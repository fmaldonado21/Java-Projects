package activity4;

public class SpecialTopicCourseTest {

	public static void main(String[] args) {

		SpecialTopicCourse s1 = new SpecialTopicCourse("CSCI2540", "Digital Logic", "Computer Science");
		SpecialTopicCourse s2 = new SpecialTopicCourse("CSCI2540", "Linear Algebra", "Computer Science");
		SpecialTopicCourse s3 =  new SpecialTopicCourse("CSCI2540", "Data Abstraction", "Computer Science");
		s2.setTop("CLASS");
		
		System.out.println("Testing get topic " + s2.getTop());
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		s1.printInfo();
		s2.printInfo();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
	}

}


