package OOPSConceptPart2;

public class HSBCBank implements USBank,BrazilBank{ // we are achieving mutiple inheritance
	// Is-a relationship
	
	// If a class is implementing any interface , then its mandatory to define/ override all the methods of Interface.
	// overriding from USBank
	public void credit() {
		System.out.println("hsbc--credit");
	}

	
	public void debit() {
		System.out.println("hsbc---debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc--transferMoney");
	}
	
	// seperate methods of HSBCBank class
	public void educationLoan() {
		System.out.println("hsbc--edu loan");
	}
	
	public void carLoan() {
		System.out.println("Car Loan");
		
	}
	
	
	//brazil bank method : overriding from BrazilBank
	public void mutualFund() {
		System.out.println("hsbc --mutual fund");
	}
}
