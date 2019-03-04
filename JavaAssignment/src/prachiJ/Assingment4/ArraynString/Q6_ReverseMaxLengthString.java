package prachiJ.Assingment4.ArraynString;

public class Q6_ReverseMaxLengthString {
	/*
	 * Description : This method is to calculate Max String then reverse it
	 * @param : Nothing
	 * @return : Nothing
	 */
	void reverseOfMaxString() {
		String[] arr = { "all the best", "technocredits", "", "maharashtra" };
		int index;
		int[] sizes = new int[arr.length];
		int max = sizes[0];
		String maxString = null;
		String rev = " ";
		for (index = 0; index < arr.length; index++) {
			sizes[index] = arr[index].length();
		}
		for (int i = 1; i < sizes.length; i++) {
			if (sizes[i] > max) {
				max = sizes[i];
				maxString = arr[i];
			}
		}
		for (int i = maxString.length() - 1; i >= 0; i--) {
			rev = rev + maxString.charAt(i);
		}
		System.out.println("Rev of Max length String: " + rev);
	}

	public static void main(String[] args) {
		Q6_ReverseMaxLengthString q6 = new Q6_ReverseMaxLengthString();
		q6.reverseOfMaxString();
	}
}
