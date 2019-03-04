package prachiJ.Assingment5.Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Q2_MaxLengthString {
	/*
	 * Description : This method is to find max length String
	 * @param : Nothing
	 * @return : Nothing
	 */
	void maxString() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("all the best");
		al.add("technocredits");
		al.add("maharashtra");
		System.out.println("Input array:- " + al);
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
		System.out.println("Max length string is: " + hm.get(max));
	}

	public static void main(String[] args) {
		Q2_MaxLengthString maxLengthString = new Q2_MaxLengthString();
		maxLengthString.maxString();
	}
}
