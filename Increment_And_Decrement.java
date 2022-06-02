package Basic_programs;

public class Increment_And_Decrement {

	public static void main(String[] args) {
		// Pre increment
		int x=10,y;
		y=++x;
		System.out.println("x:"+x);
		System.out.println("Y:"+y);
		
		
//		Pre decrement
		int a=10,b;
		b=--a;
		System.out.println("A:"+a+ "B:"+b);
		
//		Post Increment
		
		int p=10,q;
		q=p++;//1st p value will assign i q, then q will increment p+1=>10+1=> p=11
		System.out.println("P:"+p+" "+"Q:"+q);
		
//		Pre decrement
		
		int s=10,k;
		k=s--; //1st p value will assign i k, then s will deccrement s+1=>10-1=> s=9
		System.out.println("S:"+s+" "+"K:"+k);// s=9 k=10

	}

}
