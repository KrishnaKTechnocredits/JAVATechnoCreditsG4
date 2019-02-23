package prachiJ.Assingment4.ArraynString;

public class Q10_AddLists {
	/*
	 * Description : This method adds values present in two lists
	 * @param : Nothing
	 * @return: Nothing
	 */
	void sumArrays() {
		int[] arr1 = { 1, 5, 9, 3, 7 };
		int[] arr2 = { 1, 7, 9, 3 };
		int sumArr1 = 0;
		int sumArr2 = 0;
		for (int index = 0; index < arr1.length; index++) {
			sumArr1 = sumArr1 + arr1[index];
		}
		for (int index = 0; index < arr2.length; index++) {
			sumArr1 = sumArr1 + arr2[index];
		}
		int sum = sumArr1 + sumArr2;
		System.out.println("Sum of 2 arrays is: " + sum);
	}

	public static void main(String[] args) {
		Q10_AddLists q10 = new Q10_AddLists();
		q10.sumArrays();
	}

}
