package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExportFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String username = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String pass = wb.getSheet("Sheet1").getRow(2).getCell(0).toString();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys( username);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
	}

}
