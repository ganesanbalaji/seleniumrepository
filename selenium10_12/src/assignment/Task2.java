package assignment;

import org.openqa.selenium.edge.EdgeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver .get("https://baskinrobbinsindia.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}

	}


