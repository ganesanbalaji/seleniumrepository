package webElementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    
		    
		    
		    driver.get("https://www.amazon.in/");
		    Thread.sleep(3000);
		    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		    Thread.sleep(3000);
		    List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/../.."));
		    for(WebElement sugg:autosuggestion) {
		    
		    	System.out.println( sugg.getText());
		    }
         
	}

}
