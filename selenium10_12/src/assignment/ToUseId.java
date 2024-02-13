package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseId {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://.actitime.com/free-online-trail");
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("sindhu");
		Thread.sleep(1000);
        driver.findElement(By.id("LastName")).sendKeys("ganesan");
        Thread.sleep(1000);
        driver.findElement(By.id("Email")).sendKeys("sindhu@123");
        Thread.sleep(1000);
        driver.findElement(By.id("Company")).sendKeys("dell");
		

	}

}
 