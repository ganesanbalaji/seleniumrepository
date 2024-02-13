package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleCalendarPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		
		driver.get("https://www.makemytrip.com/");
        driver.switchTo().frame("notification-frame-~10cb447c7");
        driver.findElement(By.xpath("//a[@class='close']")).click();
        driver.switchTo().parentFrame();
        
        driver.findElement(By.xpath("//span[text()='Departure']")).click();
        for(;;) {
        	try {
        	driver.findElement(By.xpath("//div[text()='June 2024']/../..//p[text()='13']")).click();
            break;  
        	}catch(Exception e) {
        		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        	}
        		
        	}
	}

	

}
