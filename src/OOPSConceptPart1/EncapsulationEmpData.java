package OOPSConceptPart1;

public class EncapsulationEmpData {

	// Revised
	
	// how to implement Encapsulation
	// no one from outside the class can access the variables directly.
	// Encapsulation is also called as data hiding.
	// hiding the variables by declaring as private
	// Encapsualation is a part of OOPS Concept
	// PIE concepts ---- Polymorphism, Inheritance , Encapsulation.

	// Definition:
	// Encapsulation is the technique of making the fields in a class private 
	// and providing access to the fields via public methods.
	
	// 1.private data variables :
	// so that these variables can not be accessed directly from
	// outside the class.
	
	private int ssn;
	private String empName;
	private int empAge;

	public static void main(String[] args) {

		EncapsulationEmpData emp = new EncapsulationEmpData();
		emp.setEmpName("Aajay Kumar Dinne");
		emp.setSsn(4567);
		emp.setEmpAge(26);

		System.out.println("Employee name is:" + emp.getEmpName());
		System.out.println("");

	}

	// 2. public getter and setter methods :
	// to set and get the values of the private variables
	// not complusory to use when private varibales are declared.

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
		// this.global variables = local variables
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
