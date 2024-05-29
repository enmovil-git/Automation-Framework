package com.poc.atf.services;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.GeoFenceInOut;
import com.poc.atf.pageobjects.TollDetails;

public class TollDetailsService {

		public static TollDetails tollDetails;
		
		public TollDetailsService clickSeletType() {
			BrowserDriver.wait(3);
			
			tollDetails.getClickSideMenu().click();
			BrowserDriver.wait(3);
			
			tollDetails.getClickUtilities().click();
			BrowserDriver.wait(3);
			
			tollDetails.getClickTollDetails().click();
			BrowserDriver.wait(5);
			return this;
		}
		
		
		
		public static void init() {
			tollDetails = PageFactory.initElements(BrowserDriver.getCurrentDriver(), TollDetails.class);
		}
		}
