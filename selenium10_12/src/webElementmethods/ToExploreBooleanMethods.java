package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://www.instagram.com/");
		//rThread.sleep(3000);
	    
	  // loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
       // System.out.println("Before Entering the value");
    //    System.out.println(loginButton.isDisplayed());
       // System.out.println(loginButton.isEnabled());
        System.out.println("=======================");
       // System.out.println("AfterEntering the value");
       //.findElement(By.name("username")).sendKeys("9487231451");
//        System.out.println( loginButton .isDisplayed());
       // System.out.println( loginButton .isEnabled());
        
        driver.get("https://demoapp.skillrary.com/");
        Thread.sleep(3000);
        WebElement value = driver.findElement(By.xpath("//option[text()='INR 50 - INR 99 ( 1 ) ']"));
        System.out.println("after selecting");
        value.click();
        System.out.println(value .isSelected());
        
        
	}

}
