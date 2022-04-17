package BasicProgrammingQuestions;

public class PrimeNumber {

	// 2 is the lowest prime number
	//3
	public  static boolean isPrimeNumber(int num)
	{
		//edge/corner cases
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	// print all the numbers upto a given number
	public static void getPrimeNumber(int num) {
		for(int i=2 ; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i + " ");
			}
			
		}
	}
	public static void main(String[] args) {

		// prime number : divisible by 1 and itself
		// 13: 13/13, 13/1 - prime
		// 4 : 4/2  -- not prime
		
		
		System.out.println("15 is prime number: " +isPrimeNumber(15));
		System.out.println("23 is prime number: " +isPrimeNumber(23));
		System.out.println("67 is prime number: " +isPrimeNumber(67));
		
		getPrimeNumber(7);

	}

}
