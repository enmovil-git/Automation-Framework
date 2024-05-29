package com.poc.atf.services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.DeliveredConsignments;
import com.poc.atf.pageobjects.Intransit_consignments;
import com.poc.atf.pageobjects.LoginPageContainer;

public class DeliveredConsignmenstService {
	
	public static DeliveredConsignments deliveredConsignments;
	
	public DeliveredConsignmenstService clickSeletType() {
		BrowserDriver.wait(5);
		BrowserDriver.waitForPageElementLoad(ExpectedConditions.visibilityOf(deliveredConsignments.getClickDeliveredTab()));
		BrowserDriver.waitForPageElement(deliveredConsignments.getClickDeliveredTab(), null);
		deliveredConsignments.getClickDeliveredTab().click();
		BrowserDriver.wait(1);
		deliveredConsignments.getClickSelectType().click();
		BrowserDriver.wait(3);
		deliveredConsignments.getSelectInvoiceNumber().click();
		BrowserDriver.wait(1);
		deliveredConsignments.getEnterInvoiceNumber().sendKeys("1635296111");
		BrowserDriver.wait(1);
		deliveredConsignments.getClickSubmitButton1().click();
		BrowserDriver.wait(2);
		deliveredConsignments.getClickResetButton1().click();
		BrowserDriver.wait(3);
		
		return this;
	}
		
	////////// calendar //////////////////////
		
		public DeliveredConsignmenstService clickCalendarType() {
			BrowserDriver.wait(2);
			CalendarService.CalendarCode();
			return this;
		}
		/////////////////////////////////////////////////////////////////////
		
		public DeliveredConsignmenstService DealerDropdowns() 
		{
			
		deliveredConsignments.getClickDealerzone().click();
		deliveredConsignments.getSelectDealerZone().click();
		deliveredConsignments.getClickDealerState().click();
		deliveredConsignments.getSelectDealerState().click();
		BrowserDriver.waitForPageElementLoad(ExpectedConditions.visibilityOf(deliveredConsignments.getClickDealerCity()));
		deliveredConsignments.getClickDealerCity().click();
		deliveredConsignments.getSelectDealerCity().click();
		deliveredConsignments.getClcikDealerName().click();
		deliveredConsignments.getSelectDealerName().click();
		deliveredConsignments.getClickSubmitButton1().click();
		deliveredConsignments.getClickOkButton().click();
		BrowserDriver.wait(1);
		deliveredConsignments.getClickResetButton2ndTime().click();
		BrowserDriver.wait(1);
		deliveredConsignments.getClickConsignmentsKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		deliveredConsignments.getClickOntimeKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		deliveredConsignments.getClickTransitDelayKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		deliveredConsignments.getOverSpeedKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		deliveredConsignments.getClickNightDrivingKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		deliveredConsignments.getClickStoppagesKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		deliveredConsignments.getClickAccidentKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		deliveredConsignments.getClickTripDeviationsKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		deliveredConsignments.getClickLSPDeviationsKpi().click();
		BrowserDriver.wait(1);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		return this;
		
	}


	public static void init() {
		deliveredConsignments = PageFactory.initElements(BrowserDriver.getCurrentDriver(), DeliveredConsignments.class);
	}
	}
