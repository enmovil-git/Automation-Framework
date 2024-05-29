package com.poc.atf.services;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.poc.atf.config.Browser;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.Intransit_consignments;
import com.poc.atf.pageobjects.LoginPageContainer;

public class IntransitConsignmenstService {
	
	public static Intransit_consignments intransitconsignments;
	
	private void highlightAndClick(WebElement element) {
        BrowserDriver.highlightElement(element);
        element.click();
	}
	
	public IntransitConsignmenstService clickSeletType() {
		BrowserDriver.wait(3);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(20);
		WebElement getvin = intransitconsignments.getClickgetvin();
		String vin = getvin.getText();
		BrowserDriver.wait(4);
		highlightAndClick(intransitconsignments.getClickSelectType());
		BrowserDriver.wait(1);
		highlightAndClick(intransitconsignments.getSelectVinNumber());
		

		BrowserDriver.wait(1);
		intransitconsignments.getEnterVinNumber().sendKeys(vin);
		BrowserDriver.wait(1);
		highlightAndClick(intransitconsignments.getClickSubmitButton1());
		BrowserDriver.wait(2);
		highlightAndClick(intransitconsignments.getClickResetButton());
		BrowserDriver.wait(1);
		return this;
	}
		
		////////// calendar //////////////////////
		
		public IntransitConsignmenstService clickCalendarType() {
			BrowserDriver.wait(2);
			CalendarService.CalendarCode();
			return this;
		}
		/////////////////////////////////////////////////////////////////////
		
		
		public IntransitConsignmenstService DealerDropdowns() 
		{
			highlightAndClick(intransitconsignments.getClickDealerzone());
			highlightAndClick(intransitconsignments.getSelectDealerZone());
			highlightAndClick(intransitconsignments.getClickDealerState());
			highlightAndClick(intransitconsignments.getSelectDealerState());
		// BrowserDriver.waitForPageElementLoad(ExpectedConditions.visibilityOf(intransitconsignments.getClickDealerCity()));
		highlightAndClick(intransitconsignments.getClickDealerCity());
		highlightAndClick(intransitconsignments.getSelectDealerCity());
		highlightAndClick(intransitconsignments.getClcikDealerName());
		highlightAndClick(intransitconsignments.getSelectDealerName());
		highlightAndClick(intransitconsignments.getClickSubmitButton1());
		BrowserDriver.wait(4);
		highlightAndClick(intransitconsignments.getClickOkButton());
		BrowserDriver.wait(1);
		highlightAndClick(intransitconsignments.getClickResetButton2ndTime());
		BrowserDriver.wait(1);
		highlightAndClick(intransitconsignments.getClickConsignmentsKpi());
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		highlightAndClick(intransitconsignments.getClickTransitDelayKpi());
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		highlightAndClick(intransitconsignments.getOverSpeedKpi());
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		highlightAndClick(intransitconsignments.getClickNightDrivingKpi());
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		highlightAndClick(intransitconsignments.getClickStoppagesKpi());
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		highlightAndClick(intransitconsignments.getClickAccidentKpi());
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		highlightAndClick(intransitconsignments.getClickTripDeviationsKpi());
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		highlightAndClick(intransitconsignments.getClickLSPDeviationsKpi());
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		return this;
		
	}
	
	
	
	public static void init() {
		intransitconsignments = PageFactory.initElements(BrowserDriver.getCurrentDriver(), Intransit_consignments.class);
	}
	}
