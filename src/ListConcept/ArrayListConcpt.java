package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcpt {

	public static <E> void main(String[] args) {
	
	int a[] = new int[3]; // static array --- size is fixed
	
	
	// dynamic array --- Array List
	// 1. can contain duplicate values/elements
	// 2. maintains insertion order.
	// 3. Not Synchronized ---- not thread safe.
	// 4. allows random access to fetch the elements because it stores the values on the basis of indexes.
	// 5. Can store different class objects.
	
	ArrayList ar = new ArrayList();
	
	ar.add(10); // 0
	ar.add(20); // 1
	ar.add(30); // 2
	
	System.out.println(ar.size());
	
	ar.add(40); // 3
	ar.add(50); // 4
	ar.add(50); // 5
	
	System.out.println(ar.size());  // size of an array list
	
	System.out.println(ar.get(5)); // to get the value from an index
	
	// to print all the values from arraylist
	// 1.for loop
	// 2.using iterator.
	
	for(int i=0; i<ar.size();i++) {
		System.out.println(ar.get(i));
	}
	
	
	// non-generic v/s generic
	ArrayList<Integer> ar1 = new ArrayList<Integer>(); // defining the generics
	ar1.add(350);
	// ar1.add("Selenium WebDriver");
	
	ArrayList<String>  str1 = new ArrayList<String>();
	str1.add("Java");
	str1.add("Automation QA");
	
	ArrayList<E> ar3 = new ArrayList<E>();
	
	// Employee class objects
	Employee e1 = new Employee("Aajay", 26,"QA");
	Employee e2 = new Employee("Tom", 27,"Dev");
	Employee e3 = new Employee("Peter", 28,"Admin");
	
	// create ArrayList
	
	ArrayList<Employee>  ar4 = new ArrayList<Employee>();
	ar4.add(e1);
	ar4.add(e2);
	ar4.add(e3);
	
	// iterator to traverse the values:               
	Iterator<Employee> it = ar4.iterator();
	while(it.hasNext()) { // in this iterator next value is available  
		Employee emp = it.next();    
//		it.next() --- refers to the employee reference variables                         
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
	}
	
	
	
	System.out.println("*********************");
	
	
	// addAll() ---> add the elements to the specific array list 
	ArrayList<String> ar5 = new ArrayList<String>();
	ar5.add("test");
	ar5.add("selenium");
	ar5.add("QTP");
	
	ArrayList<String> ar6 = new ArrayList<String>();
	ar6.add("dev");
	ar6.add("java");
	ar6.add("JavaScript");
	
	
	ar5.addAll(ar6);
	
	for(int i=0; i<ar5.size();i++) {
		System.out.println(ar5.get(i));
	}
	
	
	
	System.out.println("*********************");
	
	// removeAll --->> removes the elements in the specific array list
	ar5.removeAll(ar6);
	for(int i=0; i<ar5.size();i++) {
		System.out.println(ar5.get(i));
	}
	
	
	
	
	System.out.println("*********************");
	
	//retainAll       ---->> returns the elements which are common in the specific arraylist
	ArrayList<String> ar7 = new ArrayList<String>();
	ar7.add("test");
	ar7.add("selenium");
	ar7.add("QTP");
	
	
	ArrayList<String> ar8 = new ArrayList<String>();
	ar8.add("test");
	ar8.add("Java");
	
	ar7.retainAll(ar8);
	for(int i=0; i<ar7.size();i++) {
		System.out.println(ar7.get(i));
	}
	
	
	}	
	
	
}
