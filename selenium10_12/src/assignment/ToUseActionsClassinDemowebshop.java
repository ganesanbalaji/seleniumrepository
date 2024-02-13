package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUseActionsClassinDemowebshop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		
		driver.get("https://www.woodenstreet.com/");
		for(;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			
			}catch(Exception e) {
				Thread.sleep(2000);
			}
		}
    	WebElement profile = driver.findElement(By.linkText("Profile"));
    	
    	Actions action = new Actions(driver);
		action.click(profile).perform();
	    WebElement login = driver.findElement(By.id("login_popup_btn"));
	    action.click(login).perform();
	    WebElement popup = driver.findElement(By.id("login-pop"));
	    action.click(popup).perform();
	    driver.findElement(By.id("login_email")).sendKeys("sindhu123");
	    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(12));
	    WebElement signin = driver.findElement(By.id("login_submit_btn"));
        action.click(signin).perform();
        String errormsg = driver.findElement(By.xpath("//p[text()='Please provide valid email']")).getText();
        System.out.println( errormsg);
        WebElement error = driver.findElement(By.xpath("//p[text()='Please provide valid email']"));
        System.out.println( error.getCssValue("background-color"));
        System.out.println(error.getCssValue("font-size"));

	}

}
