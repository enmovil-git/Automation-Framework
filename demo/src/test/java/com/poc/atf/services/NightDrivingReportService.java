package com.poc.atf.services;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.NightDrivingReport;
public class NightDrivingReportService {
public static NightDrivingReport nightDrivingReport;
	
	public NightDrivingReportService clickSeletType() {
		BrowserDriver.wait(5);
		
		nightDrivingReport.getClickSideMenu().click();
		BrowserDriver.wait(1);
		nightDrivingReport.getClickTrackandTraceMenu().click();
		BrowserDriver.wait(1);
		nightDrivingReport.getClickReportsMenu().click();
		BrowserDriver.wait(2);
		nightDrivingReport.getClickNightDrivingReports().click();
		BrowserDriver.wait(3);
		nightDrivingReport.getClickVinNoDropDown().click();
		BrowserDriver.wait(3);
		nightDrivingReport.getSelectVinNo().click();
		BrowserDriver.wait(3);
		return this;
		

}
	
//////////calendar //////////////////////
	
public NightDrivingReportService clickCalendarType() {
	BrowserDriver.wait(2);
	Calendar2Service.CalendarCode2();
	return this;
}

/////////////////////////////////////////////////////////////////////
public NightDrivingReportService clickButtons() {
	BrowserDriver.wait(2);
	
	nightDrivingReport.getClickSubmitButton().click();
	return this;
}

public static void init() {
	nightDrivingReport = PageFactory.initElements(BrowserDriver.getCurrentDriver(), NightDrivingReport.class);
}

}
