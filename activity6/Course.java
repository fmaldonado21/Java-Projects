package activity6;

public class Course {

			
			private int credit;
			private String courseNo;
			private String title;
			
			public Course(String courseNo, String title) {
				this.courseNo = courseNo;
				this.title = title;
				credit = 0;
			}	
			public Course(String givencourseNo, String givenTitle, int givenCredit) {
				credit = givenCredit;
				courseNo = givencourseNo;
				title = givenTitle;
			}
			
			public int getCredit() {
				return this.credit;
			}
			
			public String getTitle() {
				return this.title;
			}
			public String getCourseNo() {
				return this.courseNo;
			}
			
			public void setCredit(int newCredit) {
				this.credit = newCredit;
			}
			
			public void setCourseNo(String newCourseNo) {
				this.courseNo = newCourseNo;
			}
			
			public void setTitle(String newTitle) {
				this.title = newTitle;
			}
			
			public String toString() {
				return this.courseNo + " - " + this.title + "(" + credit + ")";
			}
			
			public void printInfo() {
				System.out.println(this.courseNo + " - " + this.title);
			}

		
	}



