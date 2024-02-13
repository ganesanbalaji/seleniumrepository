
package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDraganddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	    WebElement photomanager = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded'] "));
	    
	    //switch to frame
	    driver.switchTo().frame(photomanager );
	    
	  WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	  WebElement image2 = driver.findElement(By.xpath("The chalet at the Green mountain lake")); 
	  WebElement image3 = driver.findElement(By.xpath("Planning the ascent")); 	
	  WebElement image4 = driver.findElement(By.xpath("On top of Kozi kopka"));
	  WebElement trashbox = driver.findElement(By.id("trash"));
	  WebElement gallery = driver.findElement(By.id("gallery"));
	  
	  Actions action = new Actions(driver);
	  action.dragAndDrop(image1, trashbox).perform();
	  Thread.sleep(2000);
	  action.dragAndDrop(image2, trashbox).perform();
      //action.dragAndDropBy(image1, 109, 0).perform();
	  Thread.sleep(2000); 
	  action.dragAndDrop(image3, trashbox).perform();
	  Thread.sleep(2000); 
	  action.dragAndDrop(image4, trashbox).perform();
	  
	  
	  action.dragAndDrop(image1, gallery).perform();
	  Thread.sleep(2000); 
	  action.dragAndDrop(image2, gallery).perform();
	  Thread.sleep(2000); 
	  action.dragAndDrop(image3, gallery).perform();
	  Thread.sleep(2000); 
	  action.dragAndDrop(image4, gallery).perform();
	 // action.clickAndHold(image2).moveToElement(trashbox, 0, 0).perform();
	  
	}

}
