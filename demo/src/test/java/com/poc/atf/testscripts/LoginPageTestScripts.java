package com.poc.atf.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.config.PropertyLoader;
import com.poc.atf.data.POCDataConfig;
import com.poc.atf.data.POCLoginData;
import com.poc.atf.services.LoginPageService;

import util.BaseListener;

public class LoginPageTestScripts extends BaseListener {
	
	LoginPageService loginPageService = null;
	POCLoginData pocLoginData = null;
	
    @BeforeClass
    
	public void init() {
	loginPageService = new LoginPageService();
	pocLoginData = new POCDataConfig().getLoginData();
	InitializeViews.init();
	logger = extent.createTest("Daimler:: Login Test");
	
    }
    

@Test(description="Open Daimler Application")
public void logIN() {
	
	BrowserDriver.getCurrentDriver().navigate().to(PropertyLoader.getPOCUrl());
	loginPageService.loginToPOCApplication(pocLoginData.getPocLoginUser(), pocLoginData.getPocPassword());
	
}
}

	


 