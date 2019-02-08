package ankitaG;

import java.util.Scanner;
//client class of employee class
public class TestEmployee {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter employee details as id, nam, salary");
		Employee employee= new Employee(scanner.nextInt(),scanner.next(),scanner.nextFloat());
		employee.diplay();
		scanner.close();
	}

}
