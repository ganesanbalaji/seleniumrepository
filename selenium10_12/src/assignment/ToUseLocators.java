package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseLocators {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.navigate().to("https://demowebshop.tricentis.com/"); 
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Register")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("gender-female")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("FirstName")).sendKeys("sindhu");
		 Thread.sleep(1000);
		 driver.findElement(By.id("LastName")).sendKeys("balu");
		 Thread.sleep(1000);
		 driver.findElement(By.id("Email")).sendKeys("Sindhu176@gmail.com");
		 Thread.sleep(1000);
		 driver.findElement(By.id("Password")).sendKeys("balu123");
		 Thread.sleep(1000);
		 driver.findElement(By.id("ConfirmPassword")).sendKeys("balu123");
		 Thread.sleep(1000);
		 driver.findElement(By.id("register-button")).click();
		 Thread.sleep(1000); 
		 driver.close();
		 
	


		
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}

