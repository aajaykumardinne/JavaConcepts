package Abstraction;

public class ICICIBank implements RBI,USBank {

	public ICICIBank() {
		System.out.println("ICICI Bank constructor");
	}
	
	
	// USBank Interface
	@Override
	public void debit() {
		System.out.println("icici bank --->>debit");
		
	}

	@Override
	public void credit() {
		System.out.println("icici bank --->>credit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("icici bank --->>transfermoney");
		
	}

	
	
	// RBI Interface
	@Override
	public void educationLoan() {
		System.out.println("icici bank - educationloan");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("icici bank - homeloan");
		
	}

	@Override
	public void carLoan() {
		System.out.println("icici bank - carloan");
		
	}

	@Override
	public void trading() {
		System.out.println("icici bank - trading");
		
	}

	//ICICI Bank class methods
	public void mutualFunds() {
		System.out.println("icici - mutual funds");
	}
	
	
	public void insurance() {
		System.out.println("icici - insurance");
	}
	

}
