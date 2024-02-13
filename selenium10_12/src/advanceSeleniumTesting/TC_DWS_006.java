package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_006 extends BaseClass {
	String expectedData="Jewelry";
	@Test
    public void toCheckElectroics() {
		driver.findElement(By.partialLinkText("Jewelry")).click();
		  String Actualdata = driver.findElement(By.xpath("//h1[text()='']")).getText();
		  if( Actualdata.equals(expectedData)) {
			  Reporter.log("navigated to Digital Jewelry page successfully",true);
		  }
		  else {
			  Reporter.log("failed to navigate Jewelry downloads page ",true);
		  }
		 
	}
}
