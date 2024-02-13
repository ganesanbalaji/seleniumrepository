package advanceSeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TolearnTestNg {
	
	    @Test(invocationCount=3,priority=0,threadPoolSize=3)
	    public void cricbuzz(){//test case1
	    	WebDriver driver = new EdgeDriver();
	    	driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
			driver.get("https://www.cricbuzz.com/");
	    	Reporter.log("cricbuzz is executing successfully",true);//teststeps
	    	driver.quit();	
	    }
	    @Test(enabled=false)//(invocationCount=0,threadPoolSize=2)//by default the invocation count,threadpoolsize=1,priority=0
	    public void buskinrobbins(){
	    	WebDriver driver = new EdgeDriver();
	    	driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
			driver.get("https://baskinrobbinsindia.com/");
			Reporter.log("baskinrobbins is executing successfully",true);
			driver.quit();
	    	
	    }//
	    
	    @Test(invocationCount=1,threadPoolSize=1)
	    public void amazon() {
	    	WebDriver driver = new EdgeDriver();
	    	driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
			driver.get("https://www.amazon.in/");
	    	Reporter.log("amazon is executing successfully",true);
	    	driver.quit();
	    }

}
