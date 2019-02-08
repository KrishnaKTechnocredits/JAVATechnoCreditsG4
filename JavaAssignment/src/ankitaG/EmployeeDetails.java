package ankitaG;

import java.util.Scanner;

public class EmployeeDetails {
	int empId;
	String empName;
	float salary;	
	EmployeeDetails(int empId,String empName,float salary)
	{
		this. empId=empId;
		this. empName=empName;
		this. salary=salary;
	}
	void display(EmployeeDetails e1, EmployeeDetails e2)
	{
		if(e1.salary>e2.salary)
		{
			System.out.println("max salary  is "+ e1.salary);
			System.out.println("Details of employee having maximum salary is: "+"employee id- "+ e1.empId+","+"Name- "+ e1.empName+","+"salary- "+e1.salary);
		}
		else
		{
			System.out.println("max salary employee is "+e2.salary);
			System.out.println("Details of employee having maximum salary is: "+"employee id- "+ e2.empId+","+"Name- "+ e2.empName+","+"salary- "+e2.salary);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter details of e1");		
		EmployeeDetails ed1= new EmployeeDetails(sc.nextInt(),sc.next(), sc.nextFloat());
		System.out.println("enter details of e2");
		EmployeeDetails ed2= new EmployeeDetails(sc.nextInt(),sc.next(), sc.nextFloat());
		ed1.display(ed1, ed2);
		sc.close();
	}

}
