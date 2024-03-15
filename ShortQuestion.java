package testApp;

public class ShortQuestion extends Questions{

	// this class extends the Questions class. It only has one additional field, which is answer A
	protected String answerA;
	
	// this is the constructor for the ShortQuestions class. It consists of answer A but no options
	public ShortQuestion(String courseInfo, String body, String answerA) {
		super(courseInfo, body);
		this.answerA = answerA;
	}
	
	// this method is used to get answer A
	public String getAnswerA() {
		return answerA;
	}
	
	// this method is used to set answer A
	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}
	
}
