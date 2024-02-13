package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDropdownbyFindElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("https://www.facebook.com/signup");
		 WebElement days = driver.findElement(By.id("day"));
		 WebElement months = driver.findElement(By.id("month"));
		 WebElement years = driver.findElement(By.id("year"));
		 days.sendKeys("12");
		 months.sendKeys("May");
		 years .sendKeys("1992");
	}

}

