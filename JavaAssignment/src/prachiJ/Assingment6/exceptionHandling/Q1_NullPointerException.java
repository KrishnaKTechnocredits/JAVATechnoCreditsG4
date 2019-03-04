package prachiJ.Assingment6.exceptionHandling;

//A Class that represents NullPointerException 
public class Q1_NullPointerException {
	void m1() {
		System.out.println("In m1");
	}

	public static void main(String[] args) {
		Q1_NullPointerException q1 = new Q1_NullPointerException();
		try {
			q1 = null;
			q1.m1();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Object reference cannot be NULL");
		}
	}
}
