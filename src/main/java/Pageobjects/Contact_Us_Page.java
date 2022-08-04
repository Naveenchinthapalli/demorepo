package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Contact_Us_Page {
	WebDriver driver;
	public Contact_Us_Page(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
