package com.poc.atf.services;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.OverspeedReport;
   public class OverSpeedReportService {
    public static OverspeedReport overSpeedReport;
	
	public OverSpeedReportService clickSeletType() {
		BrowserDriver.wait(5);
		overSpeedReport.getClickSideMenu().click();
		overSpeedReport.getClickTrackandTraceMenu().click();
		overSpeedReport.getClickReportsMenu().click();
		overSpeedReport.getClickOverSpeedMenu().click();
		BrowserDriver.wait(3);
		overSpeedReport.getClickVinNoDropDown().click();
		BrowserDriver.wait(3);
		overSpeedReport.getSelectVinNo().click();
		return this;

}
//////////calendar //////////////////////
	
	public OverSpeedReportService clickCalendarType() {
		BrowserDriver.wait(2);
		Calendar2Service.CalendarCode2();
		return this;
	}
   
	/////////////////////////////////////////////////////////////////////
	public OverSpeedReportService clickButtons() {
		BrowserDriver.wait(2);
		
		overSpeedReport.getClickSubmitButton().click();
		return this;
	}
	
	public static void init() {
		overSpeedReport = PageFactory.initElements(BrowserDriver.getCurrentDriver(), OverspeedReport.class);
	}
	
}