
package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandlePopupinSkyscanner {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		
		driver.get("https://www.skyscanner.co.in/");
	    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(12));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("\"//span[text()='Depart']\"")));
	    for(;;) {
	    	try {
			driver.findElement(By.xpath("/h2[text()='September']/..//button[@aria-label='Tuesday, 17 September 2024. Select as departure date']")).click();
		    break;
	    	}
	    	catch(Exception e) {
	    		driver.findElement(By.xpath("//button[@aria-label='Next month, October']")).click();
	    	}
	    		
	    	}
		driver.quit();

	}

}
