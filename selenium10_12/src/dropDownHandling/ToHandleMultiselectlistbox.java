package dropDownHandling;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiselectlistbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("https://demoapp.skillrary.com/");
		  WebElement multiplelists = driver.findElement(By.id("cars"));
		 Select multiple = new Select (multiplelists ); 
		 System.out.println( multiple.isMultiple());
		 multiple.selectByIndex(0);
		 multiple.selectByValue("99");
		 multiple.deselectByIndex(0);
		 multiple.deselectByValue("99");
		 multiple.deselectAll();
		 

	}

}
