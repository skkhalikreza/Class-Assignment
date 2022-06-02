//Permeter Rectangle

package Basic_programs;

import java.util.Scanner;

public class Permeter_Rectangle {
	public static void main(String[] args) {
		float p, w, l;

		Scanner sc = new Scanner(System.in); // for user input
		System.out.println("Enter length");
		l = sc.nextFloat();
		System.out.println("Enter  width");
		w = sc.nextFloat();
		p = 2 * (l + w); // Formula of Permeter Rectangle
		System.out.println("The Permeter Rectangle:" + p);
	}

}
