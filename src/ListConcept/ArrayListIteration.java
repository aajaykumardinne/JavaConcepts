package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");

		// 1. using java jdk 8 with for each loop and lambda expression:

		System.out.println("---------print using for each with lambda in java jdk 8-----------");
		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});

		// 2. Using Iterator:
		System.out.println("---------print using iterator-------------");
		Iterator<String> it = tvSeries.iterator();
		while (it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}

		// 3. using iterator and java jdk 8 and forEachRemaining() Method
		System.out.println("---- print using iterator and java jdk 8 and forEachRemaining() Method");

		it = tvSeries.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		}); 
		
		// 4. using for each loop:
		System.out.println("-----print using for each loop");
		for (String show : tvSeries) {
			System.out.println(show);
		}
		
		// 5. using for loop with order/index:
		System.out.println("---- print using for loop with order/index");
		for(int i=0; i<tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}
		
		
		// 6. Using a listIterator() to traverse in both the directions:
		System.out.println("----print Using a listIterator() to traverse in both the directions---");
		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIterator.hasPrevious()) {
			String show = tvSeriesListIterator.previous();
			System.out.println(show);
		}
		
	}

}
