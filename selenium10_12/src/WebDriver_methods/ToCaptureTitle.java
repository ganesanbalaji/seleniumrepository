package WebDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
