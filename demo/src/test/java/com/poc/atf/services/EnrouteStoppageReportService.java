package com.poc.atf.services;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.EnrouterStoppageReport;


public class EnrouteStoppageReportService {
public static EnrouterStoppageReport enrouterStoppageReport;
	
	public EnrouteStoppageReportService clickSeletType() {
		BrowserDriver.wait(5);
		
		enrouterStoppageReport.getClickSideMenu().click();
		BrowserDriver.wait(1);
	//	enrouterStoppageReport.getClickTrackandTraceMenu().click();
		BrowserDriver.wait(1);
	//	enrouterStoppageReport.getClickReportsMenu().click();
		BrowserDriver.wait(2);
		enrouterStoppageReport.getClickEnrouteStoppageReports().click();
		BrowserDriver.wait(4);
		enrouterStoppageReport.getClickDuration().click();
		BrowserDriver.wait(2);
		enrouterStoppageReport.getSelectDuration().click();
		BrowserDriver.wait(4);
		return this;
		
	}	

//////////calendar //////////////////////
	
     public EnrouteStoppageReportService clickCalendarType() {
             BrowserDriver.wait(2);
             Calendar2Service.CalendarCode2();
            return this;
}

/////////////////////////////////////////////////////////////////////
           public EnrouteStoppageReportService clickButtons() {
           BrowserDriver.wait(2);
         enrouterStoppageReport.getClickSubmitButton().click();
           return this;
}

      public static void init() {
	enrouterStoppageReport = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EnrouterStoppageReport.class);
}

}
