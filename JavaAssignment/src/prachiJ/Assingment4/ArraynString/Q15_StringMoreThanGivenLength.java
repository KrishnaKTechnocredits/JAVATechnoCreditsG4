package prachiJ.Assingment4.ArraynString;

public class Q15_StringMoreThanGivenLength {
	/*
	 * Description: This method is to find names with more than provided length
	 * @param : Nothing
	 * @return : Nothing
	 */
	void stringMoreThanGivenLength() {
		String[] arr = { "krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek" };
		String[] OutputArr = new String[arr.length];
		int cnt = 0;
		int length = 7;
		System.out.println("Output :- ");
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() >= length) {
				OutputArr[cnt] = arr[index];
				System.out.println(OutputArr[cnt]);
				cnt++;
			}
		}
	}

	public static void main(String[] args) {
		Q15_StringMoreThanGivenLength q15 = new Q15_StringMoreThanGivenLength();
		q15.stringMoreThanGivenLength();

	}

}
