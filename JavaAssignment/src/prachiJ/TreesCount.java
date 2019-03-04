package prachiJ;

import java.util.Scanner;

// this class counts total no. of trees visible to user and returns same value to TressCount class
public class TreesCount {
	/*
	 * This method is counts no. of trees visible 
	 * @param Nothing
	 * @return total no. of trees visible to TressCount class
	 */
	int countVisibleTrees() {
		int totalVisible = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total trees:");
		int totalTrees = scanner.nextInt();
		System.out.println("Enter tree sizes:");
		int[] treeSizes = new int[totalTrees];
		// below for loop takes sizes of trees from user
		for (int count = 0; count < totalTrees; count++) {
			treeSizes[count] = scanner.nextInt();
		}
		System.out.println("Display tree sizes:");
		// below for loop displays all tree sizes
		for (int count = 0; count < totalTrees; count++) {
			System.out.print(treeSizes[count] + "\t");
		}
		System.out.println();
		int visibleTree = treeSizes[0];
		for (int count = 1; count < totalTrees; count++) {
			if (treeSizes[count] > visibleTree) {
				visibleTree = treeSizes[count];
				totalVisible = totalVisible + 1;
			}
		}
		scanner.close();
		return totalVisible;
	}

	public static void main(String args[]) {
		TreesCount treesCount = new TreesCount();
		int totalVisible = treesCount.countVisibleTrees();
		System.out.println("No. of trees visible are: " + totalVisible);
	}
}
