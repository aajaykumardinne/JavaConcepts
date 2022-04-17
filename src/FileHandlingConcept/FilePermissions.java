package FileHandlingConcept;

import java.io.File;

public class FilePermissions {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\dinne\\OneDrive\\Desktop\\Covid-19 Test.txt");
		
		file.setExecutable(false);
		file.setReadable(false);
		file.setWritable(true);

		
		System.out.println("Done ---");
		
		
	}

}
