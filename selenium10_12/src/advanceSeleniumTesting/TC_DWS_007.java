package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_007 extends BaseClass {
	String expectedData="Gift Cards";
	@Test
    public void toCheckElectroics() {
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		  String Actualdata = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
		  if( Actualdata.equals(expectedData)) {
			  Reporter.log("navigated to Digital Gift Cards page successfully",true);
		  }
		  else {
			  Reporter.log("failed to navigate Gift Cards downloads page ",true);
		  }
		 

}
}
