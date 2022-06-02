//Print Maximum value

package Basic_programs;

public class Maximum_Value {

//	non static method, find out max number 

	public void maxvalue(int x, int y) {

//		chaking x is greater or not
		if (x > y)
			System.out.print(x + "is greater");
		else
			System.out.println(y + "is greater");
	}

	public static void main(String[] args) {
		// object creation/class instantiation
		Maximum_Value obj = new Maximum_Value();
		System.out.println(obj);

		// invoke the method
		obj.maxvalue(30, 20);

		// widering type casting,implicitly
		int a = 10;
		float b = a;
		System.out.println(b);

		// narrowing type casting,explicitely
		float x = 10.00f;
		int y = (int) x;
		System.out.println();

	}

}
//class name has to be camelcase: starting alphabet will be capital
//variable name should match with value,mixedcase studentName,studentId
//method: nextInt()
//main method has to be clean,much code u cant write under main
//always use comments in your code