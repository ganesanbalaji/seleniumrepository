package assignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThePositionOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://m.olivegarden.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
        driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		  Point Pos = driver.manage().window().getPosition();
		  System.out.println( Pos);
		  System.out.println(Pos.getX());
		  System.out.println(Pos.getY());
		  driver.manage().window().setPosition(new Point(50,50));


	}

}
