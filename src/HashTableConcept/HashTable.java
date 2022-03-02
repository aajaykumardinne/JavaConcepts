package HashTableConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {

		// it is similar to hashmap , but it is synchronised
		// stores the data on the basis of key-value pair.
		// Object is used as a key ,and the value we want to associate to that key.
		// The key is then hashed, and the resulting hash code is
		// used as the index at which the value is stored within the table.

		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(3, "Test");
		h1.put(4, "Java");

		// create a clone copy/ shallow copy:
		Hashtable h2 = new Hashtable();

		h2 = (Hashtable) h1.clone();

		System.out.println("the values of h1: " + h1);
		System.out.println("the values of h2: " + h2);

		h1.clear();
		System.out.println("the values of h1: " + h1);
		System.out.println("the values of h2: " + h2);
		
		
		// contains value:
		
		Hashtable st = new Hashtable();
		st.put("A", "Selenium");
		st.put("B", "TestNg");
		st.put("C", "Git");
		
		
		if(st.containsValue("Git"))
			System.out.println("value is found");
		
		// print all the values from hashtable using -- Enumeration -- elements()
		Enumeration en = st.elements();
		System.out.println("print values from st using Enumeration");
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
			
		
		
		// get all the values from hashtable using --- entrySet() --- set of hashtable values
		Set s = st.entrySet();
		System.out.println(s);
		
		
		Hashtable st1 = new Hashtable();
		st1.put("A", "Selenium");
		st1.put("B", "TestNg");
		st1.put("C", "Git");
		st1.put("C", "Git"); // it contains only unique values
		// no null key and null values
//		 st1.put("D" , null);  // null pointer exception
		
		
		System.out.println("values from st1:" +st1);
		
		
		// check both the hashtables are equal or not:
		if(st.equals(st1))
			System.out.println("both are equal");
		
		
		
		// get the value from a key:
		System.out.println(st1.get("C"));
		
		
		// get the hashcode of hashtable object
		System.out.println("the hash code value of st1:" + st1.hashCode());
		
		// generics
				Hashtable<String, String>   st3 = new Hashtable<String, String>();
		

	}

}
