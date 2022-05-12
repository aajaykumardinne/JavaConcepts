package BasicProgrammingQuestions;

public class ArmstrongNumber {

	// 153
	// 1*1*1 = 1
	// 5*5*5 = 125
	// 3*3*3 = 27
	// 1 + 125 + 7 = 153
	// 407 = 4*4*4 + 0 + 7*7*7 = 407
	// 0
	// 1 = 1*1*1
	// 370,371

	public static void isArmstrongNumber(int num) {

		int cube = 0;
		int r;
		int temp;

		temp = num;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}

		if (temp == cube) {
			System.out.println("is a Armstrong number");
		} else {
			System.out.println("is not a Armstrong number");
		}
		

	}

	public static void main(String[] args) {
		isArmstrongNumber(153);

	}

}
