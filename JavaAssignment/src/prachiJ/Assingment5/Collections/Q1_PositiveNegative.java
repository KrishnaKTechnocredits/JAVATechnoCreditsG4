package prachiJ.Assingment5.Collections;

import java.util.ArrayList;

public class Q1_PositiveNegative {
	/*
	 * Description : This method is to separate positive and negative numbers and find their respective sum
	 * @param : Nothing
	 * @return : Nothing
	 */
	void positiveNegativeFindandSum() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(-9);
		al.add(14);
		al.add(-25);
		al.add(6);
		al.add(7);
		al.add(-14);
		System.out.println(al);
		ArrayList<Integer> pAl = new ArrayList<Integer>();
		ArrayList<Integer> nAl = new ArrayList<Integer>();
		for (int index = 0; index < al.size(); index++) {
			if (al.get(index) > 0) {
				pAl.add(al.get(index));
			} else if (al.get(index) < 0) {
				nAl.add(al.get(index));
			}
		}
		System.out.println("positive number = " + pAl);
		System.out.println("negative number = " + nAl);
		int pSum = 0, nSum = 0;
		for (int index = 0; index < pAl.size(); index++) {
			pSum = pSum + pAl.get(index);
		}
		for (int index = 0; index < nAl.size(); index++) {
			nSum = nSum + nAl.get(index);
		}
		System.out.println("positive number sum :- " + pSum);
		System.out.println("negative number sum :- " + (-nSum));
	}

	public static void main(String[] args) {
		Q1_PositiveNegative positiveNegative = new Q1_PositiveNegative();
		positiveNegative.positiveNegativeFindandSum();
	}
}
