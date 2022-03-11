package FileHandlingConcept;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

// Create A File in Java using
// 1. File
// 2. FileOutputStream
// 3. Java NIO utils

public class CreateFile {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\dinne\\Downloads\\File Handles\\sample.txt";
		
		// 1. using File:
		File file = new File(path);
		try {
			boolean flag = file.createNewFile();
			if(flag) {
				System.out.println("file is created");
				
			}
			else {
				System.out.println("file is already created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2. FileOutputStream along with the Scanner:
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the file name with location path: ");
		String fileName = sc.nextLine();
		
		FileOutputStream fos = new FileOutputStream(fileName, true);
		
		System.out.println("Enter the file content:");
		String content = sc.nextLine();
		
		
		byte[] b = content.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("File is saved on the given location path");

		}
		
		catch(Exception e) {
			System.out.println("Some Exception is coming");
			e.printStackTrace();
		}
		
		
		// 3. Java nio package:
		try {
		Path pathLocation = Paths.get("C:\\Users\\dinne\\Downloads\\File Handles\\newfile.txt");
		Path newPath = Files.createFile(pathLocation);
		System.out.println("New File is created : " + newPath);
	}

		catch(Exception e){
			System.out.println("Some Exception is coming...");
			e.printStackTrace();
		}
	}
}
