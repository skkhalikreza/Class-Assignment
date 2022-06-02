//Print 
package Basic_programs;

import java.util.Scanner;

public class Percentage_Grade {
	// non static method,find out percentage and grade
	public void percentageANDGrade(int per) {
		if ((per >= 90) && (per > 100))
			System.out.println(per + "Grade A");

		else if ((per >= 80) && (per < 90))
			System.out.println(per + "Grade B");

		else if ((per >= 70) && (per < 80))
			System.out.println(per + "Grade C");
		else if ((per >= 60) && (per < 70))
			System.out.println(per + "Grade D");
		else if ((per >= 40) && (per < 60))
			System.out.println(per + "Grade E");
		if ((per < 40))
			System.out.println(per + "Grade F ");
	}

	public static void main(String[] args) {
		// declare variables
		int A, B, C, D, E, F, per;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of 6th sub:  ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		E = sc.nextInt();
		F = sc.nextInt();
		per = (A + B + C + D + E + F) / 6;

		System.out.println(+per);

		Percentage_Grade find = new Percentage_Grade();
		// invoking method
		find.percentageANDGrade(per);
	}

}
