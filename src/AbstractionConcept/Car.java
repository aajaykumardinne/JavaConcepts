package AbstractionConcept;

public interface Car {
	
	// only final and static variables
	int wheels = 4;
	
	// Always define only abstract methods
	// no method body
	// only method declaration
	// we achieve 100% abstraction
	// cannot create the object of Interface
	
	
	public void start();
	public void stop();
	public void refuel();
	
	
}
