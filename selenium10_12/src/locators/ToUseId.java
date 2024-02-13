package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseId {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.id("email")).sendKeys("sindhuviji176@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.id("pass")).sendKeys("balaganesh");

	}

}
