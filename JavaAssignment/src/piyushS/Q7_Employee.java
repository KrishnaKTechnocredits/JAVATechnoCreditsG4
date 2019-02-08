package piyushS;

import java.util.Scanner;

public class Q7_Employee {

	String empname;
	int empdeptId;
	int empsalary;

	Q7_Employee(String name, int deptId, int salary) {
		this.empname = name;
		this.empdeptId = deptId;
		this.empsalary = salary;

	}

	void compareEmpSalary(Q7_Employee e1, Q7_Employee e2) {

		if (e1.empsalary > e2.empsalary) {
			System.out.println(e1.empname +" is having maxium salary"+", his/her id is " + e1.empdeptId
					+ " and his/her salary is " + e1.empsalary);

		} else {

			System.out.println(e2.empname +" is having maxium salary"+", his/her id is " + e2.empdeptId
					+ " and his/her salary is " + e2.empsalary);

		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the details of first employee");
		Q7_Employee e1 = new Q7_Employee(scan.next(), scan.nextInt(), scan.nextInt());

		System.out.println("Enter the details of second employee");
		Q7_Employee e2 = new Q7_Employee(scan.next(), scan.nextInt(), scan.nextInt());

		e1.compareEmpSalary(e1, e2);

	}
}
