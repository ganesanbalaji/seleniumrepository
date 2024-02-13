package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePropmtPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt ");
		driver.switchTo().alert();
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
  	    Alert popup = driver.switchTo().alert();
	    popup.sendKeys("sindhu");
	    popup.accept();

	}

}
