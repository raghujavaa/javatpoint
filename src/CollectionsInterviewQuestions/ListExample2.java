package CollectionsInterviewQuestions;

import java.util.LinkedList;
import java.util.List;

public class ListExample2 {
	public static void main(String[] args) {
		// LinkedList is better to manipulate data
		List<String> list = new LinkedList<>();
		list.add("ankit");
		list.add("peter");
		list.add("mayank");
		System.out.println("After adding: " + list);
		list.remove("peter");
		System.out.println("After removing: " + list);
		list.set(1, "vivek");
		System.out.println("After changing: " + list);
	}
}
