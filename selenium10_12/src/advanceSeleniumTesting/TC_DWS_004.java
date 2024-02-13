package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_004 extends BaseClass{
	String expectedData="Apparel & Shoes";
	@Test
    public void toCheckElectroics() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		  String Actualdata = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']")).getText();
		  if( Actualdata.equals(expectedData)) {
			  Reporter.log("navigated to Apparel & Shoes page successfully",true);
		  }
		  else {
			  Reporter.log("failed to navigate Apparel & Shoes page ",true);
		  }

}
}
