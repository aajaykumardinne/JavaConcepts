package OOPSConceptPart1;

public class MethodOverloadinng {
	
	public static void main(String args[]) {
		
		MethodOverloadinng obj = new MethodOverloadinng();
		
		obj.sum();
		obj.sum(11, 12);
		
		
		
	}
	
	public static void main(int r) {
		
		
	}

	
	public static void main(int l , int m) {
		
	}
	
	
	// We can overload main method
	
	
	
	// You cannot create a method inside a method.
	// duplicate methods : same method name with the same number of input parameters are not allowed.
	
	
	// Method Overloading  
	// 1.when the method name is same with different arguments or input parameters within the same class.
	// 2.make sure that the input parameters data type is different when the count of parameters is same.
	
	public void sum() { // passing zero parameter
		System.out.println("sum method -- zero parameter");
		sum();
		
	}
	
	public void sum(int i){  // passing 1 parameter
		System.out.println("sum method --- one parameter");
		System.out.println(i);
	}
	
	public void sum(int i, int j){  // passing 2 parameters
		System.out.println("sum method --- two parameters");
		System.out.println(i+j);
	}
	
	
}
