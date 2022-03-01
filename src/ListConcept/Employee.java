package ListConcept;

public class Employee {

	
	String name;   // global vars
	int age;
	String dept;
	
	Employee(String name, int age,String dept){
		this.name = name; // this.global var = local var 
		this.age = age;
		this.dept = dept;
	}
	
}
