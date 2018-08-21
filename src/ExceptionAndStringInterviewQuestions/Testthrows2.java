/*
 * Case1: You handle the exception
In case you handle the exception, the code will be executed fine 
whether exception occurs during the program or not.
 */
package ExceptionAndStringInterviewQuestions;

import java.io.IOException;

class M {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

public class Testthrows2 {
	public static void main(String args[]) {
		try {
			M m = new M();
			m.method();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

		System.out.println("normal flow...");
	}
}