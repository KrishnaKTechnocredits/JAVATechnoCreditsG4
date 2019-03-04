package prachiJ.Assingment4.ArraynString;

public class Q2_MaxLengthString {
	/*
	 * Description : This method is to find max length String
	 * @param : Nothing
	 * @return : Nothing
	 */
	static void maxLengthString() {
		String[] arr = { "all the best", "technocredits", "", "maharashtra" };
		int index;
		int[] sizes = new int[arr.length];
		int max = sizes[0];
		String maxString = null;
		for (index = 0; index < arr.length; index++) {
			sizes[index] = arr[index].length();
		}
		for (int i = 1; i < sizes.length; i++) {
			if (sizes[i] > max) {
				max = sizes[i];
				maxString = arr[i];
			}
		}
		System.out.println("Max length String from given array is: " + maxString);
	}

	public static void main(String[] args) {
		maxLengthString();
	}
}
