// Prins student deails as Roll no, name and Marks by taking input from user

package monika;

public class PrintStudentDetail {

	static void studentdetail(int rNo, String name, int marks) {
		System.out.println("The role number of student = " + rNo);
		System.out.println("The name of student = " + name);
		System.out.println("Marks of student = " + marks);
	}

	public static void main(String[] a) {
		int rollno = Integer.parseInt(a[0]);
		String name = a[1];
		int marks = Integer.parseInt(a[2]);
		studentdetail(rollno, name, marks);
	}

}
