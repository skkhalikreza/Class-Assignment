// Count Number of Variable

package Basic_programs;

import java.util.Scanner;

public class Count_number_of_veriable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, count = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		num = sc.nextInt();

		for (; num > 0;) {
			count++;
			num = num / 10;
		}
		System.out.println("NO of digits" + count);
	}

}
