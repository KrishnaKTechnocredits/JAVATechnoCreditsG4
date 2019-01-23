package piyushS;

public class Q10 {
	static int sum = 0;

	static void isPrime(int number) {
		boolean flag = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = false;
				System.out.println(number + " is not Prime");
				break;
			}
		}

		if (flag == true) {
			System.out.println(number + " is Prime");
			sum = sum + number;
		}
	}

	public static void main(String[] args) {
		for (int j = 1; j <= 20; j++) {
			isPrime(j);
		}

		System.out.println("Sum of all Prime nos present here is " + sum);
	}

}
