package com.poc.atf.services;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.DeliveredConsignments;
import com.poc.atf.pageobjects.Intransit_consignments;
import com.poc.atf.pageobjects.LoginPageContainer;
import com.poc.atf.pageobjects.SummaryDashboard;

public class SummaryDashboardService {
	
	public static SummaryDashboard summaryDashboard;
	
	public SummaryDashboardService clickSeletType() {
		BrowserDriver.wait(1);
		summaryDashboard.getClickSideMenu().click();
		BrowserDriver.wait(1);
		summaryDashboard.getClickSummaryDashboardMenu().click();
		BrowserDriver.wait(3);
		summaryDashboard.getClickConsignerDropdown().click();
		BrowserDriver.wait(1);
		summaryDashboard.getSelectConsignerName().click();
		BrowserDriver.wait(1);
		return this;
	}
//////////calendar //////////////////////
		
		public SummaryDashboardService clickCalendarType() {
			BrowserDriver.wait(2);
			CalendarService.CalendarCode();
			return this;
		}
		/////////////////////////////////////////////////////////////////////
		
		public SummaryDashboardService DealerDropdowns() 
		{
		
		summaryDashboard.getClickDataDropdown().click();
		BrowserDriver.wait(1);
		summaryDashboard.getSelectkDataDropdown().click();
		BrowserDriver.wait(1);
		summaryDashboard.getClickTransporterDropdown().click();
		BrowserDriver.wait(1);
		summaryDashboard.getSelectTransporterName().click();
		BrowserDriver.wait(1);
		summaryDashboard.getClickZoneDropdown().click();
		BrowserDriver.wait(1);
		summaryDashboard.getSelectZoneName().click();
		BrowserDriver.wait(1);
		summaryDashboard.getClickStateDropdown().click();
		BrowserDriver.wait(1);
		summaryDashboard.getSelectStateName().click();
		BrowserDriver.wait(1);
		summaryDashboard.getClickCityDropdown().click();
		BrowserDriver.wait(1);
		summaryDashboard.getSelectCityName().click();
		BrowserDriver.wait(1);
		summaryDashboard.getClickDealreDropdown().click();
		BrowserDriver.wait(1);
		summaryDashboard.getSelectDealreDropdown().click();
		BrowserDriver.wait(1);
		summaryDashboard.getClickSubmitbutton().click();
		BrowserDriver.wait(1);
			
		
	return this;
}
	public static void init() {
		summaryDashboard = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SummaryDashboard.class);
	}
	}