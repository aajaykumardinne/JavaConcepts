package CollectionsFrameworkYoutube;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	// Revised
	public static void main(String[] args) {
		
		
		// ArrayList is the default class in Java.
		// dynamic array
				
//		int i[] = new int[4];
//		to solve the problem of static array we are using the ArrayList
//		i[1] = 12;
//		i[-1] =0;
//		System.out.println(i[-1]);
		
		
		// default generics
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100); //0
		ar.add("Testing"); //1
		ar.add(true); //2 
		ar.add(13.44); //3
		ar.add('r'); //4
		
		System.out.println(ar);
		
		System.out.println(ar.get(2));
//		System.out.println(ar.get(-1));
		
		// add method to add the values
		// get method to get the values
		
		System.out.println(ar.size());
		System.out.println("Lowest Index is: " + 0);
		System.out.println("Highest Index is: " + ar.size());
		
		
		ar.add(300);
		ar.add(400);
		ar.add(800);
		ar.add(900);
		ar.add(1000);
		ar.add(14);
		
		System.out.println(ar.size());
		
		// list with other collection
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		
		
		ArrayList<String>  names = new ArrayList<String>(Arrays.asList("Java", "Python" , "JavaScript" , "C"));
		System.out.println(names);
		System.out.println(names.size());
		
		
		
	}

}
