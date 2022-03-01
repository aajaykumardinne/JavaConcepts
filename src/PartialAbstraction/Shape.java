package PartialAbstraction;

public abstract class Shape {
	
	public Shape() {
		System.out.println("Shape class constructor");
	}
	
	// Abstraction
	// can not create the object of abstract class or interface.
	// having abstract and non abstract methods is called the partial abstraction.
	// having only non-abstract methods is called the  zero percent abstraction.
	// having only abstract methods  is called the 100% abstraction.
	// 0-100% is achieved in the abstract class.
	
	int color;
	 
	abstract void drawing();   // abbstract method --- no method body 
	
	
	public void fill() {      // non abstract  method 
		
		System.out.println("Shape -- fill");
	}

	
	

}
