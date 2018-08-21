package ExceptionAndStringInterviewQuestions;

class  {
	void msg() throws Exception {
		System.out.println("parent");
	}
}

class TestExceptionChild3 extends Parent {
	void msg() throws Exception {
		System.out.println("child");
	}

	public static void main(String args[]) {
		ParentClass p = new TestExceptionChild3();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}