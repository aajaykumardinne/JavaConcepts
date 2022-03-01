package JavaBasics;

public class ConstructorConcept {

	// Constructor def: a class entity which is used to define some class features while creating the object.
	// global variables
	// class variables: instance vars
//	String name;
//	int age;
		
	
	// we can overload  the constructor
	// There is hidden construcutor for the default constructor
	public ConstructorConcept() {  // 0 parameter
		System.out.println("Default Constructor");
	}
		
	public ConstructorConcept(int i) {  // 1 parameter
		System.out.println("single parameter Constructor");
		System.out.println("the value of i: "+i);
	}
	
	public ConstructorConcept(int i, int j) {  // 2 parameters
		System.out.println("2 parameters  Constructor");
		System.out.println("the value of i: "+i);
		System.out.println("the value of j: "+i);
		System.out.println(i + " "+ j);
	}
	
//	public ConstructorConcept(String name, int age) {
//		this.name = name; // this.classvar = localvar;
//		this.age = age;
//	
////		name = name1;
////		age = age1;
//	}

	public static void main(String[] args) {

		// how to call the constructor : by creating the object.
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(20,30);
//		ConstructorConcept obj3 = new ConstructorConcept("Aajay",26);
//		
//		System.out.println(obj3.name);
//		System.out.println(obj3.age);
		

	}

}
