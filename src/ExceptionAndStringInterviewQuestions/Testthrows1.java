package ExceptionAndStringInterviewQuestions;

import java.io.IOException;

class Testthrows1 {
	void m() throws IOException {
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		Testthrows1 obj = new Testthrows1();
		obj.p();
		System.out.println("normal flow...");
	}
}

// Rule: If you are calling a method that declares an exception, you must either
// caught or declare the exception.
// There are two cases:
// Case1:You caught the exception i.e. handle the exception using try/catch.
// Case2:You declare the exception i.e. specifying throws with the method.
