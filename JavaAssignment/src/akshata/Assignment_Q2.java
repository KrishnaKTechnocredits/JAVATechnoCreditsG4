package akshata;

public class Assignment_Q2 {

	public static void main(String[] args) {
		
		int rollno=Integer.parseInt(args[0]);
		String name=args[1];
		float marks=Integer.parseInt(args[2]);
		studentdetails(rollno,name ,marks);
		
	}
	
	
	static void studentdetails(int rollno,String name,float marks)
	{
		System.out.println("roll no of student is :"+rollno);
		System.out.println("name of student is :"+name);
		System.out.println("marks of student is :"+marks);
	}
}
