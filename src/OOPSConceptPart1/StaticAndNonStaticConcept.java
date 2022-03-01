package OOPSConceptPart1;

public class StaticAndNonStaticConcept {
	
	// global vars: the scope of global vars will be available across all the functions with some condition.
	
	String name = "Aajay"; // non static global varble
	static int age = 26;  // static global variable
	
	
	public static void main(String args[]) {

		// how to call static method and vars??
		// 1.direct calling
		sum();
		// 2.calling by classname
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		
		
		// how to call non static method and vars???
		// by using object reference varible.
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		// can i call static methods using object reference ? yes
		obj.sum(); // warning will be given
	}
	
	public void sendMail() { // non static method
		System.out.println("send mail method");
	}
	
	public static void sum() { //  static method
		System.out.println("sum method");
	}
	
	
	
	
}	
