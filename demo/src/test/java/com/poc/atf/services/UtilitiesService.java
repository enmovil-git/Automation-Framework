package com.poc.atf.services;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.Utilities; 
public class UtilitiesService {
	
	public static Utilities utilities;

	
	public UtilitiesService clickSeletType() {
		BrowserDriver.wait(5);
		
		utilities.getClickSideMenu().click();
		BrowserDriver.wait(2);
		
		utilities.getClickUtilities().click();
		BrowserDriver.wait(2);
		
		utilities.getClickGPSIntegrationStatus().click();
		BrowserDriver.wait(2);
		
		utilities.getClickTotalVins().click();
		BrowserDriver.wait(4);
		utilities.getClickCloseButto().click();
		
		utilities.getClickTotalOnVins().click();
		BrowserDriver.wait(4);
		utilities.getClickCloseButto().click();
		
		utilities.getClickTotalActiveVins().click();
		BrowserDriver.wait(4);
		utilities.getClickCloseButto().click();
		
		utilities.getClickTotalActiveOnTripVins().click();
		BrowserDriver.wait(4);
		utilities.getClickCloseButto().click();
		
		utilities.getClickTotalInActiveVins().click();
		BrowserDriver.wait(4);
		utilities.getClickCloseButto().click();
		
		utilities.getClickTotalinActiveOnTripVins().click();
		BrowserDriver.wait(4);
		utilities.getClickCloseButto().click();
		BrowserDriver.wait(1);
		utilities.getClickAtDealer().click();
		BrowserDriver.wait(3);
		utilities.getClickCloseButto().click();
		
		
		
		return this;
		
	}
	public static void init() {
		utilities = PageFactory.initElements(BrowserDriver.getCurrentDriver(), Utilities.class);
	}
	
}



















