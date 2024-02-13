package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandledataUsingFis {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testData/testData.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
	    String url = prop.getProperty("url");
	    String username = prop.getProperty("username");
	    String pass = prop.getProperty("password");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get(url);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
		
		

	}

}
