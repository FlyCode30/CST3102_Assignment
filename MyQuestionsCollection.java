package testApp;
import java.util.LinkedList;


@SuppressWarnings("hiding")

public class MyQuestionsCollection<Questions> {

	public LinkedList<Questions> elements;
	
	public MyQuestionsCollection() {
		elements = new LinkedList<>();
	}
	
	public MyQuestionsCollection(Questions questions) {
		elements = new LinkedList<>();
	}
	
	public void add(Questions questions) {
		elements.add(questions);
	}
	
	public void remove(int index) {
		elements.remove(index);
	}
	
	public boolean contains(Questions questions) {
		return elements.contains(questions);
	}
	
	public int size() {
		return elements.size();
	}
	
	public String toString() {
		return elements.toString();
	}
	
	public void clear() {
		elements.clear();
	}
	
	public Questions get(int index) {
		return elements.get(index);
	}
	
}
	

