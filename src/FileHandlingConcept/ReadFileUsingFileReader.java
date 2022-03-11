package FileHandlingConcept;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

	public static void main(String[] args) {


		// Read the file using  FileReader
		
		String path = "C:\\Users\\dinne\\Downloads\\File Handles\\aajay.txt";
		FileReader fr = null;
		
		try {
			fr = new FileReader(path);
			System.out.println("File content is: ");
			
			int c=0;
			while((c = fr.read()) != -1) {
				System.out.print((char)c);
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
