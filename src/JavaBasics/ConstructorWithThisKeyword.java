package JavaBasics;

public class ConstructorWithThisKeyword {

	// class or global variables
	String name = "Aajay";
	int age;

	public ConstructorWithThisKeyword(String name, int age) {

		// this keyword is used to iniatilize the class variables in the constructor
		this.name = name;
		this.age = age;

		System.out.println(name);
		System.out.println(age);

	}

	public static void main(String[] args) {

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 30);

	}

}
