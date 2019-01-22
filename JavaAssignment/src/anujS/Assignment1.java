package anujS;

public class Assignment1 {
	int x;
	int y;

	public void add(int x, int y) {
		System.out.println(x + y);
	}

	public void sub(int x, int y) {
		System.out.println(x - y);
	}

	public void multiply(int x, int y) {
		System.out.println(x * y);
	}

	public void devide(int x, int y) {
		System.out.println(x / y);
	}

	public void Remainder(int x, int y) {
		System.out.println(x % y);
	}

	public static void main(String[] args) {
		Assignment1 s1 = new Assignment1();
		s1.add(10, 20);
		s1.sub(20, 10);
		s1.multiply(10, 20);
		s1.devide(18, 3);
		s1.Remainder(50, 4);

	}
}
