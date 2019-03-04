package prachiJ.Assingment5.Collections;

import java.util.ArrayList;

public class Q9_AverageOfNumbers {
	/*
	 * Description : This method is to calculate average of given numbers
	 * @param : Nothing
	 * @Return : Nothing
	 */
	void calculateAverage() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(14);
		al.add(32);
		al.add(19);
		al.add(14);
		al.add(78);
		al.add(36);
		System.out.println("Input :- " + al);
		int size = al.size();
		int sum = 0;
		float avg;
		for (int index = 0; index < al.size(); index++) {
			sum = sum + al.get(index);
		}
		avg = (float) sum / size;
		System.out.println(avg);
	}

	public static void main(String[] args) {
		Q9_AverageOfNumbers averageOfNumbers = new Q9_AverageOfNumbers();
		averageOfNumbers.calculateAverage();
	}

}
