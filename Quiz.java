//package testApp;
//import java.util.*;
//
//
//public class Quiz <QuizQuestions> {
//
//	ArrayList<QuizQuestions> elements;
//	
//	public Quiz() {
//		elements = new ArrayList<>();
//	}
//	
//	public Quiz(QuizQuestions quizQuestions) {
//		elements = new ArrayList<>();
//	}
//	
//	public void add(QuizQuestions quizQuestions)	{
//		elements.add(quizQuestions);
//	}
//	
//	public void remove(int index) {
//		elements.remove(index);
//	}
//
//	public boolean contains(QuizQuestions quizQuestions) {
//		return elements.contains(quizQuestions);
//	}
//	
//	public int size() {
//		return elements.size();
//	}
//	
//	public String toString() {
//		return elements.toString();
//	}
//	
//	public void clear() {
//		elements.clear();
//	}
//	
//	// this method is used to move questions from MyQuestionsCollection to Quiz, based on the courseInfo of the courses
//	
//	@SuppressWarnings("unchecked")
//	public <T> void addAllBasedOnType(MyQuestionsCollection<Questions> source, Quiz<QuizQuestions> destination, CourseInfo courseInfo) {
//		
//		for (int i = 0; i < source.size(); i++) {
//            if (source.elements.get(i).getCourseInfo().equals(courseInfo)) {
//                destination.add((QuizQuestions) source.elements.get(i));
//            }
//		}
//		
//	}
//	
//    
//}
