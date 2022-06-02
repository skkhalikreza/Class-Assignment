//WAP Print natural Numnber from 1 to 10
package Basic_programs;

import java.util.Scanner;

public class Print_Natural_Number {

	public static void main(String[] args) {
		
		int i=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Natural Number:");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			System.out.println(i);
			
		}

	}

}
