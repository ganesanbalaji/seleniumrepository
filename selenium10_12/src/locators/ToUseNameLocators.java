 package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseNameLocators {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("balu@123");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("balu");


	}

}

