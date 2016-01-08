package com.paxovision.framework;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class HomePage extends Page {
	
	
	private WebElement RegisterLink;
	private WebElement LoginLink;
	//private WebElement LoginUserElement;
	//private WebElement HotSauces;
	//public WebElement ShopingCart;
	private WebElement wellcomeMessage;
	
	public HomePage(WebDriver driver) {
		super(driver);	
	}
 
	public WebElement wellcomeMessage(){
		wellcomeMessage = driver.findElement(By.cssSelector("#welcome-first-name"));
		return wellcomeMessage;	
	}
	public void verifywellcomeMessage(String message){
		String actualmsg = wellcomeMessage().getText();
		Assert.assertEquals("Wellcome message doesn't show", message, actualmsg);
		
	}
	
	public void showloginPage(){
		String title  = driver.getTitle();
		Assert.assertEquals("", title);
	}
	
	public WebElement RegisterLink() {
		RegisterLink = driver.findElement(By.xpath("//*[@id='anonymous-customer-header']/a/span[text()='Register']"));
		return RegisterLink;
	}

	public WebElement LoginLink() {
		LoginLink = driver.findElement(By.xpath("//*[@id='anonymous-customer-header']/a[1]/span"));
		return LoginLink;
	}

	/*public WebElement LoginUserElement() {
		LoginUserElement = driver.findElement(By.xpath("//*[contains(text(),'Asm')] "));
		return LoginUserElement;
	}*/

	
	
	

	public void clickregisterLink() {
		RegisterLink().click();
	}

	public void clickloginLink() {
		LoginLink().click();
	}

	

	/*public boolean verifyLoginSuccess(String LoginUser) {

		if (LoginUserElement() != null) {
			String text = LoginUserElement().getText();
			assertEquals(LoginUser, text);
			return true;
		}
		return false;
	}*/

}
