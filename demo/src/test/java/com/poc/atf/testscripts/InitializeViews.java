package com.poc.atf.testscripts;


import org.openqa.selenium.WebDriver;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.services.LoginPageService;

public class InitializeViews {
	
protected static WebDriver uiDriver = null;
	
	public static void init() {
		if(uiDriver == null) {
			uiDriver = BrowserDriver.getCurrentDriver();
		}
		LoginPageService.init();
		
	
	} 
}
