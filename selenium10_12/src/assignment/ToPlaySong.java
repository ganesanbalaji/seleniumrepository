package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPlaySong {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("munbae vaa song");
        Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("munbae vaa HD  video song|sillunu oru kadhal Tamil Movie|Suriya|Bhumika|Jyothika|AR Rahman")).click();

	}

}
