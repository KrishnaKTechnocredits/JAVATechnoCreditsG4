package akshata;

public class Assignment_Q3 {

	public static void main(String[] args) {
		
		int num1=Integer.parseInt(args[0]);
		
		Assignment_Q3 square_cube =new Assignment_Q3();
		int square=square_cube.square(num1);
		System.out.println("square of given no is :"+square);
		int cube=square_cube.cube(num1);
		System.out.println("cube of given no is :"+cube);

	}
	int square(int num)
	{
		int ans=num * num;
		return ans;
	}
	int cube(int num)
	{
		int ans=num * num * num;
		return ans;
	}
}
