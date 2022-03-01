package AbstractionConcept;

public abstract class Bank {
	
	int amount = 100;
	final int rate = 10;
	static int loanRate = 5;
	
	// partial abstraction
	// hiding the implementation logic is called Abstraction(OOPS Concept)
	// abstract class can have abstract methods and non-abstract methods.
	// use abstract keyword.
	// can not create the object of abstract class.
	
	
	public abstract void loan();  // abstract method --- no method body
	
	// non abstract methods 
	public void credit() {
		System.out.println("Bank -- Credit");
	}

	
	public void debit() {
		System.out.println("Bank --- Debit");
	}


	
}