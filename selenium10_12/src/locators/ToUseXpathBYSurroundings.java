package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathBYSurroundings {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
	    Thread.sleep(3000);
	    driver.findElements(By.xpath("//span[text()='Analog Clock']/../..//button[@tabindex='0']"));  
		

	}

}
