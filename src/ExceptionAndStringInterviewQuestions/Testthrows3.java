/*
 * Case2: You declare the exception:
	A)In case you declare the exception, if exception does not occur, 
	the code will be executed fine.
	B)In case you declare the exception if exception occures, 
	an exception will be thrown at runtime 
	because throws does not handle the exception.
 */
//A)Program if exception does not occur:
package ExceptionAndStringInterviewQuestions;

import java.io.IOException;

class M1 {
	void method() throws IOException {
		System.out.println("device operation performed");
	}
}

class Testthrows3 {
	public static void main(String args[]) throws IOException {// declare
																// exception
		M1 m = new M1();
		m.method();

		System.out.println("normal flow...");
	}
}