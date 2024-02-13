package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseEnumininstagram {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		    
		    
		    
		  driver.get("https://www.instagram.com/");
		  Thread.sleep(3000);
		  WebElement name = driver.findElement(By.name("username"));
		  name.sendKeys("Sindhu",Keys.CONTROL+"a");
		  name.sendKeys(Keys.CONTROL+"c");
		  WebElement pass = driver.findElement(By.name("password"));
          pass.sendKeys(Keys.CONTROL+"v");
	}

}
