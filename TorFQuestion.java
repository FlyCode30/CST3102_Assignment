package testApp;

public class TorFQuestion extends Questions{
	
	protected final String optionA = "True";
	protected Boolean answerA;
	protected final String optionB = "False";
	protected Boolean answerB;
	
	// this is the constructor for the TorFQuestions class. It adds on options B to the questions
	public TorFQuestion(CourseInfo courseInfo, String body, String optionA, Boolean answerA, String optionB,
			Boolean answerB) {
		super(courseInfo, body);
		this.answerA = answerA;
		this.answerB = answerB;
	}

	// this method is used to get option A
	public String getOptionA() {
		return optionA;
	}
	
	// this method is used to get answer A
	public Boolean getAnswerA() {
		return answerA;
	}
	
	// this method is used to set answer A. If answer B is true, answer A is false
	public void setAnswerA(Boolean answerA) {
		if (answerB == true) {
			this.answerA = false;
		} else {
			this.answerA = answerA;
		}
	}
	
	public String getOptionB() {
		return optionB;
	}
	
	
	public Boolean getAnswerB() {
		return answerB;
	}
	
	public void setAnswerB(Boolean answerB) {
			if (answerA == true) {
            this.answerB = false;
        } else {
            this.answerB = answerB;
        }
	}
	
}
