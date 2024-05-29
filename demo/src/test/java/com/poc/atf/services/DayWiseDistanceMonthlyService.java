package com.poc.atf.services;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.DayWiseDistanceMonthly;
public class DayWiseDistanceMonthlyService {
	
public static DayWiseDistanceMonthly dayWiseDistanceMonthly;
	
	public DayWiseDistanceMonthlyService clickSeletType() {
		BrowserDriver.wait(5);
		
		dayWiseDistanceMonthly.getClickSideMenu().click();
		BrowserDriver.wait(1);
		//dayWiseDistanceMonthly.getClickTrackandTraceMenu().click();
		BrowserDriver.wait(1);
		//dayWiseDistanceMonthly.getClickReportsMenu().click();
		BrowserDriver.wait(2);
		dayWiseDistanceMonthly.getClickDayWiseDistance().click();
		BrowserDriver.wait(2);
		dayWiseDistanceMonthly.getClickMonthDropdown().click();
		BrowserDriver.wait(2);
		dayWiseDistanceMonthly.getSelectMonth().click();
		BrowserDriver.wait(2);
		dayWiseDistanceMonthly.getClickYearDropdown().click();
		BrowserDriver.wait(2);
		dayWiseDistanceMonthly.getSelectYear().click();
		BrowserDriver.wait(2);
		dayWiseDistanceMonthly.getClickSubmitButton().click();
		
		return this;

}

public static void init() {
	dayWiseDistanceMonthly = PageFactory.initElements(BrowserDriver.getCurrentDriver(), DayWiseDistanceMonthly.class);
}

}