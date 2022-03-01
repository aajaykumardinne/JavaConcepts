package Abstraction;

public interface USBank {

	
	int min_bal = 100;
	
	public  void debit();

	public void credit();

	public void transferMoney();
	
	
	public void trading();

	// no method body , only method declaration is called interface
	// method prototype
	// can not create the 	object of interface
	// no static methods
	// but interface vars are static in nature by default
	// 100% abstraction achieved by the interface
	// Can not have the constructors in the interface.
	// hiding the implementation is called the logic is called the abstractio.
	
	
	
	
}
