package advanceSeleniumTesting;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotakeMultipleScreenshots {
	static WebDriver driver;
	//localdatetime l= localdatetime.now();
	
	public static void main (String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://demowebshop.tricentis.com/");
		takesscreenshot("Register");
		driver.findElement(By.linkText("Register")).click();
		takesscreenshot("Log in");
		driver.findElement(By.linkText("Log in")).click();
		takesscreenshot("Shopping cart");
		driver.findElement(By.linkText("Shopping cart")).click();
	}
		public static void takesscreenshot(String s) throws IOException {
		
		TakesScreenshot ts=	(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File ("./errorshots/demowebshop.jpeg");
		org.openqa.selenium.io.FileHandler.copy(temp, src);
		
		
	}
	

		
}
