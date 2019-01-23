package pallavi;

//WAP to print the details of Student As Roll No, Name and Marks by taking input from the user.

public class Q_2 {

	int studentrollno;
	String studentname;
	float studentmarks;

	void studentDetails(int rno, String name, float marks) {
		studentrollno = rno;
		studentname = name;
		studentmarks = marks;
		System.out.println("Rollno is " + rno + ", name is " + name + " and marks are " + marks);
	}

	public static void main(String[] args) {
		int rno = Integer.parseInt(args[0]);
		String name = args[1];
		float marks = Float.parseFloat(args[2]);
		Q_2 q = new Q_2();
		q.studentDetails(rno, name, marks);
	}
}
