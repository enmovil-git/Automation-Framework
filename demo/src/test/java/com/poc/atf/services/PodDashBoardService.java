package com.poc.atf.services;

import org.openqa.selenium.support.PageFactory;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.PodDashBoard;
import com.poc.atf.pageobjects.TollDetails;


public class PodDashBoardService {
	
	public static PodDashBoard podDashBoard;
	
	public PodDashBoardService clickSeletType() {
		BrowserDriver.wait(3);
		
		podDashBoard.getClickSideMenu().click();
		BrowserDriver.wait(3);
		
		podDashBoard.getClickPodMenu().click();
		BrowserDriver.wait(3);
		
		podDashBoard.getClickPodDashBoard().click();
		BrowserDriver.wait(3);
		
		podDashBoard.getClickTotalPODSKPI().click();
		BrowserDriver.wait(3);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		podDashBoard.getClickPendingPODSKPI().click();
		BrowserDriver.wait(3);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		podDashBoard.getClickPODSSubmittedKPI().click();
		BrowserDriver.wait(3);BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		podDashBoard.getClickWithDefectsKPI().click();
		BrowserDriver.wait(3);BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		podDashBoard.getClickWithOutDefectsKPI().click();
		BrowserDriver.wait(3);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		
		podDashBoard.getClickPodApprovedsKPI().click();
		BrowserDriver.wait(3);
		BrowserDriver.scrollDown();
		BrowserDriver.wait(1);
		BrowserDriver.scrollUp();
		return this;

}
	
	////////// calendar //////////////////////
		
		public PodDashBoardService clickCalendarType() {
			BrowserDriver.wait(2);
			CalendarService.CalendarCode();
			return this;
		}
		/////////////////////////////////////////////////////////////////////
		
		public PodDashBoardService DealerDropdowns() 
		{
			
			podDashBoard.getClickDealerDropDOwn().click();
			podDashBoard.getSelectDealerName().click();
			
			podDashBoard.getClickSubmitButton().click();
			
			return this;
	}
		
		
		
		public static void init() {
			podDashBoard = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PodDashBoard.class);
		}
		}