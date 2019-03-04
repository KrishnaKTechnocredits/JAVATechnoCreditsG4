package manasiM;

public class PrimeSum {

	void sumofprime(int start, int end) {
		int sum = 0;
		for (int j = start; j <= end; j++)

		{
			boolean status = true;

			for (int i = 2; i < j; i++) {

				if (j % i == 0) {
					status = false;
					// System.out.println("Number is not Prime "+ j);
					break;
				}
			}
			if (status == true) {
				System.out.println(j + " is Prime Number");
				sum = sum + j;
			}
		}
		System.out.println("Sum is: " + sum);
	}

	public static void main(String[] args) {
		new PrimeSum().sumofprime(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}
}
