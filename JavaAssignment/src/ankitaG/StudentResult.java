package ankitaG;

import java.util.Scanner;
//Q6 from decision making and switch statement
public class StudentResult {
	void findResult(int marks)
	{
		if(marks>0 && marks<=50)
		{
			System.out.println("Student is Fail");
		}
		else if(marks>50 && marks<=75)
		{
			System.out.println("Student is pass with 1st class");
		}
		else if(marks>75 && marks<= 100)
		{
			System.out.println("Student is pass with distinction");
		}
		else{
			System.out.println("invalid marks");
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number");
		int marks= scanner.nextInt();
		StudentResult result= new StudentResult();
		result.findResult(marks);
		scanner.close();
	}

}
