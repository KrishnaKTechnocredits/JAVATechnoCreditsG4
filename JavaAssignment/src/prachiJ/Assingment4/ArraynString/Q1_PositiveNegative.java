package prachiJ.Assingment4.ArraynString;

public class Q1_PositiveNegative {
	/*
	 * Description : This method is to separate positive and negative numbers and find their respective sum
	 * @param : Nothing
	 * @return : Nothing
	 */
	void positiveNegativeFindandSum() {
		int[] arr = { 5, 6, -9, 14, -25, 6, 7, -14 };
		int[] pArr = new int[arr.length];
		int[] nArr = new int[arr.length];
		int pCnt = 0, nCnt = 0;
		int pIndex = 0, nIndex = 0;
		int pSum = 0, nSum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				pArr[pCnt] = arr[index];
				pCnt++;
			} else if (arr[index] < 0) {
				nArr[nCnt] = arr[index];
				nCnt++;
			}
		}
		System.out.println("Positive numbers are:");
		for (pIndex = 0; pIndex < pCnt; pIndex++) {
			System.out.print(pArr[pIndex] + " ");
			pSum = pSum + pArr[pIndex];
		}
		System.out.println("\n" + "Negative numbers are:");
		for (nIndex = 0; nIndex < nCnt; nIndex++) {
			System.out.print(nArr[nIndex] + " ");
			nSum = nSum + (-(nArr[nIndex]));
		}
		System.out.println("\n" + "Positive numbers sum: " + pSum);
		System.out.println("Negative numbers sum: " + nSum);
	}

	public static void main(String[] args) {
		Q1_PositiveNegative q1 = new Q1_PositiveNegative();
		q1.positiveNegativeFindandSum();
	}
}
