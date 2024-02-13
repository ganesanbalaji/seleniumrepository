package advanceSeleniumTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUseDependsOnMethods {

		
		
		@Test
		public void Accountcreation() {
			Reporter.log("account created successfully");
		}
		@Test(dependsOnMethods="Accountcreation")
		public void Accountedition() {
			Reporter.log("account edited successfully");
	}
		@Test(dependsOnMethods={"Accountedition","Accountcreation"})
		public void Accountdeletion() {
			Reporter.log("account deleted successfully");
	}
		 

}
