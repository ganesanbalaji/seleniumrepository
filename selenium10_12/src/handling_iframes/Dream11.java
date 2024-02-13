package handling_iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		
		driver.get("https://www.dream11.com/");
		//to switch to by using index
		//driver.switchTo().frame(0);
		//to switchto by using string
		//driver.switchTo().frame("send-sms-iframe");
		//to switchto by using webelement
		WebElement frames = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame( frames);
		driver.findElement(By.id("regEmail")).sendKeys("8072552303");
		//to switchback using parentframe
		 driver.switchTo().parentFrame();
		//to switchback using default
		//driver.switchTo().defaultContent();
		driver.findElement(By.linkText("About Us")).click();
		

	}

}
