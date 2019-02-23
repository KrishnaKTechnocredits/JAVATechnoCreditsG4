package prachiJ.Assingment5.Collections;

import java.util.ArrayList;

public class Q10_AddLists {

	/*
	 * Description : This method adds values present in two lists
	 * @param : Nothing
	 * @return: Nothing
	 */
	void addTwoListValues() {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(5);
		al1.add(9);
		al1.add(3);
		al1.add(7);
		System.out.println("firstArray :- " + al1);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);
		al2.add(7);
		al2.add(9);
		al2.add(3);
		System.out.println("secondAraay:- " + al2);
		al1.addAll(al2);
		// System.out.println(al1);
		int sum = 0;
		for (int index = 0; index < al1.size(); index++) {
			sum = sum + al1.get(index);
		}
		System.out.println("output :- " + sum);
	}

	public static void main(String[] args) {
		Q10_AddLists addLists = new Q10_AddLists();
		addLists.addTwoListValues();
	}
}
