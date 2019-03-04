package prachiJ.Assingment4.ArraynString;

public class Q14_UniqueFindAndAdd {
	static int cnt = 0;
	static boolean setZeroFlag = false;

	/*
	 * Description : This method finds unique numbers in 2 arrays.
	 * @param : Nothing
	 * @return : Nothing
	 */
	void uniqueNumsFind() {
		int[] arr1 = { 1, 2, 0, 3, 4, 2, 5, 0 };
		int[] arr2 = { 5, 6, 7, 8, 9, 7, 0 };
		int[] uniqueArr = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			setElement(uniqueArr, arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			setElement(uniqueArr, arr2[i]);
		}
		displayUniqueArray(uniqueArr);
	}

	/*
	 * Description : This method set unique values in result array
	 * @param : uniqueArr - passes empty result array
	 * @param : temp - passes an element from array to search for its presence in result array
	 * @return : Nothing
	 */
	static void setElement(int[] uniqueArr, int temp) {
		boolean flag = false;
		for (int i = 0; i < uniqueArr.length; i++) {
			if (uniqueArr[i] == temp) {
				flag = true;
				break;
			}
		}
		if (temp == 0 && setZeroFlag == false) {
			uniqueArr[cnt] = temp;
			setZeroFlag = true;
			cnt++;
		}
		if (flag == false) {
			uniqueArr[cnt] = temp;
			cnt++;
		}
	}

	/*
	 * Description : This method displays unique numbers.
	 * @param : uniqueArr - result array containing unique values
	 * @return : Nothing
	 */
	static void displayUniqueArray(int[] uniqueArr) {
		for (int i = 0; i < cnt; i++) {
			System.out.print(uniqueArr[i] + "\t");
		}
	}

	public static void main(String[] args) {
		Q14_UniqueFindAndAdd q14 = new Q14_UniqueFindAndAdd();
		q14.uniqueNumsFind();
	}
}
