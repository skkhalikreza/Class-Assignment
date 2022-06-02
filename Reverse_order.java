//Print Reverse Order 
package Basic_programs;

import java.util.Scanner;

public class Reverse_order {

	public static void main(String[] args) {
		int i = 1, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Natural Number:");
		n = sc.nextInt();

		for (i = n; i >= 1; i--) {
			System.out.println(i);
		}

	}

}
