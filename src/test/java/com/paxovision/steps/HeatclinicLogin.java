/*package com.paxovision.steps;

import gherkin.lexer.Sr_cyrl;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HeatclinicLogin {
	protected WebDriver driver;

	@Before
	public void beforeclass() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@After
	public void afterclass() {
		driver.close();
		driver.quit();
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
		String title = driver.getTitle();
		Assert.assertEquals("", title);
	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {
		WebElement element = driver.findElement(By
				.xpath(".//*[@id='anonymous-customer-header']/a[1]/span"));
		element.click();
	}

	@When("^Enter \"(.*?)\" as email address$")
	public void enter_as_email_address(String email) throws Throwable {
		WebElement element = driver.findElement(By.name("j_username"));
		element.sendKeys(email);
	}

	@When("^Enter \"(.*?)\" as password$")
	public void enter_as_password(String pass) throws Throwable {
		WebElement element = driver.findElement(By.name("j_password"));
		element.sendKeys(pass);
	}

	@When("^Clich login$")
	public void clich_login() throws Throwable {
		WebElement element = driver.findElement(By
				.cssSelector(".login_button.big.red "));
		element.click();
	}

	@Then("^Invalid email or password message not display$")
	public void invalid_email_or_password_message_not_display()throws Throwable {

	}
	
	@Then("^Invalid email or password message should display$")
	public void invalid_email_or_password_message_should_display() throws Throwable {
	  
	}

	@Then("^Welcome message shows$")
	public void welcome_message_shows() throws Throwable {

	}

}
*/