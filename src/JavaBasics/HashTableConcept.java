package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World!");
		
		System.out.println(h.size());
		
		h.put(1, 400);
		h.put(2, 500);
		
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		h.put(3, 12.44);
		
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		
		h1.put(12, 34);
		
		
		
		
		
		
		
		
		

	}

}
