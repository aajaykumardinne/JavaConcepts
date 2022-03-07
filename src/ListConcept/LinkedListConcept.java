package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {


		
		LinkedList<String> ll = new LinkedList<String>();
		
		// add:
		ll.add("test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		System.out.println("content of linkedlist: "+ ll);
		//addfirst
		ll.addFirst("Automation");
		//addlast
		ll.addLast("QA");
		
		System.out.println("content of linkedlist:"+ ll);
		
		//get:
		System.out.println(ll.get(4));
		//set:
		ll.set(4, "Maven");
		System.out.println(ll.get(4));
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist: "+ ll);
		
		ll.remove(0);
		
		System.out.println("cotent of linkedlist: "+ ll);
		
		// how to print all the values of a linkedlist:
		// for loop:
		
		System.out.println("****Using for loop****");
		for(int n=0; n<ll.size(); n++) {
			
			System.out.println(ll.get(n));
			
		}
		
	
		// advanced for loop:
		System.out.println("***Using advanced for loop");
		for(String str: ll) {
			System.out.println(str);
		}
		
		
		//iterator
		System.out.println("**** Using iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//while loop
		System.out.println("**** Using while loop");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
		
		
	}

}
