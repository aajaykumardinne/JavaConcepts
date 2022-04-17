package JavaBasics;

public class LoopsConcept {

	//Revised
	public static void main(String[] args) {


		// 1. while loop
		// disadvantage of while loop : it will generate infinite loop if YOU do not give incremental or decremental  part
		
		int i = 0; // initialization
		while(i<=10) {   // conditional 
			System.out.println(i);
			i=i+1;	 // incremental or decremental 
		}

		System.out.println("********************");
		
		
		// j++ means j = j+1
		// 2. for loop
		for(int j=1; j<=10; j++) {   // Initialization , Conditional ,  Incremental or Decremental
			System.out.println(j);
			
		}
		
		
	}

}
