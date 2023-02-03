package activity4;

import assg2_maldonadof21.Point;

public class SpecialTopicCourse extends Course{
	String topic;
	Course course;
	public SpecialTopicCourse(String courseNo, String title, String newTopic) {
		super(courseNo, title);
		topic = newTopic;
		
	}
	
	public SpecialTopicCourse(String courseNo, String title, int credit, String newTopic) {
		super(courseNo, title, credit);
		topic = newTopic;
	}
	public String getTop() {
		return this.topic;
	}
	
	public void setTop(String newTop) {
		this.topic = newTop;
	}
	
	public String toString() {
		return "(" + this.topic + "," + this.credit + ")";
 	}
	
	public boolean equals(Object csci) {
		if(csci == null) {
			return false;
		}
		if(csci instanceof SpecialTopicCourse){
			SpecialTopicCourse temp = (SpecialTopicCourse)csci;
			if(temp.topic == this.topic && temp.courseNo == this.courseNo) {
			return true;
			}
		}
		else {
			return false;
		}
		return false;
	}

	
	public void printInformation(String course, String title) {
		System.out.println("courseNo" + this.getCourseNo() + "," + this.getTitle());
	}
	
	
	
	
	
	
	
}