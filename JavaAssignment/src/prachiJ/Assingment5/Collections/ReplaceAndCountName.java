package prachiJ.Assingment5.Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class ReplaceAndCountName {
	/*
	 * Description: This method is to count number of occurrence of given name
	 * @param : name - name to be replaced
	 * @param : replaceName - name to be replaced with 
	 * @return : List containing replaced name
	 */
	ArrayList<String> countOccurreneOfANameAndReplaceName(String name, String replaceName) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("maulik");
		al1.add("harsh");
		al1.add("krishna");
		al1.add("maulik");
		al1.add("harsh");
		al1.add("krishna");
		System.out.println("List of original Names are: " + al1);

		int index = 0;
		int cnt = 0;
		while (al1.contains(name) != false) {
			index = al1.indexOf(name);
			if (index != (-1)) {
				cnt = cnt + 1;
			}
			al1.set(index, replaceName);
		}
		System.out.println("Occurance of name to be replaced: " + cnt);
		System.out.println("List with replaced names : " + al1);
		return al1;
	}

	/*
	 * Description: This method is to count number of occurrence of replaced name
	 * @param : name - List containing replaced name
	 * @param : replaceName - name to be replaced with 
	 * return : nothing
	 */
	void countOccurranceOfReplacedName(ArrayList<String> al2, String replaceName) {
		// System.out.println("Size of ArrayList is: " + al1.size());
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] arr = new String[al2.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = al2.get(i);
			System.out.println(arr[i]);
		}
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == replaceName) {
				hm.put(replaceName, count);
				count++;
			}
		}
		System.out.println("Total Count of Krishna is :" + hm);
	}

	public static void main(String args[]) {
		String name = "maulik";
		String replaceName = "krishna";
		ReplaceAndCountName replaceAndCountName = new ReplaceAndCountName();
		ArrayList<String> al2 = replaceAndCountName.countOccurreneOfANameAndReplaceName(name, replaceName);
		replaceAndCountName.countOccurranceOfReplacedName(al2, replaceName);
	}
}
