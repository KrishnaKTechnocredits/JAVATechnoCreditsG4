package ankitaG;

public class Program2 {
	int studentrollno;
	String studentName;
	float studentMarks;
	
	void studentDetails(int rno, String name, float marks) {
		studentrollno = rno;
		studentName = name;
		studentMarks = marks;
		System.out.println(" rollno is:" + studentrollno + " " + "\n student Name is:" + studentName + " "
				+ "\n student Marks is:" + studentMarks);
	}
	public static void main(String[] args) {
		int studentrollno = Integer.parseInt(args[0]);
		String studentName = args[1];
		float studentMarks = Float.parseFloat(args[2]);
		Program2 p2 = new Program2();
		p2.studentDetails(studentrollno, studentName, studentMarks);
	}

}
