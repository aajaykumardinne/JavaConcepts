package JavaBasics;

public class FinalizeConcept {
	
	
	// finalize: is a Method
	// finalize is called when an object is garbage collected. You rarely need to override it.
	public void finalize() {
		System.out.println("finalize method");
		
	}

	public static void main(String[] args) {
		
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();

	}

}
