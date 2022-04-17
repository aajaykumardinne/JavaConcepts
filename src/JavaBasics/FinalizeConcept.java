package JavaBasics;

// Revised
public class FinalizeConcept {

	// finalize: is a Method
	// finalize is called before an object is garbage collected.
	// You rarely need to override it.
	 
	public void finalize() {
		System.out.println("finalize method");

	}

	public static void main(String[] args) {

		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();

		f1 = null;
		f2 = null;
		// Garbage collector will destroy the objects , when then is no
		// object reference variables.

		System.gc();  // calling the garbage collector

	}

}
