package ListConcept;

public class Employee {

	// Revised
	String name; // class vars
	int age;
	String dept;

	public Employee(String name, int age, String dept) {
		this.name = name; // this.class var = local var
		this.age = age;
		this.dept = dept;
	}

}
