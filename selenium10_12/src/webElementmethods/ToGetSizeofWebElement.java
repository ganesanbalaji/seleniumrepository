package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSizeofWebElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
	    Dimension value = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
	    System.out.println(value.getHeight()  );
	    System.out.println(value .getWidth());


	}

}
