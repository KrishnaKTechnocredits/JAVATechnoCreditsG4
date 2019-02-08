package pallavi;

import java.util.Scanner;

public class StudentMarks_Q6 
{
	void marksOfStudent() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of student");
		int studentMarks = sc.nextInt();
		if (studentMarks > 0 && studentMarks < 50) 
		{
			System.out.println("Student is failed");
		} 
		else if (studentMarks > 50 && studentMarks < 75) 
		{
			System.out.println("Student passed in 1st class");
		} 
		else if (studentMarks > 75 && studentMarks < 100) 
		{
			System.out.println("Student passed in distinction");
		}
	}

	public static void main(String[] args) 
	{
		StudentMarks_Q6 studentmarks = new StudentMarks_Q6();
		studentmarks.marksOfStudent();
	}
}
