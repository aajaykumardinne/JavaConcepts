package OOPSConceptPart2;

public class BMW  extends Car{ // "has-a-relationship"
	
	
	// When same method is present in parent class as well as in the child class with the same name and same number of arguements.
	// is called Method-Overriding
	
	public void start() { //overridden method
		System.out.println("BMW-- start");
	}

	
	public void theftSafety() {
		System.out.println("BMW--theftsafety");
	}
	
	
}
