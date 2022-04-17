package BasicProgrammingQuestions;

public class PalindromeNumber {

	public static void isPalindrome(int num) {

		// 141 243342 789987
		int r = 0;
		int sum = 0;
		int t = 0;

		t = num;

		while (num > 0) {
			r = num % 10; // get the remainder
			sum = (sum * 10) + r;
			num = num / 10;
		}

		if (t == sum) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not a palindrome number");
		}
	}

	public static void main(String[] args) {

		isPalindrome(333);

	}

}
