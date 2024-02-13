package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheSizeOfBrowser {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
         Dimension Sizeofbrowser = driver.manage().window().getSize();
		 System.out.println(Sizeofbrowser);
		 System.out.println(Sizeofbrowser.getWidth());
		 System.out.println(Sizeofbrowser.getHeight());
				 

	}

}
