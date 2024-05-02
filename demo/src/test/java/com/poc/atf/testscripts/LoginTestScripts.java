//package com.poc.atf.testscripts;
//
//import org.junit.BeforeClass;
//import org.testng.annotations.Test;
//
//import com.poc.atf.config.BrowserDriver;
//import com.poc.atf.config.PropertyLoader;
//import com.poc.atf.data.DBPLDataConfig;
//import com.poc.atf.data.LoginData;
//import com.poc.atf.services.LoginService;
//
//import util.BaseListener;
//
//public class LoginTestScripts extends BaseListener{
//	
//	LoginData dbplLoginData = null;
//	LoginService loginService = null;
//	
//	
//	@BeforeClass
//	public void init() {
//		dbplLoginData = new DBPLDataConfig().getLoginData();
//		loginService = new LoginService();
//		
//		InitializeViews.init(); 
//		logger = extent.createTest("DBPL: Login Screen");
//	
//	}
//	@Test(description="DBPL Login Test")
//	
//	public void loginTest() {
//		BrowserDriver.getCurrentDriver().navigate().to(PropertyLoader.getDBPLUrl());
//		loginService.loginToDBPLApplication(dbplLoginData.getAdminLoginUser(), dbplLoginData.getAdminPassword());
//	}
//}
//
// 


package com.poc.atf.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.config.PropertyLoader;
import com.poc.atf.data.DBPLDataConfig;
import com.poc.atf.data.LoginData;
import com.poc.atf.services.LoginService;
import util.BaseListener;

public class LoginTestScripts extends BaseListener{
    
    LoginData dbplLoginData = null;
    LoginService loginService = null;
    
    @BeforeClass
    public void init() {
        dbplLoginData = new DBPLDataConfig().getLoginData();
        loginService = new LoginService();
        InitializeViews.init(); 
        logger = extent.createTest("DBPL: Login Screen");
    }
    
    @Test(description="DBPL Login Test")
    public void loginTest() {
//        if (dbplLoginData != null) {
//            BrowserDriver.getCurrentDriver().navigate().to(PropertyLoader.getDBPLUrl());
//            loginService.loginToDBPLApplication(dbplLoginData.getAdminLoginUser(), dbplLoginData.getAdminPassword());
//        } else {
//            // Handle case where dbplLoginData is not initialized
//            // You can log an error or throw an exception here
//            System.out.println("Login data is not initialized.");
//        }
    }   
}
