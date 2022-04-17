package BasicProgrammingQuestions;

public class Factorial {
	
	// factorial of 5 = 5 * 4 * 3 * 2  * 1 = 120
	// factorial of 4 = 4 * 3 * 2 * 1 = 24
	// factorial of 1 = 1
	// factorial of 0 = 1

  //1. without recursion using for loop
	public static int factorial(int num) {
		
		int fact=1;
		if(num==0)
			return 1;
		for(int i=1 ; i<=num; i++) {
			fact = fact * i;
		}
		return fact;
		
	
	}
	
	//2.with recursion - function calling itself.
	public static int factorialnumber(int num) {
		if(num==0)
			return 1;
		else 
			return (num * factorialnumber(num-1));
		
	}
	
	public static void main(String[] args) {
		
	System.out.println(factorial(4));
	System.out.println(factorial(1));
	System.out.println(factorial(5));
	System.out.println(factorial(0));
		
	System.out.println("***");
		
	System.out.println(factorialnumber(3));
	System.out.println(factorialnumber(1));
	System.out.println(factorialnumber(6));
		
		

	}

}
