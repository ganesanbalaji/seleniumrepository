package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseFindElements {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		
		List<WebElement> demo = driver.findElements(By.tagName("a"));
		System.out.println(demo.size());
		for(WebElement objectlink:demo) {
		String linktext = objectlink.getText();
		System.out.println(linktext);
		}
		
}
}