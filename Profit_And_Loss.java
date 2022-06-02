//Calculate The Profit And Loss:

package Basic_programs;

import java.util.Scanner;

public class Profit_And_Loss {

	public static void main(String[] args) {
		float cp, sp, p; //
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the cost of price:");
		cp = sc.nextFloat();

		System.out.println("Enter the sellingt of price:");
		sp = sc.nextFloat();

		if (sp > cp) {

			p = sp - cp;
			System.out.println("The Profit is: " + p);
		} else if (cp > sp) {
			p = cp - sp;
			System.out.println("The Loss is:" + p);

		} else
			System.out.println("No Profit No Loss");
	}
}
