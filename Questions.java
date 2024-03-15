package testApp;
// this class is used to store questions and answers. It implements QA_Pair

public abstract class Questions {
	
	protected CourseInfo courseInfo;
	protected String body;

	// this constructor is the template for the questions
	public Questions (CourseInfo courseInfo, String body) {
		this.courseInfo = courseInfo;
		this.body = body;
	}

	// this method is used to get the course information
	public CourseInfo getCourseInfo() {
		return courseInfo;
	}

	// this method is used to set the course information
	public void setCourseInfo(CourseInfo courseInfo) {
		this.courseInfo = courseInfo;
	}

	// this method is used to get the question body
	public String getBody() {
		return body;
	}

	// this method is used to set the question body
	public void setBody(String body) {
		this.body = body;
	}
	
	// this method is used to return a string representation of the object
	public String toString() {
		return courseInfo + ":cousre " + body + "\n";
	}
	
}