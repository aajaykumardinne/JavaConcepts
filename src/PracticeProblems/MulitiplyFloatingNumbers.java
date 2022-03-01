package PracticeProblems;

public class MulitiplyFloatingNumbers {

	public static void main(String[] args) {

		MulitiplyFloatingNumbers mf = new MulitiplyFloatingNumbers();
		
//		float r = mf.multiplyNumbers();
		
		System.out.println("Multiplication of two floating point numbers: "+mf.multiplyNumbers());
		
		
	

	}

	
	public float multiplyNumbers(){
		
		// float is a primitive data type which represents the fractional numbers.
		float d1=5f;
		float d2=5.5f;
		
		float mul = d1*d2;
		
		return mul;
		
	}
}
