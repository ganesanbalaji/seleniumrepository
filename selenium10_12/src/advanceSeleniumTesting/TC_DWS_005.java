package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_005 extends BaseClass {
	String expectedData="Digital downloads";
	@Test
    public void toCheckElectroics() {
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		  String Actualdata = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
		  if( Actualdata.equals(expectedData)) {
			  Reporter.log("navigated to Digital downloads page successfully",true);
		  }
		  else {
			  Reporter.log("failed to navigate Digital downloads page ",true);
		  }
		 

}
}
