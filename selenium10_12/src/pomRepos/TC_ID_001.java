package pomRepos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class TC_ID_001 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginlink().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmailtextfield().sendKeys("sindhu176@gmail.com");
		lp.getPasswordtextfield().sendKeys("balu123");
		lp.getLoginbutton().click();

	}

}
