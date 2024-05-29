package com.poc.atf.services;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.VinLocation; 
public class VinLocationService {
	public static VinLocation vinLocation;


	public VinLocationService clickSeletType() {
		BrowserDriver.wait(10);
		 
		
		vinLocation.getClickSideMenu().click();
		BrowserDriver.wait(5);
		
		vinLocation.getClickUtilities().click();
		BrowserDriver.wait(5);
		
		
		vinLocation.getClickVinLocationMap().click();
		BrowserDriver.wait(6);
		
		vinLocation.getClickOkButton().click();
		
		vinLocation.getClickSelctTypeDropDown().click();
		
		vinLocation.getSelctTypeDropDown().click();
		
		vinLocation.getClickTransporterDropDown().click();
		
		vinLocation.getSelectTransporterName().click();
		
		vinLocation.getClickSubmitButton().click();
		
		vinLocation.getClickOkButton().click();
		
		BrowserDriver.wait(5);	
		return this;
	}
	public static void init() {
		vinLocation = PageFactory.initElements(BrowserDriver.getCurrentDriver(), VinLocation.class);
	}
	
}
