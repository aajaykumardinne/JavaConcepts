package FileHandlingConcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingInputStream {

	public static void main(String[] args) {
		
		// Read the file using FileInputStream
		String path = "C:\\Users\\dinne\\Downloads\\File Handles\\aajay.txt";
		FileInputStream fip = null;
		try {
			File file = new File(path);
			fip = new FileInputStream(file);
			int c =0;
			while((c = fip.read())!= -1) {
				System.out.print((char)c);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		finally 	{
			try {
				fip.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
