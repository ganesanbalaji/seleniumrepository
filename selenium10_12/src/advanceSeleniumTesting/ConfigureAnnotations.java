package advanceSeleniumTesting;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigureAnnotations {
	@BeforeSuite
	public void beforeSuite() {
	Reporter.log("before suit is getting execute",true);
	}
	@AfterSuite
	public void afterSuite() {
	Reporter.log("after suit is getting execute",true);
	}
	@BeforeTest
	public void beforeTest() {
	Reporter.log("before test suit is getting execute",true);
	}
	@AfterTest
	public void afterTest() {
	Reporter.log("after test suit is getting execute",true);
	}
	@BeforeClass
	public void beforeclass() {
	Reporter.log("after test suit is getting execute",true);
	}
	@AfterClass
	public void afterclass() {
	Reporter.log("after test suit is getting execute",true);
	}
	@BeforeMethod
	public void beforemethod() {
	Reporter.log("after test suit is getting execute",true);
	}
	@AfterMethod
	public void aftermethod() {
	Reporter.log("after test suit is getting execute",true);
	}
	
	@Test
	public void classmain() {
		Reporter.log("suit is getting execute",true);
		
	}
	

}
