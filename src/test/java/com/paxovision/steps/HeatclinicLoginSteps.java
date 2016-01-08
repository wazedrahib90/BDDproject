/*package com.paxovision.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.paxovision.framework.Application;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HeatclinicLoginSteps {
	protected WebDriver driver;
	protected Application heatclinic;
	@Before
	public void beforeclass() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		heatclinic = new Application(driver); 
	}

	@After
	public void afterclass() {
		//driver.close();
		//driver.quit();
		heatclinic = null;
	}

	@Given("^As a not valid  user$")
	public void as_a_not_valid_user() throws Throwable {
		driver.manage().deleteAllCookies();
	}

	@When("^Browse to the application$")
	public void browse_to_the_application() throws Throwable {
		driver.navigate().to("https://demo.broadleafcommerce.org");
	}

	@Then("^Broadleaf home page should show$")
	public void broadleaf_home_page_should_show() throws Throwable {
		heatclinic.homePage().showloginPage();
		
	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {
		heatclinic.homePage().clickloginLink();
		
	}

	@When("^Enter \"(.*?)\" as email address$")
	public void enter_as_email_address(String email) throws Throwable {
		heatclinic.loginPage().enterEmailTextbox(email);
		
	}

	@When("^Enter \"(.*?)\" as password$")
	public void enter_as_password(String pass) throws Throwable {
		heatclinic.loginPage().enterpasswordTextbox(pass);
	}

	@When("^Click login$")
	public void Click_login() throws Throwable {
		heatclinic.loginPage().clickLogin();
		
	}

	
	
	@Then("^Invalid email or password message should display$")
	public void invalid_email_or_password_message_should_display() throws Throwable {
		heatclinic.loginPage().verifyErrorMsg("The e-mail address and/or password entered do not match our records. Please try again");
	}


	
	@Then("^Wellcome message should display with \"(.*?)\"$")
	public void wellcome_message_should_display_with(String message)throws Throwable {
		heatclinic.homePage().verifywellcomeMessage(message);
	}
	//wellcome_message_shows

}
*/