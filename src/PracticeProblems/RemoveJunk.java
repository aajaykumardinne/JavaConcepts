package PracticeProblems;

public class RemoveJunk {

	public static void main(String[] args) {


		// how to remove the junk/special characters from a particular String
		String s = "#$%@$%$%@ latin string 01234567890234";
		
		// Regular expressions[^a-zA-Z0-9]
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		
		

	}

}
