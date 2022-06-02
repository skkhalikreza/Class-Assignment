// print Reverse Number user Input

package Basic_programs;

import java.util.Scanner;

public class Reverse_Number {

	public int reverse(int n)// 1234//method for reverse
	{
		int i, r = 0, rem;
		while (n > 0) {
			rem = n % 10;
			r = r * 10 + rem;// 432*10=4320+1=4321
			n = n / 10;// 0
		}
		return r;

	}

	public void checkPalindrome(int num, int rev) {
		if (num == rev) {
			System.out.println("the number is palindrome");

		} else {
			System.out.println("The number is not palindrome");
		}

	}

	public static void main(String[] args) {
		int i, r, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		i = sc.nextInt();// taking input from user
		// temp=i; //we are storing the value for future use
		Reverse_Number fd = new Reverse_Number();
		r = fd.reverse(i);// method call
		System.out.println("Reverse of " + i + " is: " + r);
		// check palindriome or not
		fd.checkPalindrome(i, r);

	}

}
