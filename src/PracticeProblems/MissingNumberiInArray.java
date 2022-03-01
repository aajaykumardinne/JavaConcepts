package PracticeProblems;

public class MissingNumberiInArray {

	public static void main(String[] args) {
		
		// Write the program by following the  basic Mathematics
//		int a[] = {1,2,3,4,5,6,7,8,9,10,............,100};
		//1+2+4+5 = 12
		//1+2+3+4+5 = 15
		// 15 - 12 = 3
		
		// 22
		// 28- 22 = 6
		
		
		int a[] = {1,2,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int i=0; i<a.length ;i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
		
		
		int sum1=0;
		for(int j=1; j<=10;j++) {
			sum1 = sum1 + j;
		}
		
		System.out.println(sum1);
		
		
		System.out.println("Missing number is::: "+(sum1-sum));
		
		
		
		
	}

}
