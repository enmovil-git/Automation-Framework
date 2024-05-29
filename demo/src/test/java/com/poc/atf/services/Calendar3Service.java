package com.poc.atf.services;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.Calendar3;
public class Calendar3Service {
	public static Calendar3 calendar3;

	public static void CalendarCode3() {
//////////calendar //////////////////////
		
		calendar3.getClickFromDateCalendar().click();
		
		// Month Year Header
		calendar3.getClickMonthYear().click();
		BrowserDriver.wait(1);
		
		//year header
		calendar3.getClickYearHeader().click();
		BrowserDriver.wait(1);
		
		// select year
		calendar3.getSelectYear().click();
		BrowserDriver.wait(1);
		
		//select month
		calendar3.getSelectMonth().click();
		BrowserDriver.wait(1);
	
		// select date
		calendar3.getSelectDate().click();
		BrowserDriver.wait(1);
		
		
		
		// To Date calendar 
		calendar3.getClickToDateCalendar().click();
		
		// Month Year Header
		calendar3.getClickTodateMonthYear().click();
		BrowserDriver.wait(1);
		
		//year header
		calendar3.getClickTodateYearHeader().click();
		BrowserDriver.wait(1);
		
		// select year
		calendar3.getSelectTodateYear().click();
		BrowserDriver.wait(1);
		
		//select month
		calendar3.getSelectTodateMonth().click();
		BrowserDriver.wait(1);
	
		// select date
		calendar3.getSelectToDate().click();
		BrowserDriver.wait(1);
			
		
		
	}
	
	public static void init() {
		calendar3 = PageFactory.initElements(BrowserDriver.getCurrentDriver(), Calendar3.class);
	}
	
}



