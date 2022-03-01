package Abstraction;

public class TestBank {

	public static void main(String[] args) {



		// call the constructor by creating the object
		ICICIBank ic = new ICICIBank();
		ic.educationLoan();
		ic.homeLoan();
		ic.carLoan();
		
		ic.debit();
		ic.credit();
		ic.trading();
		ic.transferMoney();
		
		ic.mutualFunds();
		ic.insurance();
		
		System.out.println(USBank.min_bal);
		
		USBank us = new ICICIBank();  
		// us is the reference variable referring to the new ICICIBank() object
		// In Selenium WebDriver driver = new ChromeDriver()  
		// Webdriver is the interface and ChromeDriver is the class
		us.credit();
		us.debit();
		us.trading();
		us.transferMoney();
		
		
		

	}

}
