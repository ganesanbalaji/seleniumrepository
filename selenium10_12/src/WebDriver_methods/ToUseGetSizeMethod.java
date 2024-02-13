package WebDriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://skillrary.com/");
		Thread.sleep(2000);
		// Dimension sizeofbrowser = driver.manage().window().getSize();
		// System.out.println(sizeofbrowser);
		// System.out.println(sizeofbrowser.getWidth());
		// System.out.println(sizeofbrowser.getHeight());
		 
		 //to setsize
		 //driver.manage().window().setSize(new Dimension(700,1500));
		
		  Point Pos = driver.manage().window().getPosition();
		 System.out.println( Pos);
		 System.out.println(Pos.getX());
		 System.out.println(Pos.getY());
		driver.manage().window().setPosition(new Point(500,700));

	}

}
