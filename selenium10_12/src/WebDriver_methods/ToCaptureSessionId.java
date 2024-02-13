package WebDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSessionId {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.instagram.com/");
		 String ParentId = driver.getWindowHandle();
		System.out.println( ParentId);	  //7F6E2A64C65ED5B9696AB66DD9FBCE3D
	 

	}

} 