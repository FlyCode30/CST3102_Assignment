package testApp;

public class FillQuestion extends Questions{

	
	protected String answerA;
	protected String answerB;
	protected String answerC;
	protected String answerD;
	
	// this is the constructor for the FillQuestions class. it consists of answers A, B, C, and D but no options
	public FillQuestion(String courseInfo, String body, String answerA, String answerB, String answerC,
			String answerD) {
		super(courseInfo, body);
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
	}

	public String getAnswerA() {
		return answerA;
	}
	
	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}
	
	public String getAnswerB() {
		return answerB;
	}
	
	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}
	
	
	public String getAnswerC() {
		return answerC;
	}
	
	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}
	
	
	public String getAnswerD() {
		return answerD;
	}
	
	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}
}
