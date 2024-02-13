package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPop_ups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/ ");
		//switch to frame
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//switch to alert
	    Alert alertpopups = driver.switchTo().alert();
		System.out.println( alertpopups.getText());
	   // alertpopups.accept();
		Thread.sleep(3000);
	    alertpopups.dismiss();

	}

}
