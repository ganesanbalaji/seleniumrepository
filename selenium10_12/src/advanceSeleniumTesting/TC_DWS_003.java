package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_003 extends BaseClass{
	String expectedData="Electronics";
	@Test
    public void toCheckElectroics() {
		driver.findElement(By.partialLinkText("Electronics")).click();
		  String Actualdata = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
		  if( Actualdata.equals(expectedData)) {
			  Reporter.log("navigated to electronics page successfully",true);
		  }
		  else {
			  Reporter.log("failed to navigate electronics page ",true);
		  }
		 
	
}
}
