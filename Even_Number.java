//print Even Number
package Basic_programs;

import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) {

		int i, n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Even Numbers: ");
		n = sc.nextInt();

		for (i = 1; i <= n; i++)

			// to check the number is even or not
			// if i%2 is equal to zero, the number is even
			if (i % 2 == 0) {
				System.out.println(i);
			}

	}

}
