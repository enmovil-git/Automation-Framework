package com.poc.atf.services;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.DealerDeliveryLocation;


public class DealerDeliveryLocationService {
	public static DealerDeliveryLocation dealerDeliveryLocation;
	
	public DealerDeliveryLocationService clickSeletType() {
		BrowserDriver.wait(5);
		
		dealerDeliveryLocation.getClickSideMenu().click();
		
		dealerDeliveryLocation.getClickUtilities().click();
		
		dealerDeliveryLocation.getClickDealerDeliveryLocation().click();
		
		dealerDeliveryLocation.getClickShowLegIcon().click();
		BrowserDriver.wait(5);
		
		
		
		dealerDeliveryLocation.getClickRecentFiveLocationIcon().click();
		BrowserDriver.wait(5);
		dealerDeliveryLocation.getClickOkButton().click();
		
		
		
		
		dealerDeliveryLocation.getClickViewRouteIcon().click();
		BrowserDriver.wait(5);
		dealerDeliveryLocation.getClickOkButton().click();
	
		
		
		return this;
	}
	public static void init() {
		dealerDeliveryLocation = PageFactory.initElements(BrowserDriver.getCurrentDriver(), DealerDeliveryLocation.class);
	}
}