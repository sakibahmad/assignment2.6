//           TO CHECK NUMBER
package session2c;

import java.util.Scanner;

public class demo {

	@SuppressWarnings("resource")
	public void nos() {
		double a;
		// USER INPUT BY IMPORT SCANNER CLASS
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number");
		a = obj.nextDouble();
		// CONDITION FOR A NUMBER TO BE
		if (a == 0)
			System.out.println("you entered ZERO ");
		else if (a > 0)
			System.out.println(" you have entered  positive number");
		else
			System.out.println("you have entered a  negative value");

	}

}
