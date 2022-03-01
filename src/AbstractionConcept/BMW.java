package AbstractionConcept;

public class BMW implements Car{

	@Override
	public void start() {
		System.out.println("BMW -->> START");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW ->>> STOP");
		
	}

	@Override
	public void refuel() {
		System.out.println("BMW ->>> REFUEL");
		
	}
	
	
	// non-overidden methods
	public void theftSafety() {
		System.out.println("BMW ->>> Theftsafety");
	}

}
