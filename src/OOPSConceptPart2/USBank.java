package OOPSConceptPart2;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	
	// only method declaration
	// no method body -- only method prototype
	// in interface , we can declare the variables , vars are default static in nature
	// vars value will not be changed
	// no static method in Interface.
	// no main method in Interface.
	// we cannot create the object of method in Interface.
	// Interface is abstract in nature.
	

}
