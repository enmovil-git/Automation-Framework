package com.poc.atf.services;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.LoginPageContainer;

public class LoginPageService {
	
	public static LoginPageContainer loginPageContainer;
	private static Logger log = Logger.getLogger(LoginPageService.class);
	
	public LoginPageService loginToPOCApplication(String uname, String password) {
		try {
			BrowserDriver.waitForPageToLoad();
			loginPageContainer.getPocUsername().sendKeys(uname);
			loginPageContainer.getPocPassword().sendKeys(password);
			BrowserDriver.wait(2);
			loginPageContainer.getLoginButton().click();
			log.info("User logged in successfully.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return this;
	}
	
	public static void init() {
		loginPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPageContainer.class);
	}

} 


