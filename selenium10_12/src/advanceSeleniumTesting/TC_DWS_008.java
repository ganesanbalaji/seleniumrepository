package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_008 extends BaseClass {
	String expectedData="Add to cart";
	@Test
    public void toCheckElectroics() {
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		  String Actualdata = driver.findElement(By.xpath("//input[@value='Add to cart']")).getText();
		  if( Actualdata.equals(expectedData)) {
			  Reporter.log("navigated to Addtocarts page successfully",true);
		  }
		  else {
			  Reporter.log("failed to navigate Add to cart page ",true);
		  }

}
}
