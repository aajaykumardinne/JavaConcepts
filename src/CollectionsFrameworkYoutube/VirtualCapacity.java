package CollectionsFrameworkYoutube;

import java.util.ArrayList;

public class VirtualCapacity {

	// Revised
	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<Object>(20);
		// virtual capacity of ArrayList is 10 by default
		// default capacity = 10
		// virtual capacity is assigned to the ArrayList within the memeory.
		
		System.out.println(ar.size());  // physical capacity or actual size is 0
		
		ar.add(144);
		
		System.out.println(ar.size());  // PC = 1
		
		ar.add(400);
		ar.add(500);
		ar.add(600);
		
		System.out.println(ar.size());  // PC =4
		
		

	}

}
