package ankitaG;

public class MaxlengthWordInArray {
	static String[] str = { "krishna", "maulik", "aakash", "harsh", "aakansha", "abhishesk" };
	static String result = "";

	String findMaxlength(String str) {
		int x = str.length();

		if (x >= 7) {
			result = result + " " + str;

		}
		return result;

	}

	void display(String result) {
		System.out.println(result);
	}

	public static void main(String[] args) {

		MaxlengthWordInArray max = new MaxlengthWordInArray();
		for (int i = 0; i < str.length; i++) {
			result = max.findMaxlength(str[i]);
		}
		max.display(result);
	}
}
