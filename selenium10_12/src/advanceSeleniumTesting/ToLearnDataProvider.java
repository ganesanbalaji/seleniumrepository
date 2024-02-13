package advanceSeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	@DataProvider(name="Credentials")
	public String[][] toSendData(){
		String[][] sarr= {
				
				{"sindhu123@gmail.com","balu123"},
				{"sindhuviji176@gmail.com","sindhu123"},
				{"balu567@gmail.com","balaganesh"},
				
		};
		return sarr;
	}
	
	
	@Test(dataProvider = "Credentials")
		public void tologin(String email,String password) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys( password);
	}
		
	

}
