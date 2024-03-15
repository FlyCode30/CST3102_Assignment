package javaFxControllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import testApp.MxQuestion;
import testApp.MyQuestionsCollection;
import testApp.Questions;

import java.awt.Button;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class questionListController extends Application {

	private MyQuestionsCollection myQuestions;
	@FXML
	private TableView<Questions> questionList;
	@FXML
	TableColumn<Questions, String> courseColumn = new TableColumn<>("Course");
	@FXML
	TableColumn<Questions, String> questionColumn = new TableColumn<>("Question");
	@FXML
	private Scene scene;
	@FXML
	private Button viewCourses;
	@FXML
	private Button addQuestion;
	@FXML
	private Button addCourse;
	

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
		// iniitialize 
		myQuestions = Main.getMyQuestions();
		
		questionList.setItems(myQuestions.getQuestions());
		
		// course name column
		courseColumn.setCellValueFactory(new PropertyValueFactory<>("courseInfo"));
		// program name column
		questionColumn.setCellValueFactory(new PropertyValueFactory<>("body"));
	}
	
	
	
}
