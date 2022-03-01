package OOPSConceptPart1;

public class LocalVsGlobalVariables {
	
	// global variables -- class variables
	String name = "Aajay";
	int age = 26;
	
	public static void main(String args[]) {
		
		int i = 10; // local variables for the main method 
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new  LocalVsGlobalVariables();
		System.out.println(obj.name);
		
    }	
	
	public void sum() {
		
		int i = 23; // local variables for the sum method
		int j = 45;
		int age = 25;
		
	}
}
