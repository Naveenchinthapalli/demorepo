package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	WebDriver driver;
	
	public MyAccountPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="logout")
	private WebElement signout;

	/**
	 * @return the signout
	 */
	public WebElement getSignout() {
		return signout;
	}
	
	
	
	

}
