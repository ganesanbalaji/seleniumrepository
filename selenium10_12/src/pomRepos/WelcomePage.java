package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage( WebDriver driver){
	PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Register")
    private	WebElement registrelink;
	
	@FindBy(linkText = "Log in")
    private	WebElement loginlink;
	



	public WebElement getRegistrelink() {
		return registrelink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	
	
  

}
