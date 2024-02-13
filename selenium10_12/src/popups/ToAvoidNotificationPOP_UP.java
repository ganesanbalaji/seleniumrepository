package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPOP_UP {

	public static void main(String[] args) {
		//browser settings
		ChromeOptions settings = new ChromeOptions();
		//settings.addArguments("--disable-notifications");
		settings.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		
		driver.get("https://www.yatra.com/");
		

	}

}
