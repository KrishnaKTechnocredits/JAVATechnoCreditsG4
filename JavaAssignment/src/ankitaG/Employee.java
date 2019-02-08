package ankitaG;
//Q3 from calss and object section
public class Employee {
	int empId;
	String empName;
	float salary;	
	Employee(int empId,String empName,float salary)
	{
		this. empId=empId;
		this. empName=empName;
		this. salary=salary;	
	}
	void diplay()
	{
		System.out.println("Id of employee is "+empId+" Name of employee is "+ empName+ " salary of employee is "+ salary);
	}

}
