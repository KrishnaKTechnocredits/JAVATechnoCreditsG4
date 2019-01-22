// Swap two numbers without using third variable

package monika;

public class SwapNumber2 {
	static void swap(int x, int y)
	{
		System.out.println("The current numbers are " +x+ " & "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("The numbers after swapping are " +x+ " & "+y);
	}

	public static void main(String[] args) {
		swap(18,16);

	}


}
