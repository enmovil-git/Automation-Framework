package com.poc.atf.services;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.DistanceTravelledreport;
import com.poc.atf.pageobjects.EnrouterStoppageReport;

public class DistanceTravelledReportService {
	
public static DistanceTravelledreport distanceTravelledreport;
	
	public DistanceTravelledReportService clickSeletType() {
		BrowserDriver.wait(5);
		
		distanceTravelledreport.getClickSideMenu().click();
		BrowserDriver.wait(1);
		//distanceTravelledreport.getClickTrackandTraceMenu().click();
		BrowserDriver.wait(1);
	//	distanceTravelledreport.getClickReportsMenu().click();
		BrowserDriver.wait(2);
		distanceTravelledreport.getClickDistanceTravelledReportsMenu().click();
		BrowserDriver.wait(4);
		distanceTravelledreport.getClickTransporterDropDown().click();
		BrowserDriver.wait(2);
		distanceTravelledreport.getSelectTransporter().click();
		BrowserDriver.wait(1);
		return this;

}
//////////calendar //////////////////////
	
	public DistanceTravelledReportService clickCalendarType() {
		BrowserDriver.wait(2);
		CalendarService.CalendarCode();
		return this;
	}

	/////////////////////////////////////////////////////////////////////

public DistanceTravelledReportService clickButtons() {
    BrowserDriver.wait(2);
    distanceTravelledreport.getClickSubmitButton().click();
    return this;
}

public static void init() {
	distanceTravelledreport = PageFactory.initElements(BrowserDriver.getCurrentDriver(), DistanceTravelledreport.class);
}

}