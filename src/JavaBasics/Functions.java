package JavaBasics;

public class Functions {
	
	// REvised

	// main method --->>>> starting point of execution
	public static void main(String[] args) {

		// why main method is void because
		// we never write return statement inside the main method

		Functions obj = new Functions();
		// new Functions() is the object.
		// one object will be created , obj is the reference variable, referring to the object.
		// after creating the object , the copy of all non static methods will be given to the object.
		// Object only holds non-static methods.
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String  m = obj.qa();
		System.out.println(m);
		
		int r = obj.division(6, 3);
		System.out.println(r);
		
		// main method is void --- never returns a value.

	}
	
	// non static methods 

	// void means does not return any value
	public void test() { // no input, no ouput
		
		System.out.println("test method");
		
		
	}
	
	// return type -->> int
	public int  pqr() { // no input , some output
		System.out.println("pqr method");
		int a= 10;
		int b= 20;
		int c=a+b;
		
		return c;
	}
	
	// return type -->> String
	public String qa() {  // no input, some output
		System.out.println("qa method");
		String s = "Selenium";
		
		return s;
	}
	

	// return type -->> int
	// x,y ->>>> input parameters / arguments
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x/y;
		
		return d;
	}
	
	
}
