package com.poc.atf.services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.AllConsignments;


public class AllConsignmenstService {
	
	public static AllConsignments allConsignments;
	
	private void highlightAndClick(WebElement element) {
        BrowserDriver.highlightElement(element);
        element.click();
    }
	
	public AllConsignmenstService clickSeletType() {
		BrowserDriver.wait(5);
		BrowserDriver.waitForPageElementLoad(ExpectedConditions.visibilityOf(allConsignments.getClickAllTab()));
		BrowserDriver.waitForPageElement(allConsignments.getClickAllTab(), null);
//		allConsignments.getClickAllTab().click();
		highlightAndClick(allConsignments.getClickAllTab());
		BrowserDriver.wait(10);
		allConsignments.getClickSelectType().click();
		BrowserDriver.wait(3);
		allConsignments.getSelectInvoiceNumber().click();
		BrowserDriver.wait(1);
		allConsignments.getEnterDeliveryNumber().sendKeys("81657099");
		BrowserDriver.wait(1);
		allConsignments.getClickSubmitButton1().click();
		BrowserDriver.wait(2);
		allConsignments.getClickResetButton1().click();
		BrowserDriver.wait(3);
		return this;
	}
		
//////////calendar //////////////////////
		
		public AllConsignmenstService clickCalendarType() {
			BrowserDriver.wait(2);
			CalendarService.CalendarCode();
			return this;
		}
		/////////////////////////////////////////////////////////////////////
		
		
		
		public AllConsignmenstService DealerDropdowns() 
		{
		allConsignments.getClickDealerzone().click();
		allConsignments.getSelectDealerZone().click();
		allConsignments.getClickDealerState().click();
		allConsignments.getSelectDealerState().click();
		BrowserDriver.waitForPageElementLoad(ExpectedConditions.visibilityOf(allConsignments.getClickDealerCity()));
		allConsignments.getClickDealerCity().click();
		allConsignments.getSelectDealerCity().click();
		allConsignments.getClcikDealerName().click();
		allConsignments.getSelectDealerName().click();
		allConsignments.getClickSubmitButton1().click();
		allConsignments.getClickOkButton().click();
		BrowserDriver.wait(1);
		allConsignments.getClickResetButton2ndTime().click();
		BrowserDriver.wait(1);
		
		allConsignments.getClickConsignmentsKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		
		
		allConsignments.getClickTransitDelayKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		allConsignments.getClickOverSpeedKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		allConsignments.getClickNightDrivingKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		allConsignments.getClickStoppagesKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		allConsignments.getClickAccidentsKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		allConsignments.getClickTripDeviationsKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		allConsignments.getClickLSPDeviationsKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		return this;
		
	}


	public static void init() {
		allConsignments = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AllConsignments.class);
	}
	}
