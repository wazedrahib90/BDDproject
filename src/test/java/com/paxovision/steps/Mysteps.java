package com.paxovision.steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.paxovision.framework.Application;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mysteps{
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

		@When("^I fill in the followin:$")
		public void i_fill_in_the_followin(DataTable Table) throws Throwable {
			List<List<String>> data = Table.raw();
			heatclinic.loginPage().enterEmailTextbox(data.get(0).get(1));
			heatclinic.loginPage().enterpasswordTextbox(data.get(2).get(1));
		}

		
		@When("^Click login$")
		public void click_login() throws Throwable {
			heatclinic.loginPage().clickLogin();
		   
		}
	
	
	
	
	
	
	
	
	
}
