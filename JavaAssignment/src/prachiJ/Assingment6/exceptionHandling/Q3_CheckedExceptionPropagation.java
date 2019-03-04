package prachiJ.Assingment6.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

//A Class that represents CheckedExceptionPropagation 
public class Q3_CheckedExceptionPropagation {

	void f() throws IOException {
		try {
			g(); // call g()
		} catch (FileNotFoundException e) { // catch exception of g()
			e.printStackTrace();
			throw new IOException(); // throw IOException
		}
	}

	void g() throws FileNotFoundException {
		throw new FileNotFoundException(); // throw FileNotFoundException
	}

	public static void main(String[] args) {
		Q3_CheckedExceptionPropagation q3 = new Q3_CheckedExceptionPropagation();
		try {
			q3.f();
		} catch (IOException e) { // handle IOException
			e.printStackTrace();
		}
	}
}
