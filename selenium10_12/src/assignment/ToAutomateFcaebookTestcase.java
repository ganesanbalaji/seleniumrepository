package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAutomateFcaebookTestcase {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		
		//Expected data
	    String ExpectedTitle = "Facebook – log in or sign ";
	    String Expectedname = "sindhu123@gmail.com" ;
	    String Expectepassword = "balaganesh" ;
	    
	    //step1: open the browser
	    driver.get("https://www.facebook.com/");
	    System.out.println("browser got launched successfully");
	    driver.manage().window().maximize();
	    System.out.println("browser got maximized successfully");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	    
	    
	    //step2: enter valid url
	    driver.get("https://www.facebook.com/");
	    String actualloginpagetitle= driver.getTitle();
	    if ( actualloginpagetitle.equals(ExpectedTitle)) {
	    	System.out.println("successfully navigated to login page");
	    }
	    else {
	    	System.out.println("failed to navigate to login page");
			
		}
	    		
	    		
	    		
	    		
	}

}