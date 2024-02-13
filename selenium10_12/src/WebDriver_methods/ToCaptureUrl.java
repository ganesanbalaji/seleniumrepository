package WebDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrl {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		String urlOfWebpage = driver.getCurrentUrl();
		System.out.println(urlOfWebpage);
	}

}
