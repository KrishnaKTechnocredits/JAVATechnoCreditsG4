package monika;

public class MaxValueatDifferIndex {

	public static void main(String[] args) {
		int arr1[] = { 10, 2, 9, 14, 3 };
		int arr2[] = { 10, 2, 18, 14, 3 };
		for (int index1 = 0; index1 < arr1.length; index1++) {
				if (arr1[index1] != arr2[index1])  
				{
					System.out.println("Values are not matching at index --> " + index1);
					if (arr1[index1] > arr2[index1])
					{
						System.out.println("the value " +arr1[index1]+ " is bigger" );
					}
					else
						System.out.println("the value " +arr2[index1]+ " is bigger");
				}
		}
	}
}