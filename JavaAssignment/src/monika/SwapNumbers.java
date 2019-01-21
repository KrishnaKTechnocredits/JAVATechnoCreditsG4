// Swap two numbers using the third variable

package monika;;

public class SwapNumbers {
	
	static void swapwithvariable(int a, int b)
	{
		System.out.println("The number before swap are "+a+ " & "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("The number after swap are "+a+ " & "+b);
	}
	
	public static void main(String[] args) {
		swapwithvariable(10,19);
	}
}
