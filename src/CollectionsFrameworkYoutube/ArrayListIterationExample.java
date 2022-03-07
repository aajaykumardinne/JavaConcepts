package CollectionsFrameworkYoutube;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterationExample {

	public static void main(String[] args) {
		
		
		ArrayList<String>  ar = new ArrayList<String>();
		ar.add("Vimal"); //0
		ar.add("Sakshi"); //1
		ar.add("Rathod"); // 2 
		ar.add("Rahul"); //3
		
		// typical for each loop
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

		
		// for each loop 
		// (String) type of data you have in the ArrayList:
		// ar is the reference variable name
		System.out.println("-------------");
		for(String  s: ar) {
			System.out.println(s);
		}
		
		
		// JDK 8 - streams with lambda
		System.out.println("-------------");
		ar.stream().forEach(ele -> System.out.println(ele));
		
		
		// iterator
		System.out.println("-------------");
		Iterator<String> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
	}

}
