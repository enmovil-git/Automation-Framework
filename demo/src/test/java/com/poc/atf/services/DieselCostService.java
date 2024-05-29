package com.poc.atf.services;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.DieselCost;


public class DieselCostService {
	public static DieselCost dieselCost;


	public DieselCostService clickSeletType() {
		BrowserDriver.wait(5);
		
		dieselCost.getClickSideMenu().click();
		BrowserDriver.wait(3);
		
		dieselCost.getClickVendorPaymentReconcilliationMenu().click();
		BrowserDriver.wait(3);
		
		dieselCost.getClickDieselCostMenu().click();
		BrowserDriver.wait(3);
		
		dieselCost.getClickAddDieselCostButton().click();
		BrowserDriver.wait(3);
		
		dieselCost.getClickCloseButton().click();
		BrowserDriver.wait(3);
		
		dieselCost.getClickEditButton().click();
		BrowserDriver.wait(3);
		
		dieselCost.getClickCloseButton2().click();
	
		
		return this;
	}
	public static void init() {
		dieselCost = PageFactory.initElements(BrowserDriver.getCurrentDriver(), DieselCost.class);
	}
	
}