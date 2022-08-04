package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
 
	WebDriver driver;
	public Signin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email_create")
	private WebElement emailcreate;
	

	@FindBy(id= "SubmitCreate")
	private WebElement SubmitButtonCreateAccount;
	
	@FindBy(id= "email")
	private WebElement emailLogin;
	
	@FindBy(id= "passwd")
	private WebElement passwdLogin;
	
	@FindBy(className="button")
	private WebElement ButtonLogin;
	
	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotPasswordLink;
	
	
	@FindBy(linkText = "Sign in")
	private WebElement signInLink;
	
	
	public WebElement getSignInLink() {
		return signInLink;
	}
	
	
	
	
	
	/**
	 * @return the emailcreate
	 */
	public WebElement getEmailcreate() {
		return emailcreate;
	}

	/**
	 * @param emailcreate the emailcreate to set
	 */
	public void setEmailcreate(String name) {
		 emailcreate.sendKeys(name);;
	}

	/**
	 * @return the emailLogin
	 */
	public WebElement getEmailLogin() {
		return emailLogin;
	}

	/**
	 * @param emailLogin the emailLogin to set
	 */
	public void setEmailLogin(String name) {
		 emailLogin.sendKeys(name);;
	}

	/**
	 * @return the passwdLogin
	 */
	public WebElement getPasswdLogin() {
		return passwdLogin;
	}

	/**
	 * @param passwdLogin the passwdLogin to set
	 */
	public void setPasswdLogin(String name) {
		 passwdLogin.sendKeys(name);;
	}

	/**
	 * @return the submitButtonCreateAccount
	 */
	public WebElement getSubmitButtonCreateAccount() {
		return SubmitButtonCreateAccount;
	}

	/**
	 * @return the buttonLogin
	 */
	public WebElement getButtonLogin() {
		return ButtonLogin;
	}

	/**
	 * @return the forgotPasswordLink
	 */
	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}
	

}
