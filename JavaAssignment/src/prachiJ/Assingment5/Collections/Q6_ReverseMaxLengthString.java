package prachiJ.Assingment5.Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Q6_ReverseMaxLengthString {
	/*
	 * Description : This method is to calculate Max String then reverse it
	 * @param : Nothing
	 * @return : Nothing
	 */
	void reverseOfMaxString() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("all the best");
		al.add("technocredits");
		al.add("maharashtra");
		System.out.println("Input List- " + al);
		// HashMap<String, Integer> hm = new HashMap<String, Integer>();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		for (int i = 0; i < al.size(); i++) {
			hm.put(al.get(i).length(), al.get(i));
		}
		// System.out.println(hm);
		int max = al.get(0).length();
		for (int i = 0; i < al.size() - 1; i++) {
			int j = i + 1;
			if (al.get(j).length() > max) {
				max = al.get(j).length();
			}
		}
		System.out.println("Output Max length string :- " + hm.get(max));
		String rev = " ";
		System.out.println(max);
		for (int i = max - 1; i >= 0; i--) {
			rev = rev + hm.get(max).charAt(i);
		}
		System.out.println("Max length string reverse value :-" + rev);
	}

	public static void main(String[] args) {
		Q6_ReverseMaxLengthString reverseMaxLengthString = new Q6_ReverseMaxLengthString();
		reverseMaxLengthString.reverseOfMaxString();
	}

}
