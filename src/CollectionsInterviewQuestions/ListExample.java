package CollectionsInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(Integer.valueOf(10));// storing Integer object
		list.add(20);// Now compiler converts it into Integer.valueOf(20) which
						// is object
		list.add(30);

		System.out.println("Traversing List...");
		for (Integer i : list) {
			System.out.println(i);
		}
	}
}
