package CollectionsFrameworkYoutube;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		// 1. Collections.synchronizedList() - method -- returns the synchronized list
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		
		namesList.add("Java");
		namesList.add("Javascript");
		
		
		// add , remove -- we do not need explicit synchronization.
		
		// to fetch/traverse the values from this list --- we have to use explicit synchronization.
		
		synchronized(namesList) {
			Iterator<String> it = namesList.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
//		Thread Safe Def: There is only one thread working on the  particular object.
		
		// 2. copyOnWriteArrayList --- its a class: thread safe / synchronization ready
		
		CopyOnWriteArrayList<String>  empList = new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Raju");
		empList.add("Pavan");
		
		
		// we do not need explicit synchronization for any operation: add/remove/traverse
		
		Iterator<String> it = empList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
