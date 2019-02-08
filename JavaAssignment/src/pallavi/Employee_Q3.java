package pallavi;

public class Employee_Q3 
{
	String empid;
	String empName;
	double salary;

	Employee_Q3(String employeeId, String employeeName, double employeeSalary) 
	{
		this.empid = employeeId;
		this.empName = employeeName;
		this.salary = employeeSalary;
	}

	void displayDetailsOfEmployees() 
	{
		System.out.println("Employee whose name is " + empName + " and id is " + empid + " has salary Rs " + salary);
	}
}
