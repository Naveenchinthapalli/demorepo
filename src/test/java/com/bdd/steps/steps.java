package com.bdd.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Testbase;



public class steps extends Testbase {
	
	@cucumber.api.java.Before("@sanity")
	public void beforesetup() {
		System.out.println("launch the browser");
	}
	@cucumber.api.java.After("@sanity")
		public void afterscenario() {
		System.out.println("closing the browser");
			driver.close();
		}


	 @cucumber.api.java.en.Given("^Open Browser and navigate to \"([^\"]*)\"$")
	    public void open_browser_and_navigate_to_something(String strArg1) throws Throwable {
	      setup(); 
	    }

	    @cucumber.api.java.en.When("^Click on the Sign in link$")
	    public void click_on_the_sign_in_link() throws Throwable {
	        signInObj.getSignInLink().click();
	    }

	    @cucumber.api.java.en.When("^Enter username and password \"([^\"]*)\"$")
	    public void enter_username_and_password_something_and_something(String strArg1) throws Throwable {
	     signInObj.setEmailcreate(strArg1);
	     signInObj.getSubmitButtonCreateAccount().click();
	    }

	    @cucumber.api.java.en.When("^After Login Pass below parameters$")
	    public void after_login_pass_below_parameters(io.cucumber.datatable.DataTable dataTable) {
	      List<List<String>> res  =dataTable.asLists();
	      System.out.println("data table");
	      System.out.println(res.get(0).get(0));
	    	System.out.println(res.get(0).get(1));
	    	System.out.println(res.get(0).get(2));
	    	System.out.println(res.get(0).get(3));
	    }
	    
	    @cucumber.api.java.en.When("^After Login Pass below parameters to the system \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	    public void after_login_pass_below_parameters_to_the_system_something_something_something_something_something(String name, String lname, String phone, String place, String pin) throws Throwable {
	      System.out.println("scenario outline");
	      System.out.println(name);
	      System.out.println(lname);
	      System.out.println(pin);
	      System.out.println(phone);
	      System.out.println(place);
	   	
	    }
}	
	
	

