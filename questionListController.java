package javaFxControllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import testApp.MxQuestion;

import java.awt.Button;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;

public class questionListController extends Application {


	@FXML
	private ListView<String> questionList;

	@FXML
	private Scene scene;
	@FXML
	MxQuestion question = new MxQuestion(null, "What is 2+2?", "2", false, "4", true, "6", false, "8", false);
	@FXML
	private Button addQuestion;

	
	// this event will load the questionPage.fxml


	@Override
	public void start(Stage homeStage) {
	    try {
			Main.loader("questionList.fxml");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void addQuestion(ActionEvent event) throws IOException {
		Main.loader("questionPage.fxml");
	}
	
	@FXML
	public void addCourse(ActionEvent event) throws IOException {
		Main.loader("addCourse.fxml");
	}
	
	@FXML
	public void viewCourses(ActionEvent event) throws IOException {
		Main.loader("courseList.fxml");
	}
	
	// Initialize the list of questions. Add a toString of question
	@FXML
	public void initialize() {
		questionList.getItems().add(0, (question.toString()));
	}
	
	
	
}
