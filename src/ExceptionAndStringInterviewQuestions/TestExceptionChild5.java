//Example in case subclass overridden method declares no exception:
package ExceptionAndStringInterviewQuestions;

class TestExceptionChild5 extends Parent {
	void msg() {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild5();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}