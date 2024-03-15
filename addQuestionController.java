package javaFxControllers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import testApp.CourseInfo;
import testApp.FillQuestion;
import testApp.MxQuestion;
import testApp.ShortQuestion;
import testApp.TorFQuestion;

public class addQuestionController {

	@FXML
	private Button addQuestionButton;
	@FXML
	private Button returnToQuestionList;
	@FXML
	private ComboBox<String> courseList;
	@FXML
	private ComboBox<String> questionType;
	@FXML
	private TextField question;
	@FXML
	private TextField optionA;
	@FXML
	private TextField optionB;
	@FXML
	private TextField optionC;
	@FXML
	private TextField optionD;
	@FXML
	private CheckBox answerA;
    @FXML
    private CheckBox answerB;
    @FXML
    private CheckBox answerC;
    @FXML
    private CheckBox answerD;
    
	
	
	public void start (Stage stage) throws Exception{
        Main.loader("addQuestion.fxml");
	}
	
	public void returnToQuestionList(ActionEvent event) {
		Main.loader("questionList.fxml");
	}
	
	// initializes the courseList ComboBox
	public void initialize() {
		courseList.setItems(getPrograms());
		questionType.setItems(FXCollections.observableArrayList("Multiple Choice", "True/False", "Fill in the Blank", "Short Answer"));
	}
	
	// return a list of unique programs
	public ObservableList<String> getPrograms() {
		ObservableList<String> programs = FXCollections.observableArrayList();
		ObservableList<CourseInfo> courseList = Main.getCourseList().getCourseInfo();
		for (CourseInfo course : courseList) {
			String programName = course.getProgramName();
			if (!programs.contains(programName)) {
				programs.add(programName);
			}
		}
		return programs;
	}
	
	@FXML
	public void addQuestion(ActionEvent event) throws IOException {
		// add multiply choice question to myQuestions;
		if (questionType.getValue().equals("Multiple Choice")) {
			MxQuestion mxQuestion = new MxQuestion(courseList.getValue(), question.getText(), optionA.getText(),
					answerA.isSelected(), optionB.getText(), answerB.isSelected(), optionC.getText(), answerC.isSelected(), optionD.getText(), answerD.isSelected());
			Main.getMyQuestions().addQuestion(mxQuestion);
			writeToFile(mxQuestion.toString());
			returnToQuestionList(event);
		} else if (questionType.getValue().equals("Fill in the Blank")) {
			FillQuestion fillQuestion = new FillQuestion(courseList.getValue(), question.getText(), optionA.getText(), optionB.getText(), optionC.getText(), optionD.getText());
			Main.getMyQuestions().addQuestion(fillQuestion);
			writeToFile(fillQuestion.toString());
			returnToQuestionList(event);
		} else if (questionType.getValue().equals("True/False")) {
			TorFQuestion torfQuestion = new TorFQuestion (courseList.getValue(), question.getText(), optionA.getText(), answerA.isSelected(), optionB.getText(), answerB.isSelected());
			Main.getMyQuestions().addQuestion(torfQuestion);
			writeToFile(torfQuestion.toString());
			returnToQuestionList(event);
		} else if(questionType.getValue().equals("Short Answer")) {
            ShortQuestion shortAnswerQuestion = new ShortQuestion(courseList.getValue(), question.getText(), optionA.getText());
            Main.getMyQuestions().addQuestion(shortAnswerQuestion);
            writeToFile(shortAnswerQuestion.toString());
            returnToQuestionList(event);
        } else if (questionType.getValue() == null) {
        	returnToQuestionList(event);
        }
	}
	


	public void writeToFile(String content) {
		LocalDateTime now = LocalDateTime.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
	    String timestamp = now.format(formatter);
	    String fileName = "Question_" + timestamp + ".txt";
	    String filePath = "C:\\Users\\mikes\\Documents\\ProAssQuestions\\" + fileName;
		    
	    Task<Void> task = new Task<Void>() {
	        @Override
	        protected Void call() throws Exception {
	            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
	                writer.write(content);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            return null;
	        }
	    };
	    new Thread(task).start();
	}

}
