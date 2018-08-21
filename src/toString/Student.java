//Understanding problem without toString() method:

package toString;

public class Student {
	int rollno;
	String name;
	String city;

	Student(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public static void main(String args[]) {
		Student s1 = new Student(101, "Raj", "lucknow");
		Student s2 = new Student(102, "Vijay", "ghaziabad");

		System.out.println(s1);// compiler writes here s1.toString()
		System.out.println(s2);// compiler writes here s2.toString()
	}
}

/*
 * As you can see in the above example, printing s1 and s2 prints the hashcode
 * values of the objects but I want to print the values of these objects. Since
 * java compiler internally calls toString() method, overriding this method will
 * return the specified values.
 */

