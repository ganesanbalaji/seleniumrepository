package WebDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseMaximizeMethod {

	public static void main(String[] args) throws InterruptedException  {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://skillrary.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		//driver.manage().window().getSize();

	}

}
