package piyushS;

public class Q3_Employee {

	String empId;
	String empName;
	int salary;

	Q3_Employee(String empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;

	}

	void detailsOfEmployee() {

		System.out.println("Employee's name is " + empName + ", ID is " + empId + " and Salary is " + salary);

	}

}
