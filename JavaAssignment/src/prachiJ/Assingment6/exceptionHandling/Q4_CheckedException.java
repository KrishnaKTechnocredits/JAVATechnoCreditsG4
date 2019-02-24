package prachiJ.Assingment6.exceptionHandling;

import java.io.IOException;

//A Class that represents CheckedException propagation and handling 
public class Q4_CheckedException {
	void m1() {
		try {
			m2();
		} catch (IOException e) { // m1() handles exception propagated by m2()
									// via try/catch
			e.printStackTrace();
		}
	}

	void m2() throws IOException // exception gets propagated to m1()
	{
		try {
			throw new IOException(); // exception gets handled in catch block
										// only
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Q4_CheckedException q4 = new Q4_CheckedException();
		q4.m1();
	}
}
