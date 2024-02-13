package advanceSeleniumTesting;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import graphql.Assert;

public class TC_DWS_001 extends BaseClass{
	String expectedData="Books";
	@Test
    public void toCheckBooks() {
		driver.findElement(By.partialLinkText("Books")).click();
		  String Actualdata = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
		 org.testng.Assert.assertEquals(Actualdata, expectedData,"FAILED TO NAVIGATE");
		 Reporter.log("successfully logged in",true);
		 // if( Actualdata.equals(Actualdata,expectedData)) {
			//  Reporter.log("navigated to books page successfully",true);
		 // }
		  //else {
			//  Reporter.log("failed to navigate books page ",true);
		  //}
		

}}
