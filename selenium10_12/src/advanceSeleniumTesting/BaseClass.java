package advanceSeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	String expectedwelcompage="Tricentis Demo Web Shop";
	
	
	//@Parameters("browsername")
	//@BeforeClass
	public void tolaunch(String bname) {
		if(bname.equalsIgnoreCase("Edge")) {
		driver= new EdgeDriver();
		}else if(bname.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();	
		}
		Reporter.log("Browser got launched successfully",true);
		driver.manage().window().maximize();
		Reporter.log("Browser got maximized successfully",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
	}
	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/login");
		String actualwebpageTitle = driver.getTitle();
		if(actualwebpageTitle.equals(actualwebpageTitle)) {
			Reporter.log("Browser got launched successfully",true);
		}
		else {
	   Reporter.log("Browser failed tolaunch",true);
		}
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("sindhu176@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("balu123");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        Reporter.log("Navigated got launched successfully",true);
}
	@AfterMethod
	public void toLogout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Browser got successfully logged out",true);
	}
	@AfterClass
	public void toCloseBrowser() {
		Reporter.log("Browser got closed successfully",true);
		driver.quit();
	}
	
		
		
		
		
	}