package JavaConceptsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class ArrayListDuplicateMethods {

	public static void main(String[] args) {

		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Aajay", "Kumar", "Dinne", "Aajay"));

		// 1. By using the LinkedList
		LinkedHashSet<String> names = new LinkedHashSet<String>(namesList);

		ArrayList<String> nameswithoutduplicates = new ArrayList<String>(names);

		System.out.println(nameswithoutduplicates);
		
		// 2
		ArrayList<String>  Studentnames = new ArrayList<String>(Arrays.asList("Aajay", "Kumar", "Dinne", "Aajay"));

		System.out.println(Studentnames.stream().distinct().collect(Collectors.toList()));
	}

}
