package JavaBasics;

public class StringConcatenation {

//	static String NULL;

	// Revised
	public static void main(String[] args) {


		// ln means line new space
		// println --- is used to print on the console with a new line space
		// print -- is used to print on the console.
		int a= 100;
		int b = 200;
		int o = 500;
		
		System.out.println(a);
		System.out.print(b);
		System.out.println(o);
		
		String x = "Hello";
		String y="World";
		
		double c = 12.33;
		double d = 10.33;
		
		
//     	System.out.println("Hello"+StringConcatenation.NULL);
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println(a+x);
		
		System.out.println("the value of a is:" +a);
		System.out.println("the value of a and b is:" +(a+b));
		

	}

}
