package testApp;

import java.util.LinkedHashSet;


@SuppressWarnings("hiding")
public class CourseCollection<CourseInfo> {

	public LinkedHashSet<CourseInfo> elements;
	
	public CourseCollection() {
		elements = new LinkedHashSet<>();
	}
	
	public CourseCollection(CourseInfo courseInfo) {
		elements = new LinkedHashSet<>();
	}
	
	public void add(CourseInfo courseInfo) {
		elements.add(courseInfo);
	}
	
	public void remove(int index) {
		elements.remove(index);
	}
	
	public boolean contains(CourseInfo courseInfo) {
		return elements.contains(courseInfo);
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

}
