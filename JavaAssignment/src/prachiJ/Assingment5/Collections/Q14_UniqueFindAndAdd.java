package prachiJ.Assingment5.Collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class Q14_UniqueFindAndAdd {

	public static void main(String[] args) {
		Q14_UniqueFindAndAdd uniqueFindAndAdd = new Q14_UniqueFindAndAdd();
		ArrayList<Integer> al1 = uniqueFindAndAdd.inputList1Values();
		ArrayList<Integer> al2 = uniqueFindAndAdd.inputList2Values();
		uniqueFindAndAdd.findUniqueFromBothListAndAdd(al1, al2);
	}

	/*
	 * Description: Input values in List1
	 * @param : Nothing
	 * @return : List1
	 */
	ArrayList<Integer> inputList1Values() {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add(2);
		al1.add(5);
		System.out.println("ArrayList1 :" + al1);
		return al1;
	}

	/*
	 * Description: Input values in List2
	 * @param : Nothing
	 * @return : List2 containing duplicate value
	 */
	ArrayList<Integer> inputList2Values() {
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(5);
		al2.add(6);
		al2.add(7);
		al2.add(8);
		al2.add(9);
		al2.add(7); // to do: should display only 1 time
		System.out.println("ArrayList2 :" + al2);
		return al2;
	}

	/*
	 * Description: This method is to find unique from second ArrayList, add to
	 * first ArrayList and get Unique result from both
	 * @param : List1 and List2
	 * @return : Nothing
	 */
	void findUniqueFromBothListAndAdd(ArrayList<Integer> al1, ArrayList<Integer> al2) {
		ArrayList<Integer> al3 = new ArrayList<Integer>(al1); // passing values
																// of al1 to al3
		al3.retainAll(al2); // common in both
		al1.removeAll(al3); // Removed common to both from ArrayList1
		// HashSet<Integer> hs = new HashSet<Integer>(al2);
		// System.out.println("Unique from ArrayList2 :" + hs); //removes common
		// from second List only if required but then below TressSet should not
		// be applied
		al1.addAll(al2);
		TreeSet<Integer> ts = new TreeSet<Integer>(al1); // to find unique in
															// both after adding
															// both list
		System.out.println("unique array :" + ts);
	}
}
