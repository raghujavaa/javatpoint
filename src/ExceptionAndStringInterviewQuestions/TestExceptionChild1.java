/*2) Rule: If the superclass method does not declare an exception, 
 * subclass overridden method cannot declare the checked exception 
 * but can declare unchecked exception.
 */
package ExceptionAndStringInterviewQuestions;

class Parent2 {
	void msg() {
		System.out.println("parent");
	}
}

class TestExceptionChild1 extends Parent {
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild1();
		p.msg();
	}
}