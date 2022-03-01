package JavaBasics;

public class ExceptionHandling {
//	int a = 10;

	// Exception Def--- unwanted beahviour which will terminate the program
	public static void main(String[] args) {

		//uncaught exception
//		int i = 10/0;
//		System.out.println(i);
		
		
		//caught exception
//		Thread.sleep(2000);
				
//		ExceptionHandling obj = new ExceptionHandling();
//		obj = null;
//		System.out.println(obj.a);
		
		
		// 1. try-catch block:
		try {
			int i = 9/0; // this code will throw an exception
		}
		catch(ArithmeticException e){
			e.printStackTrace(); // 
			System.out.println(e.getMessage()); // gives what is the actual exception
		}
		
		
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		
		
	}

}
