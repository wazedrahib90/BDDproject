package com.paxovision.framework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends Page {
	
private WebElement loginButton;
private WebElement emailTextbox;
private WebElement  passwordTextbox;
private WebElement errorMsg;
	public LoginPage(WebDriver driver) {
		super(driver);		
	}
	
	protected WebElement emailTextbox(){
		emailTextbox = waitForElementdisplay(By.name("j_username"));
		return emailTextbox;
	}
	
	protected WebElement passwordTextbox(){
		passwordTextbox = waitForElementdisplay(By.name("j_password"));
		return passwordTextbox;
	}
	protected WebElement loginButton(){
		loginButton = waitForElementdisplay(By.xpath("//*[@id='login']/div/form/div[3]/input"));
		return loginButton;
	}
	
	protected WebElement errorMessageLabel(){
		errorMsg=waitForElementdisplay(By.cssSelector(".error>p>span"));
		return errorMsg;
	}
	
	public void verifyErrorMsg(String msg){  
		String actual = errorMessageLabel().getText();
		Assert.assertEquals("Error message doesn't match", msg, actual);
	}
	
	public void enterEmailTextbox(String email){
		emailTextbox().sendKeys(email);
	}
	public void enterpasswordTextbox(String pass){
		passwordTextbox().sendKeys(pass);
	}
	
	public void clickLogin(){
		loginButton().click();
	}
	public void login(String email, String pass){
		enterEmailTextbox(email);
		enterpasswordTextbox(pass);
		clickLogin();
	}
}
