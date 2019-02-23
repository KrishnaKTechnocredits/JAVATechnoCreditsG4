package prachiJ.Assingment5.Collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Q15_StringMoreThanGivenLength {

	public static void main(String[] args) {
		int minNameLength = 7;
		Q15_StringMoreThanGivenLength stringMoreThanGivenLength = new Q15_StringMoreThanGivenLength();
		ArrayList<String> al = stringMoreThanGivenLength.inputValuesInList();
		stringMoreThanGivenLength.findNamesWithMoreThanGivenLength(al, minNameLength);
	}

	/*
	 * Description: This method is to Input few names 
	 * @param : Nothing
	 * @return : List of Names
	 */
	ArrayList<String> inputValuesInList() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("krishna");
		al.add("Maulik");
		al.add("aakash");
		al.add("harsh");
		al.add("aakansha");
		al.add("abhishek");
		System.out.println("Input Names :" + al);
		return al;
	}

	/*
	 * Description: This method is to find names with more than provided length 
	 * @param : al - List of provided names
	 * @param : minNameLength - minimum length of name
	 * @return : Nothing
	 */
	void findNamesWithMoreThanGivenLength(ArrayList<String> al, int minNameLength) {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < al.size(); i++) {
			String name = al.get(i);
			if (name.length() >= minNameLength)
			{
				hm.put(name, name.length());
			}
		}
		System.out.println("Output :" + hm);
	}

}
