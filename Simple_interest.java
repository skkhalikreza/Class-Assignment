// Simple Interest 
package Basic_programs;

import java.util.Scanner;

public class Simple_interest {
	public static void main(String[] args) {
		float pa, time, rate, si;
		Scanner sc = new Scanner(System.in); // user input
		System.out.println("Enter the principle amount:");
		pa = sc.nextFloat();
		System.out.println("Enter the Rate:");
		rate = sc.nextFloat();
		System.out.println("Enter the time:");
		time = sc.nextFloat();
		si = pa * time * rate / 100; // Simple iterest formula is = Pa*Time*Rate/100
		System.out.println("The Simple interest is:" + si);

	}

}
