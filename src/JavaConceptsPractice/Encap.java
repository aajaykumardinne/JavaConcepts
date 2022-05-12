package JavaConceptsPractice;

public class Encap {

	// Example of how external user is not able to see the
	// private variables declared in SampleEncapsulation.java program

	public static void main(String[] args) {

		SampleEncapsulation sp = new SampleEncapsulation();

		// set the value and then get the value
		sp.setStudentid(3421);
		int p = sp.getStudentid();
		System.out.println(p);

	}

}
