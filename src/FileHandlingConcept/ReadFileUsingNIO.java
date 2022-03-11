package FileHandlingConcept;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ReadFileUsingNIO {

	public static void main(String[] args) {
		
		// Reading the file using NIO package.
		String path = "C:\\Users\\dinne\\Downloads\\File Handles\\aajay.txt";
		
		try {
			List<String> li = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
			
			Iterator<String> it = li.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
