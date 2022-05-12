package JavaBasics;

public class StringConcept {

	// string is immutable why -->> we can not change the value of variable
	// references.
	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";
		s2 = "TestNG";
		String s3 = "Selenium";

		System.out.println(s1);
		System.out.println(s2);

	}

}
