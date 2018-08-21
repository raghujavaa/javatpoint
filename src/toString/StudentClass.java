//Example of Java toString() method:
package toString;

public class StudentClass {
	int rollno;
	String name;
	String city;

	StudentClass(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public String toString() {// overriding the toString() method
		return rollno + " " + name + " " + city;
	}

	public static void main(String args[]) {
		StudentClass s1 = new StudentClass(101, "Raj", "lucknow");
		StudentClass s2 = new StudentClass(102, "Vijay", "ghaziabad");

		System.out.println(s1);// compiler writes here s1.toString()
		System.out.println(s2);// compiler writes here s2.toString()
	}
}
