package CollectionsFrameworkYoutube;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer>  numbers = new ArrayList<Integer>(Arrays.asList(1,2,5,8,9,5,6,2,1,2,12,13,15,3,9));
		
		// 1.LinkedHashSet
		
		LinkedHashSet<Integer>  linkedhashset = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> numbersWithoutduplicates = new ArrayList<Integer>(linkedhashset);
		
		System.out.println( numbersWithoutduplicates);
		
		
		// 2. JDK - 8 - with streams
		
		
		ArrayList<Integer>  marksList = new ArrayList<Integer>(Arrays.asList(1,2,5,8,9,5,6,2,1,2,12,13,15,3,9));
		List<Integer> marksUniqueList = marksList.stream().distinct().collect(Collectors.toList());
		
		System.out.println( marksUniqueList );

	}

}
