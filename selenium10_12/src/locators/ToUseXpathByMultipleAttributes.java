package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByMultipleAttributes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit'  and @  value='Search']")).click();
		

	}

}

