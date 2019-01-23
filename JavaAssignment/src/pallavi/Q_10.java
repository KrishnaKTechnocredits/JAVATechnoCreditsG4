package pallavi;
// WAP to find sum of all prime number between user given range.

public class Q_10 {

	static int sum;

	static void isPrime(int num) {
		boolean flag = true;
		int i = 0;

		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			System.out.println(num + " is prime");
			sum = sum + i;
		}
	}

	public static void main(String[] args) {
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		for (int i = start; i <= end; i++) {
			isPrime(i);
		}
		System.out.println("Total sum of prime no: is " + sum);
	}
}
