package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass{
	String expectedData="Computers";
	@Test
    public void toCheckComputers() {
		driver.findElement(By.partialLinkText("Computers")).click();
		  String Actualdata = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
		  if( Actualdata.equals(expectedData)) {
			  Reporter.log("navigated to computers page successfully",true);
		  }
		  else {
			  Reporter.log("failed to navigate computers page ",true);
		  }
		 

}
}
