package prachiJ.Assingment6.exceptionHandling;

//A Class that represents UncheckedException 
public class Q4_UncheckedException {
	void m1() {
		m2();
	}

	void m2() {
		int[] arr = { 1, 2, 3 };
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) { // handled in same method
														// m2(), it is not
														// propagated to m1(),
														// so m1() does not need
														// to handle it
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Q4_UncheckedException q4 = new Q4_UncheckedException();
		q4.m1();
	}
}
