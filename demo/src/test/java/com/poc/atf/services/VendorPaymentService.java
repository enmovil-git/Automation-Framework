package com.poc.atf.services;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.VendorPayment;
public class VendorPaymentService{
	
	public static VendorPayment vendorPayment;
	
	public VendorPaymentService clickSeletType() {
		BrowserDriver.wait(5);
		
		vendorPayment.getClickSideMenu().click();
		BrowserDriver.wait(4);
		
//		vendorPayment.getClickVendorPaymentReconcilliationMenu().click();
//		BrowserDriver.wait(2);
//		vendorPayment.getClickVendorPaymentReconcilliationMenu().click();
		vendorPayment.getClickVendorPaymentsMenu().click();
		BrowserDriver.wait(9);
		
		vendorPayment.getClickTransporterdropdown().click();
		BrowserDriver.wait(3);
		
		vendorPayment.getSelectTransporterName().click();
		BrowserDriver.wait(3);
		
		vendorPayment.getClickDateTypeDropDown().click();
		
		vendorPayment.getSelectDateType().click();
		BrowserDriver.wait(3);
		
		vendorPayment.getClickDealerZoneDropDown().click();
		BrowserDriver.wait(3);
		
		vendorPayment.getSelectDealerZone().click();
		BrowserDriver.wait(3);
		
		vendorPayment.getClickDealerStateDropDown().click();
		
		vendorPayment.getSelectDealerState().click();
		BrowserDriver.wait(3);
		
		
		vendorPayment.getClickDealerCityDropDown().click();
		BrowserDriver.wait(3);
		
		vendorPayment.getSelectDealerCity().click();
		BrowserDriver.wait(3);
		
		
		vendorPayment.getClickDealerDropDown().click();
		BrowserDriver.wait(3);
		vendorPayment.getSelectDealer().click();
		BrowserDriver.wait(3);
		return this;
	}
	
//////////calendar //////////////////////
		
		public VendorPaymentService clickCalendarType() {
			BrowserDriver.wait(2);
			CalendarService.CalendarCode();
			return this;
		}
		/////////////////////////////////////////////////////////////////////

		public VendorPaymentService clickButtons() {
			BrowserDriver.wait(2);
		
		vendorPayment.getClickSubmitButton().click();
		BrowserDriver.wait(8);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		vendorPayment.getClickRestButton().click();
		BrowserDriver.wait(7);
		return this;
		}
		public static void init() {
			vendorPayment = PageFactory.initElements(BrowserDriver.getCurrentDriver(), VendorPayment.class);
		}
		
}