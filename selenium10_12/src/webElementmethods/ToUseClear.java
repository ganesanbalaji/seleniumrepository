package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClear {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(3000);
	    WebElement Usernametext = driver.findElement(By.id("username"));
	    Usernametext.clear();
	    Usernametext.sendKeys("sindhu");

	}

}
