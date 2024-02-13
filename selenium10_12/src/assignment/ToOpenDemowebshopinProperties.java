package assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenDemowebshopinProperties {

	public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./testData/testDataDemo.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
	    String url = prop.getProperty("url");
	    String firstame = prop.getProperty("firstname");
	    String lastname = prop.getProperty("lastname");
	    String email = prop.getProperty("email");
	    String password = prop.getProperty("password");
	    String confirmpassword = prop.getProperty("confirmpassword");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstame);
		driver.findElement(By.id("LastName")).sendKeys( lastname);
		driver.findElement(By.id("Email")).sendKeys(email );
		driver.findElement(By.id("Password")).sendKeys( password );
		driver.findElement(By.id("ConfirmPassword")).sendKeys( confirmpassword  );
		driver.findElement(By.id("register-button")).click();
		
		
		
		
		
		
	}

}
