package ankitaG;

public class ArrayValuesSegregation {

	void findPositiveNumbers(int[] numbers) {
		int positvesum = 0;
		int positiveNumbers[] = new int[numbers.length];
		System.out.println("array of positive values");
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > 0) {
				positiveNumbers[index] = numbers[index];
				System.out.print(positiveNumbers[index] + " ");
				positvesum = positvesum + numbers[index];
			}

		}
		System.out.println("\n sum of positive values is " + positvesum);
	}

	void findNegativeNumbers(int[] numbers) {
		int negativesum = 0;
		int negativeNumbers[] = new int[numbers.length];
		System.out.println("array of negative values");
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] < 0) 
			{
				negativeNumbers[index] = numbers[index];
				System.out.print(negativeNumbers[index]+"");
				negativesum = negativesum + numbers[index];
			}
		}
		System.out.println("\n sum of negative values is " + negativesum);

	}

	public static void main(String[] args) {
		ArrayValuesSegregation as = new ArrayValuesSegregation();
		int numbers[] = { 5, 6, -9, 14, -25, 6, 7, -14 };
		as.findPositiveNumbers(numbers);
		as.findNegativeNumbers(numbers);
	}

}
