package OOPSConceptPart1;

public class EncapsulationEmpData {
	
	// how to implement Encapsulation
	// Encapsulation is also called as data hiding.
	// Encapsualation is a part of OOPS Concept
	// PIE concepts ---- Polymorphism, Inheritance , Encapsulation.
	
	

	// 1.private data variables : so that these variables can not be accessed directly from outside the class.
	private int ssn;
	private String empName;
	private int empAge;
	
	
	
	public static void main(String[] args) {

		EncapsulationEmpData  emp = new EncapsulationEmpData();
		emp.setEmpName("Aajay Kumar Dinne");
		emp.setSsn(4567);
		emp.setEmpAge(26);
		
		System.out.println("Employee name is:" + emp.getEmpName());
	    System.out.println("");
		
		


	}



	// 2. public getter and setter methods : to set and get the values of the variables.
	
	public int getSsn() {
		return ssn;
	}



	public void setSsn(int ssn) {
		this.ssn = ssn;
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
