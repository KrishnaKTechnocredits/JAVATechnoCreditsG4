package akshata;

public class Assignment_Q10 {

	static int sum;

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		System.out.println("user given no is  :" + num);
		for (int i = 2; i < num; i++) {
			boolean flag = checkprimeno(i);
			if (flag == true) {
				sum = sum + i;
				
				System.out.println("the  of prime no's  :" + i);
			}
		}
		System.out.println("the sum of prime no's is: " + sum);
	}

	static boolean checkprimeno(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % 2 == 0)
				flag = false;

		}
		return flag;
	}
}
