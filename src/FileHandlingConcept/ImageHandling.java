package FileHandlingConcept;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;


import javax.imageio.ImageIO;

public class ImageHandling {

	
	public static void main(String[] args) {
		
		
		// 1. jpg -->> .png/.bmp/..gif files(file conversion).
		
		try {
//			URL url = new URL("https://m.media-amazon.com/images/I/41733yAnlzL._AC_SY200_.jpg");
			
			File file = new File("C:\\Users\\dinne\\Downloads\\bike.jpg");
			BufferedImage image = ImageIO.read(file);
			
			ImageIO.write(image, "jpg", new File("C:\\Users\\dinne\\Downloads\\ref.jpg"));
			ImageIO.write(image, "png", new File("C:\\Users\\dinne\\Downloads\\ref.png"));
			ImageIO.write(image, "bmp", new File("C:\\Users\\dinne\\Downloads\\ref.bmp"));
			ImageIO.write(image, "gif", new File("C:\\Users\\dinne\\Downloads\\ref.gif"));
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
