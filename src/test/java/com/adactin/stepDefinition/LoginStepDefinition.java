package com.adactin.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Loginpage;
import com.adactin.runner.Runner;
import com.baseClass.BaseClass;

import cucumber.api.java.en.*;

public class LoginStepDefinition extends BaseClass {
	
	public static WebDriver driver = Runner.driver;
	
	Loginpage lp = new Loginpage(driver);

	@Given("^user enter url of adactin application$")
	public void user_enter_url_of_adactin_application() throws Throwable {
		
		getUrl("https://adactinhotelapp.com/");
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		
	    inputOnElement(lp.getUsername(), arg1);
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
	    
		inputOnElement(lp.getPassword(), arg1);
	}

	@When("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
		
		clickOnElement(lp.getLogin());
	}

	@Then("^user validate login button$")
	public void user_validate_login_button() throws Throwable {

	}


	
}
