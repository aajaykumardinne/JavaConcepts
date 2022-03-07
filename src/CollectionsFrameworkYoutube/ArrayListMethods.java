package CollectionsFrameworkYoutube;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {


		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Javascript");
		ar1.add("Python");
		ar1.add("C#");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("testing");
		ar2.add("devops");
		
		
		//addAll()
//		ar1.addAll(ar2);
		
//		System.out.println(ar1);
//		
//		ar1.addAll(3, ar2);
//		
//		System.out.println(ar1);

		//clear() 
//		ar1.clear();
//		System.out.println(ar1);
	
		
		//clone()
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		
		
		//contains()
		System.out.println(ar1.contains("Python"));
		System.out.println(ar1.contains("C#"));
		
		//indexOf()
		System.out.println(ar1.indexOf("C#") >0);
		
		// list with other collection
		ArrayList<String>  list1 = new ArrayList<String>(Arrays.asList("Rahul","Aajay" ,"Kumar", "Aajay" , "Sandeep"));
		System.out.println(list1);
		
		
		int i = list1.lastIndexOf("Aajay");
		System.out.println(i);
		
		
		list1.remove(4);
		System.out.println(list1);
		
		
		list1.remove("Kumar");
		System.out.println(list1);
		
		//removeIf
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		numbers.removeIf(num -> num%2 == 0);
//		System.out.println(numbers);
		
		
		numbers.removeIf(num -> num%2 != 0);
		System.out.println(numbers);
		
		//retainAll
		ArrayList<String>  list2 = new ArrayList<String>(Arrays.asList("Rahul","Aajay" ,"Kumar", "Anil" , "Sandeep"));
		System.out.println(list2);
		
		list2.retainAll(Collections.singleton("Aajay"));
		System.out.println(list2);
		
		
		//subList() - 
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(4, 7));
		System.out.println(subList);
		
		//toArray() -- returns single dimension object array
		ArrayList<String>  list3 = new ArrayList<String>(Arrays.asList("Rahul","Aajay" ,"Kumar", "Anil" , "Sandeep"));
		Object[] arr = list3.toArray();
		
		System.out.println(Arrays.toString(arr));
		
		for(Object o: arr) {
			System.out.println((String)o);
		}
		
		
		
	}

}
