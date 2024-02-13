package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchKawasaki {
	
	@Test(groups = "system")
	public void Toopenkawasaki() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get("https://kawasaki-india.com/");
		Reporter.log("kawasaki launche successfully",true);
		driver.quit();
	}

}
