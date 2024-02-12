package com.poc.atf.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageContainer {
	
	@FindBy(xpath = "//button[text()='LOGIN']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement pocUsername;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement pocPassword;
	
	

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public WebElement getPocUsername() {
		return pocUsername;
	}

	public void setPocUsername(WebElement pocUsername) {
		this.pocUsername = pocUsername;
	} 

	public WebElement getPocPassword() {
		return pocPassword;
	}

	public void setPocPassword(WebElement pocPassword) {
		this.pocPassword = pocPassword;
	}

	
	}
	
	


