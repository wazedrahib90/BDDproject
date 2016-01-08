package com.paxovision.framework;

import org.openqa.selenium.WebDriver;

public class Application {
private WebDriver driver;
public HomePage homePage=null;
public LoginPage loginPage=null;



public Application(WebDriver driver){
	this.driver = driver;
}

public HomePage homePage(){
	if (homePage == null){
		homePage = new HomePage(driver);
	}
	return homePage;
}
public LoginPage loginPage(){
	if(loginPage == null){
		loginPage =new LoginPage(driver);
	}
	return loginPage;
}
}
