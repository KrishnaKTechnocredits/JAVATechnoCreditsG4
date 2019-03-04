package pallavi;

import java.util.Scanner;

public class Employee_Q7 
{
	String employeeName;
	int departmentId;
	double salaryOfEmployee;

	public Employee_Q7(String empName, int deptId, double salary) 
	{
		this.employeeName = empName;
		this.departmentId = deptId;
		this.salaryOfEmployee = salary;
	}

	void compareEmpSalary(Employee_Q7 e1, Employee_Q7 e2) 
	{
		System.out.println("Employee who has maximum salary is given below ");
		if (e1.salaryOfEmployee > e2.salaryOfEmployee) 
		{
			System.out.println(e1.employeeName + "," + e1.departmentId + "," + e1.salaryOfEmployee);
		} 
		else 
		{
			System.out.println(e2.employeeName + "," + e2.departmentId + "," + e2.salaryOfEmployee);

		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data for 1st employee");
		Employee_Q7 e1 = new Employee_Q7(sc.next(), sc.nextInt(), sc.nextDouble());
		System.out.println("Enter data for 2nd employee");
		Employee_Q7 e2 = new Employee_Q7(sc.next(), sc.nextInt(), sc.nextDouble());
		e1.compareEmpSalary(e1, e2);
	}
}
