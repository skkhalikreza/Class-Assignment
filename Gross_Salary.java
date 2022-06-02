//Calculate Gross Salary

package Basic_programs;

import java.util.Scanner;

public class Gross_Salary {

	static double bs, hra, da, gs; // Variable

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary:");
		bs = sc.nextDouble();

		// Calaute gross when bs <10000
		if (bs <= 10000) {
			hra = (bs * 20) / 100;
			da = (bs * 80) / 100;
			gs = bs + hra + da;

		}
		// Calaute gross when bs =>10000 and <20000
		else if (bs >= 10001 && bs < 20000) {
			hra = (bs * 25) / 100;
			da = (bs * 90) / 100;
			gs = bs + hra + da;

			// Calaute gross when bs >=20001
		} else if (bs >= 20001)

			hra = (bs * 30) / 100;
		da = (bs * 90) / 100;

		gs = bs + hra + da;
		System.out.println("The Gross salary is " + gs);

	}

}
