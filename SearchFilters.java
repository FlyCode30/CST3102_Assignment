//package testApp;
//
//public class SearchFilters{
//	
//	
//	/**
//     * A method creates a collection a list of the unique course names in MyQuestionsCollection
//     * 
//     */
//   
//	    public static MyQuestionsCollection<String> getUniqueCourseNames(MyQuestionsCollection<Questions> questions) {
//	    	    
//            	MyQuestionsCollection<String> uniqueCourseNames = new MyQuestionsCollection<>();
//            	
//            	for (int i = 0; i < questions.size(); i++) {
//            		if (!uniqueCourseNames.contains(questions.elements.get(i).getCourseInfo().getCourseName())) {
//            			uniqueCourseNames.add(questions.elements.get(i).getCourseInfo().getCourseName());
//            		}
//            	}
//  
//            	return uniqueCourseNames;
//            
//    }
//	    
//	/**
//	 * this method creates a collection of the unique semesters in MyQuestionsCollection
//	 *
//	 */
//	    
//	public static MyQuestionsCollection<String> getUniqueSemesters(MyQuestionsCollection<Questions> questions) {
//
//		MyQuestionsCollection<String> uniqueSemesters = new MyQuestionsCollection<>();
//
//		for (int i = 0; i < questions.size(); i++) {
//			if (!uniqueSemesters.contains(questions.elements.get(i).getCourseInfo().getSemester())) {
//				uniqueSemesters.add(questions.elements.get(i).getCourseInfo().getSemester());
//			}
//		}
//
//		return uniqueSemesters;
//	}
//   
//}