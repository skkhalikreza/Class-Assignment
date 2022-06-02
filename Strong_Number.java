package Basic_programs;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {

		int i, n, temp, rem, sum = 0, fact; //
		Scanner sc = new Scanner(System.in); // create scanner class
		System.out.println(" Enter  Number: ");

		n = sc.nextInt(); // geting input from user

		temp = n; // holding the input

		while (n > 0) {
			rem = n % 10;
			fact = 1;
			for (i = 1; i <= rem; i++)// calculate factorial
			{
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;
		}
		if (sum == temp)//
			System.out.println("The Number is Strong: ");
		else
			System.out.println("The Number is not Strong: ");

	}

}
