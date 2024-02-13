package WebDriver_methods;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseNavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.navigate().to("https://www.flipkart.com/");
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
	     Navigation nav = driver.navigate();
		 nav.back();
		 Thread.sleep(1000);
		 nav.forward();
		 Thread.sleep(1000);
		 nav.refresh();

	}

	
	
}
