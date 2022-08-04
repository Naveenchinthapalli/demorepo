package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="search_query_top")
	private WebElement searchBox;
	
	@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")
	private WebElement searchButton;
	
	@FindBy(linkText = "Contact us")
	private WebElement ContactUsLink;
	


	@FindBy(linkText = "Women")
	private WebElement WomenLink;
	
	@FindBy(linkText = "Dresses")
	private WebElement DressesLink;

	@FindBy(linkText = "T-Shirts")
	private WebElement TShirtsLink;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public void setSearchBox(String name) {
		searchBox.sendKeys(name);
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getContactUsLink() {
		return ContactUsLink;
	}

	

	public WebElement getWomenLink() {
		return WomenLink;
	}

	public WebElement getDressesLink() {
		return DressesLink;
	}

	public WebElement getTShirtsLink() {
		return TShirtsLink;
	}
	

}
