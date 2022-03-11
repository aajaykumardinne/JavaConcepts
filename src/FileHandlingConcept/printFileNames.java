package FileHandlingConcept;

import java.io.File;
import java.util.Arrays;

public class printFileNames {

	public static void main(String[] args) {
		
		
		String path = "C:\\Users\\dinne\\Downloads";
		
		
		File file = new File(path);
		
		File[] downloadDir = file.listFiles(); 
		// listFiles() -- method in File class return total number of files and directories  in a particular  path
		
		Arrays.sort(downloadDir);
		
		for(File e : downloadDir) {
			if(e.isFile()) {
				System.out.println("File : " + e.getName() + " " + e.getAbsolutePath());
			}
			
			else if(e.isDirectory()) {
				System.out.println("Directory : " + e.getName());
			}
			
			else {
				System.out.println("Not known : " + e.getName());
			}
		}

	}

}
