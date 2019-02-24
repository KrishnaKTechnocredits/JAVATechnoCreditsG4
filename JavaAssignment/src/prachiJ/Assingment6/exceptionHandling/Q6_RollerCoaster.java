package prachiJ.Assingment6.exceptionHandling;

import java.util.Scanner;

//A Class that uses user defined exception i.e., Q6_AgeException
public class Q6_RollerCoaster {

	void checkAge() {
		int age;
		System.out.println("Enter Age of customer: ");
		Scanner scanner = new Scanner(System.in);
		age = scanner.nextInt();
		if (age > 12 && age <= 60) {
			System.out.println("Allowed for ride");
		} else if (age <= 12) {
			try {
				throw new Q6_AgeException("You should have come after " + (12 - age) + " years");
			} catch (Q6_AgeException ae) {
				System.out.println(ae.getMessage());
			} finally {
				scanner.close();
			}
		} else if (age > 60) {
			try {
				throw new Q6_AgeException("You should have come before " + (-(59 - age)) + " years");
			} catch (Q6_AgeException ae) {
				System.out.println(ae.getMessage());
			} finally {
				scanner.close();
			}
		}
	}

	public static void main(String[] args) {
		Q6_RollerCoaster rollerCoaster = new Q6_RollerCoaster();
		rollerCoaster.checkAge();
	}
}
