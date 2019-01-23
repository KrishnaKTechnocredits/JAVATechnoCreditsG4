package piyushS;

public class Q2 {

	void detailsOfStudent(int RollNo, String Name, int Marks) {

		System.out.println("Rollnumber of a Student is " + RollNo);

		System.out.println("Name of a Student is " + Name);

		System.out.println("Marks of a Student is " + Marks);

	}

	public static void main(String[] args) {

		Q2 obj = new Q2();

		obj.detailsOfStudent(101, "PiyushS", 500);

	}

}
