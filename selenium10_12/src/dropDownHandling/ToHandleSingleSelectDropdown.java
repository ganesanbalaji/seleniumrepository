package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/signup");

	    WebElement dayDropdown = driver.findElement(By.id("day"));
	    WebElement monthDropdown = driver.findElement(By.id("month"));
	    WebElement yearDropdown = driver.findElement(By.id("year"));
	    Select  daySelect   = new Select( dayDropdown );
	    Select  monthselect = new Select(monthDropdown );
	    Select  yearselect = new Select(yearDropdown );
	    daySelect .selectByIndex(17);
	    monthselect .selectByValue("4");
	    yearselect.selectByVisibleText("2021");
	    List<WebElement> allmonths = monthselect.getOptions();
	    for(WebElement month :  allmonths ) {
	    	System.out.println(month.getText());
	    	monthselect.selectByVisibleText(month.getText());
	    	Thread.sleep(3000);
	    	//to check whether dropdown single or multiple
	    	System.out.println( monthselect.isMultiple());
	    	
	    }
	    }
	    
	    
	}


