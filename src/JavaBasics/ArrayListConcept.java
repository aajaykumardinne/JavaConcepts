package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static  void main(String[] args) {

		ArrayList ar = new ArrayList();
		
		ar.add(200); // 0
		ar.add(500); // 1
		ar.add(600); // 2 
		
		System.out.println(ar.size());
		
		ar.add(900);  // 3
		ar.add(1000); // 4
		
		
		System.out.println(ar.size());
		
		
		ar.add("Aajay");  // 5
		ar.add("Dinne");  // 6
		ar.add(12.54); // 7 
		ar.add('M');   // 8
		ar.add("Aajay"); //9
		
		System.out.println(ar.size());
		ar.remove(8);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(5));
//		System.out.println(ar.get(9));
		
		
		
		// to print all the values of array list : use for loop
		for(int i=0;i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		
		ArrayList<Integer> ar1 = new ArrayList();
		ar1.add(35);
//		ar1.add("Maa");
	
		ArrayList<String>   ar2 = new ArrayList();
		ar2.add("Aajay");
	
		
		
		
		
		
		
	}

}
