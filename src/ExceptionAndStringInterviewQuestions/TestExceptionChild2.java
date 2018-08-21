/*1) Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
 */
package ExceptionAndStringInterviewQuestions;

class Parent {
	void msg() throws Exception {
		System.out.println("parent");
	}
}

class TestExceptionChild3 extends Parent {
	void msg() throws Exception {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild3();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}