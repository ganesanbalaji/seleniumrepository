package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMoveByOffset {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
	    driver.findElement(By.id("password")).sendKeys("12346789");
	    Actions action = new Actions(driver);
	    
	    action.moveByOffset(1215, 302).perform();

	}

}
