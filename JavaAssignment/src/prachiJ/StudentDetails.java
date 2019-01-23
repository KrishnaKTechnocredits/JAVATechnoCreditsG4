package prachiJ;

import prachiJ.StudentDetails;

public class StudentDetails 
{
	void details(int rNo, String name, float marks)
	{
		System.out.println("Student Details are-");
		System.out.println("1) Roll Number: " + rNo);
		System.out.println("2) Name: " + name);
		System.out.println("3) Marks: " + marks);
	}
	public static void main(String args[])
	{
		int rNo = Integer.parseInt(args[0]);
		String name = args[1];
		float marks = Integer.parseInt(args[2]);
		
		StudentDetails sd = new StudentDetails();
		sd.details(rNo, name, marks);
	}
}
