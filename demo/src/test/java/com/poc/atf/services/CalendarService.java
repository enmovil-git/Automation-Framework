package com.poc.atf.services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.Calendar;



public class CalendarService {

	public static Calendar calendar;
	
	private static void highlightAndClick(WebElement element) {
        BrowserDriver.highlightElement(element);
        element.click();
	}

	public static void CalendarCode() {
//////////calendar //////////////////////
		
		
		highlightAndClick(calendar.getClickFromDateCalendar());
		
		// Month Year Header
		highlightAndClick(calendar.getClickMonthYear());
		BrowserDriver.wait(1);
		
		//year header
		highlightAndClick(calendar.getClickYearHeader());
		BrowserDriver.wait(1);
		
		// select year
		highlightAndClick(calendar.getSelectYear());
		BrowserDriver.wait(1);
		
		//select month
		highlightAndClick(calendar.getSelectMonth());
		BrowserDriver.wait(1);
	
		// select date
		highlightAndClick(calendar.getSelectDate());
		BrowserDriver.wait(1);
		
		
		
		// To Date calendar 
		highlightAndClick(calendar.getClickToDateCalendar());
		
		// Month Year Header
		highlightAndClick(calendar.getClickTodateMonthYear());
		BrowserDriver.wait(1);
		
		//year header
		highlightAndClick(calendar.getClickTodateYearHeader());
		BrowserDriver.wait(1);
		
		// select year
		highlightAndClick(calendar.getSelectTodateYear());
		BrowserDriver.wait(1);
		
		//select month
		highlightAndClick(calendar.getSelectTodateMonth());
		BrowserDriver.wait(1);
	
		// select date
		highlightAndClick(calendar.getSelectToDate());
		BrowserDriver.wait(1);
			
		
		
	}
	
	public static void init() {
		calendar = PageFactory.initElements(BrowserDriver.getCurrentDriver(), Calendar.class);
	}
	
}
