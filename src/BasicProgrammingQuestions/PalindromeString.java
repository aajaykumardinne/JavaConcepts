package BasicProgrammingQuestions;

public class PalindromeString {

	public static void isPalindromeString(String s) {

		String t = s;

		int len = s.length();
		String reverse = "";
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}

		if (t.equals(reverse)) {
			System.out.println("is a palindrome string");
		} else {
			System.out.println("not a palindrome string");
		}
	}

	public static void main(String[] args) {

		isPalindromeString("malayalam");
		isPalindromeString("amma");
		isPalindromeString("xev");

	}

}
